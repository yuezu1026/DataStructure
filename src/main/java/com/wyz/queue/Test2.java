package com.wyz.queue;

public class Test2 {
	public static void main(String[] args) throws Exception {
		WindowQueue queue = new WindowQueue();
		Producer p = new Producer(queue);
		Consumer c = new Consumer(queue);

		// 排队买票的线程
		Thread pThread = new Thread(p);

		// 卖票的线程
		Thread cThread = new Thread(c);

		pThread.start(); // 开始排队买票
		cThread.start(); // 开始卖票
	}
}
