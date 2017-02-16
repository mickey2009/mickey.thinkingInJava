package threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mickey on 2017/2/15.
 * 主线程关闭后， 后台线程也会终止而且不会执行finally语句
 */
class  ADeamon implements  Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Starting ADeamon");
            TimeUnit.MICROSECONDS.sleep(100);
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
            throw  new RuntimeException(e);
        }finally {
            System.out.println("Finally ADeamon");
        }
    }
}
public class DeamonsDontRunFinally {
    public  static  void main(String[] args){
        Thread thread = new Thread(new ADeamon());
        thread.setDaemon(true);
        thread.start();
        try{
            TimeUnit.MICROSECONDS.sleep(1);
        }catch (InterruptedException e){

        }
    }
}
