package rtti;

import java.util.Random;

/**
 * Created by Mickey on 2017/2/13.
 * 类型字面量 Type.Class。
 */
class  Initable{
    static  final int staticFinal = 47;
    static  final int staticFinal2 =ClassInitialization.rand.nextInt(20);
    static {
        System.out.println("Initializing Initable");
    }
}

class  Initable2{
    static   int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class  Initable3{
    static  int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public  static  Random rand = new Random(47);
    public  static  void main(String[] args) throws  Exception{
        //对.class的调用和编译时常量的调用，不会导致类的加载
        Class c = Initable.class;
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);

        //非编译常量的调用导致类的加载
        System.out.println(Initable2.staticNonFinal);

        //对Class.forName("")的调用会导致类的加载
        c = Class.forName("rtti.Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}
