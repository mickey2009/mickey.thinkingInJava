package threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mickey on 2017/2/15.
 * 使用Runnable创建任务 ， 使用Thread来启动任务
 * 休眠：TimeUnit.MICROSECONDS.sleep
 * 让步: Thread.yield()
 */
class LiftOff implements Runnable {
    private int countDown = 10;

    public LiftOff() {
    }

    public LiftOff(int count) {
        countDown = count;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff") + "),";
    }

    public static int taskCount = 0;
    final int id = taskCount++;

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
            //TimeUnit.MICROSECONDS.sleep(100);
        }
    }
}

public class MoreBasicThreads {
    public  static  void main(String[] args){
        for (int i = 0 ; i < 2 ; i ++){
            Thread t = new Thread( new LiftOff());
            t.start();
        }
    }
}
