package threads.concurrency.generator;

import threads.concurrency.EvenChecker;
import threads.concurrency.IntGenerator;

/**
 * Created by Mickey on 2017/2/15.
 */
public class SynchronizedBlockEvenGenerator extends IntGenerator{
    private  int currentEvenValue = 0 ;
    @Override
    public int next() {
        synchronized (this){
            currentEvenValue++;
            Thread.yield();
            currentEvenValue++;
            return  currentEvenValue;
        }
    }

    public  static  void main(String[] args){
        EvenChecker.test(new SynchronizedBlockEvenGenerator());
    }
}
