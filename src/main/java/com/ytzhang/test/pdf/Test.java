package com.ytzhang.test.pdf;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

/**
 * <pre>
 *  类Test的实现描述：TODO 类实现描述
 *  wb-zhangyitong  2017/6/19 11:24
 * </pre>
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String[] imgs = new String[2];
        File temp = new File("C:\\Users\\wb-zhangyitong\\Desktop\\test\\Penguins.jpg");
        FileInputStream fi = new FileInputStream(temp);
        byte[] bytes = IOUtils.toByteArray(fi);
        for (int i = 0; i < 2; i++) {
            imgs[i] = new BASE64Encoder().encode(bytes);
        }
        InputStream inputStream = PdfUtils.image2Pdf(imgs);
        File f = new File("C:\\Users\\wb-zhangyitong\\Desktop\\test\\test.pdf");
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        IOUtils.copy(inputStream, fileOutputStream);
    }
}
