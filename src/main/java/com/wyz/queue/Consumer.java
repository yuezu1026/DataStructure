package com.wyz.queue;

public class Consumer implements Runnable {

	private WindowQueue queue;

	public Consumer(WindowQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (queue.isAlive) {
			try {
				queue.consumer();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
