package rtti;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Mickey on 2017/2/14.
 * 生成动态代理对象。
 * 对接口的调用会被代理对象执行。
 */
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("the mothod is proxied");
        return method.invoke(proxied, args);
    }
}

interface Interface {
    void dosomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {

    @Override
    public void dosomething() {
        System.out.println("dosomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse");
    }
}

public class SimpleDynamicProxy {
    public static void consume(Interface face) {
        face.dosomething();
        face.somethingElse("hoho");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consume(realObject);

        Interface face = (Interface) Proxy.newProxyInstance(SimpleDynamicProxy.class.getClassLoader(),
                new Class[]{Interface.class}, new DynamicProxyHandler(realObject));
        consume(face);
    }
}
