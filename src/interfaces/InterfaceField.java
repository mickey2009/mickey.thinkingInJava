package interfaces;

import java.util.Random;

/**
 * Created by Mickey on 2017/2/13.
 * 接口中的域 自动是 Static final的
 */
interface  RandVals{
    Random R = new Random(47);
    int RANDOM_INT = R.nextInt();
    double RANDOM_DOUBLE = R.nextDouble();
}

public class InterfaceField {
    public  static  void main(String[] args){
        System.out.println(RandVals.RANDOM_DOUBLE);
        System.out.println(RandVals.RANDOM_INT);
    }
}
