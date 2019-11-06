package com.wyz.queue;

public class WindowQueue {
	// 卖票的队列
	int maxSize = 10;
	CircleSequenceQueue queue = new CircleSequenceQueue();
	int num = 0; // 统计卖票的数量，一天最多卖100张
	boolean isAlive = true; // 判断是否继续卖票

	// 排队买票
	public synchronized void producer() throws Exception {
		if (queue.count < maxSize) {
			queue.append(num++); // 等待买票的数量
			System.out.println("第" + num + "个客户排队等待买票");
			this.notifyAll();
		} else {
			try {
				System.out.println("队列已满...请等待！");
				this.wait();// 队列满时，排队买票的线程等待
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	// 卖票
	public synchronized void consumer() throws Exception {
		if (queue.count > 0) {
			Object obj = queue.delete();
			int temp = Integer.parseInt(obj.toString());
			System.out.println("第" + (temp + 1) + "个客户买到票离开队列！");
			if (queue.isEmpty() && this.num >= 100) {
				this.isAlive = false;
			}
			this.notifyAll();// 唤醒排队买票的线程
		} else {
			try {
				System.out.println("队列已空．．请等待");
				this.wait(); // 队列空时，卖票线程等待
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
