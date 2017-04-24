package com.ytzhang.test.职责链模式;

/**
 * Administrator 2017/4/24
 */
public class CeoHandler extends Handler {

    public void handleRequest(Integer amount) {
        if (amount > 100) {
            System.out.println("ceo ===" + amount);
        } else {
            this.getHandler().handleRequest(amount);
        }
    }
}
