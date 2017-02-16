package threads.concurrency.generator;

import threads.concurrency.EvenChecker;
import threads.concurrency.IntGenerator;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Mickey on 2017/2/15.
 * 手动添加锁
 */
public class MutexEvenGenerator  extends IntGenerator{
    private  int currentEvenValue = 0 ;
    private Lock lock = new ReentrantLock();

    @Override
    public  int next() {
        lock.lock();
        try{
            currentEvenValue++;
            Thread.yield();
            currentEvenValue++;
            return  currentEvenValue;
        }finally {
            lock.unlock();
        }
    }

    public  static  void main(String[] args){
        EvenChecker.test(new MutexEvenGenerator());
    }
}
