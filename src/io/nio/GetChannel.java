package io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Mickey on 2017/2/14.
 */
public class GetChannel {
    private static final int BSIZE = 8;

    public static void main(String[] args) throws Exception {
        //读取文件
        FileChannel fc = new FileInputStream(new File(".gitignore").getAbsoluteFile()).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while (fc.read(buffer) != -1) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
        }
        fc.close();
    }
}
