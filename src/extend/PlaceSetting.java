package extend;

/**
 * Created by Mickey on 2017/2/13.
 * 编译器会把字段的初始化调用插入到对基类构造函数调用的后面。
 */
class Plate{
    Plate(int i){
        System.out.println("Plate Constructor");
    }
}

class  DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        System.out.println("DinnerPlate Constructor");
    }
}
class Utensil{
    Utensil(int i){
        System.out.println("Utensil Constructor");
    }
}

class Spoon extends  Utensil{
    Spoon(int i){
        super(i);
        System.out.println("Spoon Constructor");
    }
}

class Fork extends  Utensil{
    Fork(int i){
        super(i);
        System.out.println("Fork Constructor");
    }
}

class Knife extends  Utensil{
    Knife(int i){
        super(i);
        System.out.println("Knife Constructor");
    }
}

class Custom{
    Custom(int i){
        System.out.println("Custom Constructor");
    }
}
public class PlaceSetting extends  Custom {
    private Spoon sp = new Spoon(5) ;
    private Fork frk;
    private  Knife kn;
    private  DinnerPlate pl;

    public  PlaceSetting(int i){
        super(i + 1);
        frk = new Fork(i+3);
        kn = new Knife(i+4);
        pl = new DinnerPlate(i+5);
        System.out.println("PlaceSetting Constructor");
    }

    public static void main(String[] args){
        PlaceSetting ps = new PlaceSetting(9);
    }
}
