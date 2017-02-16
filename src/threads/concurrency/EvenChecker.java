package threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mickey on 2017/2/15.
 */
public class EvenChecker implements Runnable {
    private IntGenerator intGenerator;
    private final int id;

    public EvenChecker(IntGenerator intGenerator, int id) {
        this.intGenerator = intGenerator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!intGenerator.isCanceled()){
            int val = intGenerator.next();
            if(val % 2 != 0){
                System.out.println(val + " is not even");
                intGenerator.cancel();
            }
        }
    }

    public  static  void test(IntGenerator intGenerator , int count){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0 ; i <count ; i ++){
            exec.execute(new EvenChecker(intGenerator , i));
        }
        exec.shutdown();
        try{
            TimeUnit.SECONDS.sleep(5);
            exec.awaitTermination(2 ,TimeUnit.SECONDS);
        }catch (InterruptedException e){

        }
    }

    public  static  void test(IntGenerator intGenerator ){
        test(intGenerator , 10);
    }
}
