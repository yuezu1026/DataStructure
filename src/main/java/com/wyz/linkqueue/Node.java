package com.wyz.linkqueue;

public class Node {
	Object element; // 数据域
	Node next; // 指针域

	// 头节点的构造方法
	public Node(Node nextVal) {
		this.next = nextVal;
	}

	// 非头节点的构造方法
	public Node(Object obj, Node nextval) {
		this.element = obj;
		this.next = nextval;
	}

	// 获取当前节点的后继结点
	public Node getNext() {
		return this.next;
	}

	// 获得当前的数据域的值
	public Object getElement() {
		return this.element;
	}

	// 设置当前结点的指针域
	public void setNext(Node nextval) {
		this.next = nextval;
	}

	public void setElement(Object obj) {
		this.element = obj;
	}

	public String toString() {
		return this.element.toString();
	}

}
