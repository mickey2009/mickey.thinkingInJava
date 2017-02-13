package polymorphism;

/**
 * Created by Mickey on 2017/2/13.
 * 构造函数中调用的方法也可以多态调用，导致访问的子类的域并未被初始化
 */
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    public  Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class  RoundGlyph extends   Glyph{
    private  int radius = 1 ;
    public RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph() , radius = " + radius);
    }

    void draw(){
        System.out.println("RoundGlyph.draw() , radius = " + radius);
    }
}
public class PolyConstructure {
    public  static  void main(String[] args){
        new RoundGlyph(5);
    }
}
