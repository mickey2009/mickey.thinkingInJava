package threads.deadlock;

/**
 * Created by Mickey on 2017/2/16.
 */
public class ChopStick {
    private boolean taken = false;

    public synchronized void take() throws InterruptedException {
        while (taken == true) {
            wait();
        }
        taken = true;
    }

    public synchronized void drop() throws InterruptedException {
        taken = false;
        notifyAll();
    }
}
