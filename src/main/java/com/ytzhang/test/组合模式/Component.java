package com.ytzhang.test.组合模式;

/**
 * Administrator 2017/3/2
 */
public interface Component extends Kill {

    public void addComponent(Component t) throws Exception;

    public void removeComponent(Component t) throws Exception;;

    public Component getChild(int i) throws Exception;;
}
