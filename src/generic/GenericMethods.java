package generic;

/**
 * Created by Mickey on 2017/2/14.
 * 定义泛型方法， 在返回值前面声明泛型就可以了。
 * 泛型方法
 */
public class GenericMethods {
    public  <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public  static  void main(String[] args){
        GenericMethods gm = new GenericMethods();
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0f);
        gm.f("1");
        gm.f(gm);
    }
}
