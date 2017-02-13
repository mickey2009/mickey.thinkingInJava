package generic;

/**
 * Created by Mickey on 2017/2/14.
 */
public class Fibonacci implements  Generator<Integer> {

    @Override
    public Integer next() {
        return  fib(count++);
    }

    private int fib(int n){
        if(n<2) return  1;
        return fib(n-2) + fib(n-1);
    }

    private  int count = 0;

    public static  void main(String[] args){
        Fibonacci fib = new Fibonacci();
        for(int i = 0 ; i < 18 ; i ++){
            System.out.println(fib.next());
        }
    }
}
