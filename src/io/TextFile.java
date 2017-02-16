package io;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Mickey on 2017/2/14.
 */
public class TextFile {
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(new File(fileName).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  sb.toString();
    }

    public static void writer(String fileName , String text){
        try{
            PrintStream out = new PrintStream(new File(fileName).getAbsoluteFile());
            try{
                out.print(text);
            }finally {
                out.close();
            }
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
    }

    public  static  void main(String[] args){
        String  text= read("README.md");
        System.out.println(text);
        writer("README.md" , text + "1");
        System.out.println(read("README.md"));
    }
}
