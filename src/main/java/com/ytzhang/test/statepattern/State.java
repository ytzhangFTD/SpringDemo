package com.ytzhang.test.statepattern;


/**
 * <pre>
 *  类State的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 17:30
 * </pre>
 */
public abstract class State {
    public abstract void on(Switch s);

    public abstract void off(Switch s);
}
