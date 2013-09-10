package com.ff.singlelinkedlist;


public class SingleLinkedListTest {

	public static void main(String args[])
	{
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addLast(50);
		linkedList.addLast(40);
		linkedList.addLast(30);
        linkedList.add(1,14);
        linkedList.show();
		System.out.print("\n"+linkedList.get(2));
		

	}
}
