package me.farhan.stack;

import me.farhan.tree.Node;

public class StackLinkedImpl<T extends Node<V>, V> implements Stack<T,V> {

	class StackNode<T extends Node<V>, V>
	{
		Node<V> t;
		StackNode<T,V> next;
		public StackNode(Node<V> t) 
		{
			this.t = t;
			next = null;
		}
	}

	@Override
	public void push(Node<V> t) 
	{
		
		
	}

	@Override
	public Node<V> pop() {
	
		return null;
	}

	@Override
	public Node<V> peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*private  StackNode<T> root;
	public StackLinkedImpl()
	{
		root = null;
	}

	@Override
	public synchronized void push(T t) 
	{
		if(isEmpty())
		{
			root = new Node(t);
			root.next = null;
		}
		else
		{
			Node node = new Node(t);
			node.next = root;
			root = node;
		}
	}

	@Override
	public synchronized T pop() 
	{
		if(!isEmpty())
		{
			Node temp = root;
			root = root.next;
			T t = temp.t;
			temp = null;
			return t;
		}
		return null;
	}

	@Override
	public synchronized boolean isEmpty() 
	{
		return root == null;
	}

	@Override
	public synchronized T peek() 
	{
		if(!isEmpty())
			return root.t;
		return null;
	}
	
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new StackLinkedImpl<>();
		stack.push(6);
		stack.push(7);
		System.out.print(stack.pop());
	}

	@Override
	public void push(Node t) {
		// TODO Auto-generated method stub
		
	}*/


}
