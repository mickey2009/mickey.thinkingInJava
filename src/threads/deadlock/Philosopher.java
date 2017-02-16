package threads.deadlock;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mickey on 2017/2/16.
 */
public class Philosopher implements  Runnable{
    private ChopStick left;
    private ChopStick right;
    private int id;

    public Philosopher(ChopStick left, ChopStick right, int id) {
        this.left = left;
        this.right = right;
        this.id = id;
    }

    public  void pause() throws  InterruptedException{
        TimeUnit.MILLISECONDS.sleep(10);
    }

    @Override
    public void run() {
        try{
            while (!Thread.interrupted()){
                System.out.println(this + " thinking");
                pause();
                System.out.println(this + " take right");
                right.take();
                System.out.println(this + " take left");
                left.take();
                System.out.println(this + " eating");
                pause();
                right.drop();
                left.drop();
            }
        }catch (InterruptedException e){
            System.out.println(this +" exiting from interrupt");
        }
    }

    public String toString(){
        return  "Philosopher" + id;
    }
}
