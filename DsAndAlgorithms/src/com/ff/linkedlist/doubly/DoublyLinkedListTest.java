package com.ff.linkedlist.doubly;

import com.ff.linkedlist.LinkedList;

public class DoublyLinkedListTest
{
	public static void main(String [] args)
	{
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addLast(5);
		
		linkedList.show();
		linkedList.showReverse();
		
	}

}
