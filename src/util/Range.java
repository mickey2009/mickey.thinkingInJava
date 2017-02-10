package util;

/**
 * Created by Mickey on 2017/2/11.
 */
public class Range {
    public static  int[] range(int n){
        int[] result = new int[n];
        for (int i = 0 ; i < n ; i ++){
            result[i] = i ;
        }
        return result;
    }

    public  static  int [] range(int start , int end){
        int sz = end - start;
        int[] result = new int[sz];
        for (int i = 0 ; i < sz ; i ++){
            result[i] = start + i;
        }
        return  result;
    }
}
