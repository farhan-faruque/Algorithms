package com.ff.linkedlist.doubly;

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
		System.out.print("\nfind pos 2:");
		System.out.print(linkedList.find(2));
		linkedList.showReverse();
		
	}

}
