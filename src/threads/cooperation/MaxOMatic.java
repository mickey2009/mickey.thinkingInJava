package threads.cooperation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mickey on 2017/2/15.
 * 线程的同步控制， 使用wait(),notify(),notifyAll()
 */
class Car {
    private boolean waxOn = false;

    public synchronized void waxed() {
        waxOn = true;
        notify();
    }

    public synchronized void buffed() {
        waxOn = false;
        notify();
    }

    public synchronized void waitingForWaxing() throws InterruptedException {
        while (waxOn == false) {
            wait();
        }
    }

    public synchronized void waitingForBuffing() throws InterruptedException {
        while (waxOn == true) {
            wait();
        }
    }
}

class WaxOn implements Runnable{
    private Car car;
    public WaxOn(Car car){
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()){
                System.out.println("Wax On!");
                TimeUnit.MICROSECONDS.sleep(100);
                car.waxed();
                car.waitingForBuffing();
            }
        }catch (InterruptedException e){
            System.out.println("Exiting via Interrupted");
        }
        System.out.println("Ending Wax On");
    }
}


class WaxOff implements Runnable{
    private Car car;
    public WaxOff(Car car){
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()){
                car.waitingForWaxing();
                System.out.println("Wax Off!");
                TimeUnit.MICROSECONDS.sleep(100);
                car.buffed();
            }
        }catch (InterruptedException e){
            System.out.println("Exiting via Interrupted");
        }
        System.out.println("Ending Wax Off");
    }
}

public class MaxOMatic {
    public  static  void main(String[] args) throws  Exception{
        Car car = new Car();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOn(car));
        exec.execute(new WaxOff(car));
        exec.shutdown();

        TimeUnit.SECONDS.sleep(2);
        exec.shutdownNow();
    }
}
