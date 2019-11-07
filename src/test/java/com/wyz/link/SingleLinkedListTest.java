package com.wyz.link;

import org.junit.Test;

public class SingleLinkedListTest {

	@Test
	public void testSingleLinkedList() {
		SingleLinkedList singleList = new SingleLinkedList();
		singleList.addHead("A");
		singleList.addHead("B");
		singleList.addHead("C");
		singleList.addHead("D");
		// 打印当前链表信息
		singleList.display();
		// 删除C
		singleList.delete("C");
<<<<<<< HEAD
		singleList.delete("D");
		singleList.delete("A");
=======
>>>>>>> 2f2f5f915958c7d1e9ddd4af5da7a59c5fc62f37
		singleList.display();
		// 查找B

		System.out.println(singleList.find("B"));
	}

}
