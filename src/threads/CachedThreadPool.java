package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Mickey on 2017/2/15.
 * 使用线程池来执行
 * 线程池类型:CachedThreadPool FixedThreadPool SingleThreadExecutor
 */
public class CachedThreadPool {
    public  static  void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0 ; i < 2 ; i ++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
