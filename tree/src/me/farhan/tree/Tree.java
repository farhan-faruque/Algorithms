package me.farhan.tree;

import me.farhan.stack.Stack;
import me.farhan.stack.StackLinkedImpl;

public class Tree<T extends Node<V>,V> {
	
	public interface Visit
	{
		void onVisit();
	}
	
	public void inOrder(Node<V> root,Visit visit) 
	{
	
		if(root == null)
			return;
		Stack<T,V> stack = new StackLinkedImpl<T,V>();
		stack.push(root);
	}
	
	public void preOrder(Node<V> root,Visit visit) 
	{
	
	}
	
	public void postOrder(Node<V> root,Visit visit) {
	
	}

	public static void main(String[] args) {
		
	}
}
