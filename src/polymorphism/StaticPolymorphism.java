package polymorphism;

/**
 * Created by Mickey on 2017/2/13.
 * 静态方法不会发生多态行为
 */
class StaticSuper{
    public  static  String staticGet(){
        return  "Base staticGet()";
    }

    public  String dynamicGet(){
        return  "Base dynamicGet()";
    }
}

class  StaticSub extends  StaticSuper{
    public  static  String staticGet(){
        return  "Derived staticGet()";
    }

    public  String dynamicGet(){
        return  "Derived dynamicGet()";
    }
}

public class StaticPolymorphism {
    public  static void main(String[] args){
        StaticSuper sup = new StaticSub();
        System.out.println(sup.dynamicGet());
        System.out.println(sup.staticGet());
    }
}

