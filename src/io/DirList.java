package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created by Mickey on 2017/2/14.
 * 文件的遍历
 */
public class DirList {
    public  static  void main(String[] args){
        File path = new File(".");
        String[] list ;
        if(args.length ==0){
            list = path.list();
        }else {
            list = path.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.matches(args[1]);
                }
            });
        }
        Arrays.sort(list , String.CASE_INSENSITIVE_ORDER);
        for (String fileName : list){
            System.out.println(fileName);
        }
    }
}
