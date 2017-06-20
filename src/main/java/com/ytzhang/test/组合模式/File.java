package com.ytzhang.test.组合模式;

/**
 * Administrator 2017/3/2
 */
public class File implements Component {

    public void addComponent(Component t) throws Exception {
        throw new Exception("文件无法执行该操作");
    }

    public void removeComponent(Component t) throws Exception {
        throw new Exception("文件无法执行该操作");
    }

    public Component getChild(int i) throws Exception {
        throw new Exception("文件无法执行该操作");
    }

    public void kill() {
        System.out.println("文件杀毒");
    }
}
