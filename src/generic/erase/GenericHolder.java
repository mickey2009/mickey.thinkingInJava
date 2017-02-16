package generic.erase;

/**
 * Created by Mickey on 2017/2/14.
 * 编译器在边界处插入转型代码和类型检查代码
 */
public class GenericHolder<T> {
    private T obj;
    public  void set(T obj){
        this.obj = obj;
    }
    public  T get(){
        return  obj;
    }
    public  static  void main(String[] args){
        GenericHolder<String> holder = new GenericHolder<>();
        holder.set("Hello");
        String m = holder.get(); //插入检查代码
        System.out.println(m);   //插入转型代码 由Object转型为String
    }
}
