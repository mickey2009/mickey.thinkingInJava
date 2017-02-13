package collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Mickey on 2017/2/13.
 * Set: HashSet , TreeSet(有序的) , LinkedHashSet
 */
public class SetTest {
    public  static  void main(String[] args){
        Random r= new Random(47);
        Set set = new TreeSet<Integer>();
        for (int i = 0 ; i < 1000 ; i ++){
            set.add(r.nextInt(30));
        }
        System.out.println(set);
    }
}
