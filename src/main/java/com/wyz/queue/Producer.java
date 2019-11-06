package com.wyz.queue;

public class Producer implements Runnable {
	private WindowQueue queue;

	public Producer(WindowQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (queue.num < 100) {
			try {
				queue.producer();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
