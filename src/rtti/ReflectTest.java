package rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Mickey on 2017/2/14.
 * Class.getMethods(), Class.getConstructor , Class.getFields
 */
public class ReflectTest {
    public  static  void main(String[] args){
        Class<?>  c= ReflectTest.class;
        Method[] methods = c.getMethods();
        Constructor[] constructors = c.getConstructors();
        for (Method method:methods) {
            System.out.println(method);
        }
        for (Constructor constructor:constructors) {
            System.out.println(constructor);
        }
    }
}
