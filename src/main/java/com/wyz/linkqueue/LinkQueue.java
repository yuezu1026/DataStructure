package com.wyz.linkqueue;

public class LinkQueue implements Queue {
	Node front;
	Node rear;
	int count;

	public LinkQueue() {
		init();
	}

	private void init() {
		front = rear = null;
		count = 0;
	}

	@Override
	public void append(Object obj) throws Exception {
		// TODO Auto-generated method stub
		Node node = new Node(obj, null);
		if (rear != null) {
			rear.next = node; // 队尾节点指向新节点
		}
		rear = node; // 设置队尾结点为新节点

	}

	@Override
	public Object delete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFront() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
