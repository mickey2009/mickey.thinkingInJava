package threads.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mickey on 2017/2/16.
 */
public class DeadLockingDiningPhilosopher {
    public  static  void main(String[] args) throws  Exception{
        int size = 5;
        ChopStick[] chopSticks = new ChopStick[size];
        for (int i = 0 ; i < chopSticks.length ; i ++){
            chopSticks[i] = new ChopStick();
        }

        Philosopher[] philosophers = new Philosopher[size];
        for (int i = 0 ; i < philosophers.length ; i ++){
            philosophers[i] = new Philosopher(chopSticks[i] , chopSticks[(i + 1)%size] , i);
        }

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0 ; i < size ; i ++){
            exec.execute(philosophers[i]);
        }

        TimeUnit.SECONDS.sleep(600);
        exec.shutdownNow();
    }
}
