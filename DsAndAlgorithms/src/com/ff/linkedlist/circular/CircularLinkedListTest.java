package com.ff.linkedlist.circular;

import com.ff.linkedlist.LinkedList;

public class CircularLinkedListTest 
{
	public static void main(String [] args)
	{
		
		LinkedList linkedList = new CircularLinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(5);
		linkedList.addLast(15);
		linkedList.addLast(25);
		
		linkedList.removeLast();
		linkedList.show();
	}
	
}
