package com.ff.tree;

public class TreeTest 
{
	public static void main(String [] args)
	{

        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(12);
        bst.add(8);
        bst.add(15);
        bst.show();
        System.out.print("\n"+bst.getMinimum());

        System.out.print("\n"+bst.find(14));
	}

}
