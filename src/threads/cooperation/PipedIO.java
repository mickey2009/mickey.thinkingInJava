package threads.cooperation;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mickey on 2017/2/15.
 * 使用管道进行线程间的通信
 */
class Sender implements Runnable {
    private PipedWriter out = new PipedWriter();

    public PipedWriter getPipedWriter() {
        return out;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for (char c = 'A'; c < 'z'; c++) {
                    out.write(c);
                    TimeUnit.MICROSECONDS.sleep(100);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e + "Sender Interrupted Exception");
        } catch (IOException e) {
            System.out.println(e + "Sender Write Exception");
        }
    }
}

class Receiver implements Runnable {
    private PipedReader reader;

    public Receiver(Sender sender) throws IOException {
        reader = new PipedReader(sender.getPipedWriter());
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Read:" + (char) reader.read() + " ");
            }
        } catch (IOException e) {
            System.out.println(e + "Receiver Read Exception");
        }
    }
}

public class PipedIO {
    public static void main(String[] args) throws Exception {
        Sender sender = new Sender();
        Receiver reader = new Receiver(sender);
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(sender);
        exec.execute(reader);
        TimeUnit.SECONDS.sleep(10);
        exec.shutdownNow();
    }
}
