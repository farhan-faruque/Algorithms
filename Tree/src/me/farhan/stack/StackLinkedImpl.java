package me.farhan.stack;

public class StackLinkedImpl<T> implements Stack<T> {

	class Node
	{
		T t;
		Node next;
		public Node(T t) 
		{
			this.t = t;
			next = null;
		}
	}
	
	private Node root;
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


}
