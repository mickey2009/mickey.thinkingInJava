package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Mickey on 2017/2/14.
 */
public class BinaryFile {
    public static byte[] read(File file) throws IOException{
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(file));
        try{
            byte[] data =new byte[bf.available()];
            bf.read(data);
            return  data;
        }finally {
            bf.close();
        }
    }
}
