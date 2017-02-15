package array;

import java.util.Arrays;

/**
 * Created by Mickey on 2017/2/14.
 */
public class ArrayTest {
    public  static  void main(String[] args){
        //数组初始化
        int[] a = new int[]{1,2,3,4};
        int[] b = {1,2,3,4};
        int[] c = new int[4];
        for (int i = 0 ; i <c.length ; i ++){
            c[i] = i + 1;
        }

        //多维数组
        int[][] array =  new int[][] {
                {1,2,3},{4,5,6}
        };
        System.out.println(Arrays.deepToString(array));

        //System.arraycopy
        int[] i ={1,2,3,4};
        int[] j = new int[10];
        System.arraycopy(i , 0,j,0,i.length);
        System.out.println(Arrays.toString(j));
    }
}
