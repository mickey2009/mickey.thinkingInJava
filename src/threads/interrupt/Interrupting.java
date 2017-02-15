package threads.interrupt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mickey on 2017/2/15.
 * 阻塞的场景:sleep() , 等待IO , 等待锁。 其中只有sleep
 */
class SleepBlocked implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("SleepBlocked Interrupted");
        }
        System.out.println("SleepBlocked exit");
    }
}

public class Interrupting {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        Future<?> future = exec.submit(new SleepBlocked());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Send Interrupting to SleepBlocked");
        future.cancel(true);
        System.exit(0);
    }
}
