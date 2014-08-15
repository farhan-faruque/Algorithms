package me.farhan.tree.bst;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class BST {

	private Node root;
	
	/*
	 * find the key
	 * @param key
	 */
	public boolean find(int key) 
	{
		Node current = root;
		while (current != null) 
		{
			if(key == current.key)
				return 	true;
			else if(key >current.key )
				current = current.right;
			else 
				current = current.left;
		}
		return false;
	}
	
	
	public void insert(int data) 
	{
		if(root == null)
			root = new Node(data);
		else 
			add(root, data);
	}
	
	/*
	 * add recursive
	 */
	private void add(Node root,int data) 
	{
		if(root.key == data)
			return;
		else if(root.key > data)
		{
			if(root.left == null)
				root.left = new Node(data);
			else
				add(root.left, data);
		}
		else 
		{
			if(root.right == null)
				root.right = new Node(data);
			else
				add(root.right, data);
		}
	}
	
	public void traverse()
	{
		traverse(root);
		
	}
	
	private void traverse(Node root) 
	{
		if (root == null) 
			return;
		traverse(root.left);
		System.out.print(root.key+" ");
		traverse(root.right);
	
	}
	
	public static void main(String[] args) 
	{

		BST bst = new BST();
		bst.insert(10);
		bst.insert(12);
		bst.insert(8);
		bst.insert(7);
		bst.insert(7);
		bst.traverse();
	}
}
