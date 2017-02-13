package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mickey on 2017/2/13.
 * 测试Matcher对象和捕获组
 */
public class PatternTest {
    public  static  void main(String[] args){
        Matcher matcher = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
        System.out.println();

        Matcher m = Pattern.compile("(?m)(\\S+)\\s+(((\\S+)\\s+)(\\S+))$").matcher(POEM);
        while (m.find()){
            for (int j = 0 ; j <m.groupCount() ; j++){
                System.out.print("[" + m.group(j) + "]");
            }
            System.out.println();
        }
    }

    public static final  String POEM =
            "Twas brillig , and the slithy toves\n" +
             "Did grye and gimble in the wabe.\n";
}
