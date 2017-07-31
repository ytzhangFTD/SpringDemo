package com.ytzhang.test.statepattern;


/**
 * <pre>
 *  类OnState的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 17:30
 * </pre>
 */
public class OnState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("已经打开！");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭！");
        s.setState(Switch.getState("off"));
    }
}
