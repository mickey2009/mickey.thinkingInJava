package threads.concurrency.generator;

import threads.concurrency.EvenChecker;
import threads.concurrency.IntGenerator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Mickey on 2017/2/15.
 */
public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue = new AtomicInteger(0) ;
    @Override
    public int next() {
        return  currentEvenValue.addAndGet(2);
    }

    public  static  void main(String[] args){
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
