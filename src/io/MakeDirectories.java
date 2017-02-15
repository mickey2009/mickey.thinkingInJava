package io;

import java.io.File;

/**
 * Created by Mickey on 2017/2/14.
 */
public class MakeDirectories {
    public  static  void main(String[] args){
        //当前目录
        File file = new File(".");
        fileData(file);

        //生成新目录或者删除目录
        File newFile = new File("test");
        if(newFile.exists()){
            newFile.delete();
        }else {
            newFile.mkdir();
        }
    }

    private static void fileData(File file){
        System.out.println(
                "Absolute path:" +file.getAbsolutePath()
                +"\n Can Read:" + file.canRead()
                +"\n Can Write:" + file.canWrite()
                +"\n LastModified:" + file.lastModified()
        );
    }
}
