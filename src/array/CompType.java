package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by Mickey on 2017/2/14.
 * 排序的类要么实现了Comparable<T>接口， 要么使用指定的比较规则。
 */
class CompTypeComparator implements Comparator<CompType> {

    @Override
    public int compare(CompType o1, CompType o2) {
        return o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1);
    }
}

public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static Random rnd = new Random(47);

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public String toString() {
        return "(i=" + i + ", j=" + j + ")";
    }

    @Override
    public int compareTo(CompType o) {
        return i < o.i ? -1 : (i == o.i ? 0 : 1);
    }

    public static void main(String[] args) {
        CompType[] compTypes = new CompType[10];
        for (int i = 0; i < compTypes.length; i++) {
            compTypes[i] = new CompType(rnd.nextInt(20), rnd.nextInt(20));
        }
        //排序
        System.out.println(Arrays.toString(compTypes));
        Arrays.sort(compTypes , new CompTypeComparator());
        System.out.println(Arrays.toString(compTypes));

        Arrays.sort(compTypes);
        System.out.println(Arrays.toString(compTypes));

        //二分查找
        System.out.println(Arrays.binarySearch(compTypes , compTypes[1]));
        System.out.println(Arrays.binarySearch(compTypes , new CompType(30,1)));
    }
}
