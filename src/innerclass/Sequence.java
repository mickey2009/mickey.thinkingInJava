package innerclass;

/**
 * Created by Mickey on 2017/2/13.
 * 内部类可以访问外部类的成员。 内部类对象一定和一个外部类的对象联系。
 * 将内部类转型为基类， 可以很好的隐藏实现细节.
 * 匿名内部类
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private  int next = 0 ;
    public Sequence(int size){
        items = new Object[size];
    }
    public  void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }

    public  Selector selector(){
        return  new Selector(){
            private  int i = 0;
            @Override
            public boolean end() {return  i == items.length;}

            @Override
            public Object current() {return  items[i];}

            @Override
            public void next() {if(i<items.length) {i++;}}
        };
    }

    public  static  void main(String[] args){
        Sequence sequence = new Sequence(10);
        for (int i = 0 ; i < 10 ; i ++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
