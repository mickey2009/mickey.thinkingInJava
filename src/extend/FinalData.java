package extend;

import java.util.Random;

/**
 * Created by Mickey on 2017/2/13.
 * Final域：定义常量
 * Final方法：不能被覆盖
 * Final类:不能被继承
 */

class  Value{
    int i ;
    public Value(int i){
        this.i = i;
    }
}

public class FinalData {
    private static Random r = new Random(47);
    private String id ;
    public  FinalData(String id){
        this.id = id;
        j = 8;
    }

    //编译时常量
    private final  int VALUE_ONE  = 9;
    public static  final  int VALUE_TWO = 99;

    //运行时常量
    private final int I4 = r.nextInt(20);
    private static  final  int T5 = r.nextInt(20);

    //引用不能变化，但是引用指向的内容是可以变的
    private final  Value VALUE_THREE = new Value(1);
    private final int[] INT6 = new int[] {1,2,3,4};

    //空白final,必须在构造函数中赋初始值
    private  final  int j ;
}
