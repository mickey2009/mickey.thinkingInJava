package polymorphism;

/**
 * Created by Mickey on 2017/2/13.
 * 私有方法是fianl的， 不会发生多态行为。
 */
public class PrivateOverride {
    private  void f(){
        System.out.println("private f()");
    }
    public  static void main(String[] args){
        PrivateOverride  po = new Derrived();
        po.f();
    }
}

class  Derrived extends  PrivateOverride{
    public  void f(){
        System.out.println("public f()");
    }
}
