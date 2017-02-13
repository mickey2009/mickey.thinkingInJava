package generic;

/**
 * Created by Mickey on 2017/2/14.
 * 泛型类
 * 使用元组，可以打包返回的多个对象。
 */
public class TwoTuple<A,B> {
    public  final  A first ;
    public  final  B second ;
    public  TwoTuple(A a , B b){
        first = a;
        second = b;
    }
    public  String toString(){
        return  "(" + first + "," + second + ")";
    }
}
