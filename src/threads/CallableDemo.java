package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Mickey on 2017/2/15.
 * 线程执行完毕后可以带返回值
 */
class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int n) {
        id = n;
    }

    @Override
    public String call() throws Exception {
        return "TaskWithResult :" + id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            futures.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
