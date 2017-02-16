package threads.concurrency;

/**
 * Created by Mickey on 2017/2/15.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public void cancel(){
        canceled = true;
    }
    public  boolean isCanceled(){
        return canceled;
    }

    public  abstract int next();
}
