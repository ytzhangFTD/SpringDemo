package com.ytzhang.test.组合模式;

/**
 * Administrator 2017/3/2
 */
public class Client {

    public static void main(String[] args) throws Exception {
        File imgFile = new ImgFile();
        File file = new File();
        Folder folder = new Folder();
        folder.addComponent(imgFile);
        folder.addComponent(file);
        folder.kill();
    }
}
