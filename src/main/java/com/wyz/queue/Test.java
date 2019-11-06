package com.wyz.queue;

public class Test {

	public static void main(String[] args) throws Exception {

		CircleSequenceQueue queue = new CircleSequenceQueue();

		queue.append("a");
		queue.append("b");
		queue.append("c");
		queue.append("d");
		queue.append("e");
		queue.append("f");

		queue.delete();
		queue.delete();

		queue.append("e");

		while (!queue.isEmpty()) {
			System.out.println(queue.delete());
		}

	}

}
