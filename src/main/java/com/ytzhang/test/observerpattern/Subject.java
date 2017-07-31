package com.ytzhang.test.observerpattern;


import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *  类Subject的实现描述：
 *  观察目标
 *  @author wb-zhangyitong  2017/7/4 14:25
 * </pre>
 */
public abstract class Subject {
    /**
     * 观察目标里要注册观察者
     */
    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void update() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
