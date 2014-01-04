package com.ff.tree;

public class TreeTest 
{
	public static void main(String [] args)
	{

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(12);
        bst.insert(8);
        bst.show();
        System.out.print("\n"+bst.getMinimum());

        System.out.print("\n"+bst.getMaximum());
	}

}
