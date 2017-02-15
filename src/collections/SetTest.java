package collections;

import java.util.*;

/**
 * Created by Mickey on 2017/2/13.
 * Set: HashSet , TreeSet(有序的) , LinkedHashSet
 */

class SetType {
    int i;

    public SetType(int n) {
        i = n;
    }

    public boolean equals(Object o) {
        return (o instanceof SetType) && ((SetType) o).i == i;
    }

    public String toString() {
        return Integer.toString(i);
    }
}

class HashType extends SetType {
    public HashType(int n) {
        super(n);
    }

    public int hashCode() {
        return i;
    }
}

class TreeType extends SetType implements Comparable<TreeType> {
    public TreeType(int n) {
        super(n);
    }

    @Override
    public int compareTo(TreeType o) {
        return o.i < i ? -1 : (o.i == i ? 0 : 1);
    }
}

public class SetTest {
    static <T> Set<T> fill(Set<T> set, Class<T> type) {
        try {
            for (int i = 0; i < 10; i++) {
                set.add(type.getConstructor(int.class).newInstance(i));
            }
        } catch (Exception e) {
            throw  new RuntimeException();
        }
        return  set;
    }

    static <T> void test(Set<T> set, Class<T> type){
        fill(set , type);
        fill(set , type);
        fill(set , type);
        System.out.println(set);
    }

    public static void main(String[] args) {
        test(new HashSet<>() ,HashType.class );
        test(new TreeSet<>() ,TreeType.class );
        test(new LinkedHashSet<>() ,HashType.class );

        //有问题的场景,HashSet需要元素有hashCode
        test(new HashSet<>() ,SetType.class );

        //TreeSet需要元素实现Comparable<T>,导致运行时异常
        //test(new TreeSet<>() ,SetType.class );
    }
}
