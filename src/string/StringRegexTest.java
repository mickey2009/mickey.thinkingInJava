package string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Mickey on 2017/2/13.
 * 字符串正则表达式： match() , split(),
 */
public class StringRegexTest {
    public  static  void main(String[] args){
        System.out.println("+911".matches("(-|\\+)?\\d+"));
        System.out.println(Arrays.toString("i love you".split("\\W+")));
        System.out.println("i love you".replaceAll("\\W+" , ","));
    }
}
