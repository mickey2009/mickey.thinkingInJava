package collections;

import java.util.*;

/**
 * Created by Mickey on 2017/2/13.
 * Map:HashMap , LinkedHashMap  , TreeMap等
 */
public class MapTest {
    public  static  void main(String[] args){
        Random r= new Random(47);
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0 ; i < 1000 ; i ++){
            int number = r.nextInt(20);
            Integer count =  map.get(number);
            map.put(number , count == null ? 1 :  count + 1);
        }
        System.out.println(map);
    }
}
