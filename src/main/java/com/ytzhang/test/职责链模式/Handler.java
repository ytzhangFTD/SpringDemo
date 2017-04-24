package com.ytzhang.test.职责链模式;

/**
 * Administrator 2017/4/24
 */
public abstract class Handler {

    private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public abstract void handleRequest(Integer amount);
}
