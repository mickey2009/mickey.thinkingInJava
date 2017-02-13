package collections;

import java.util.Iterator;

/**
 * Created by Mickey on 2017/2/13.
 * 实现迭代器需要实现的方法 ：next() , hasNext() , remove()
 */
public class IterableClass implements Iterable<String> {
    private String[] words = "a b c d e f g h i j k l m n".split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>(){
            private  int index = 0 ;
            public boolean hasNext(){
                return  index < words.length;
            }
            public  String next(){return  words[index++] ;}
            public  void remove(){ throw new UnsupportedOperationException() ;}
        };
    }

    public  static  void main(String[] args){
        for (String s :  new IterableClass()){
            System.out.print(s);
        }
    }
}
