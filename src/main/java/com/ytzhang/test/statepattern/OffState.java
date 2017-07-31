package com.ytzhang.test.statepattern;


/**
 * <pre>
 *  类OffState的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 17:31
 * </pre>
 */
public //关闭状态
class OffState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("打开！");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭！");
    }
}
