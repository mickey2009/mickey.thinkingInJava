package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 /**
 * Created by Mickey on 2017/2/13.
  * List: ArrayList , LinkedList
 * 接口: add() , get(), remove() , set() , contains() , indexOf()等方法
 */
public class ListTest {
    public  static  void main(String[] args){
        //asList生成List , 可以直接打印容器
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list);

        //运行时异常
        //list.add(5);

        //Collection接受另一个Collection作为构造函数的参数
        List<Integer> list2 = new ArrayList<Integer>(list);
        list2.add(6);
        System.out.println(list2);

        //打印数组需要调用Arrays.toString
        int[] list3 = new int[] {1,2,3};
        System.out.println(Arrays.toString(list3));
    }
}
