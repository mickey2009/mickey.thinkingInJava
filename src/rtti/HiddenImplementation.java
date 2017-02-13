package rtti;

import java.lang.reflect.Method;

/**
 * Created by Mickey on 2017/2/14.
 * 通过反射可以访问私有域和私有方法。
 */
interface A {
    void f();
}

class C implements A {
    @Override
    public void f() {
        System.out.println("public C.f()");
    }

    public void g() {
        System.out.println("public C.g()");
    }

    protected void u() {
        System.out.println("protected C.u()");
    }

    void v() {
        System.out.println("c.v()");
    }

    private void w() {
        System.out.println("private C.w()");
    }
}

class  HiddenC{
    public  static  A makeA(){ return new C();}
}

public class HiddenImplementation {
    public  static  void main(String[] args)throws Exception{
        A a = HiddenC.makeA();
        a.f();
        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");

    }

    public  static  void callHiddenMethod(Object a , String methodName) throws Exception{
        Method method = a.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(a);
    }
}
