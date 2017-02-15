package threads.concurrent.generator;

import threads.concurrent.EvenChecker;
import threads.concurrent.IntGenerator;

/**
 * Created by Mickey on 2017/2/15.
 * 添加synchronized，同步访问共享资源
 */
public class SynchronizedEvenGenerator extends IntGenerator {
    private  int currentEvenValue = 0 ;
    @Override
    public synchronized int next() {
        currentEvenValue++;
        Thread.yield();
        currentEvenValue++;
        return  currentEvenValue;
    }

    public  static  void main(String[] args){
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
