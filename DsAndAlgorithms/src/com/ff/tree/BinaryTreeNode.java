package com.ff.tree;

public class BinaryTreeNode {

	public int key;
	public BinaryTreeNode leftChild;
	public BinaryTreeNode rightChild;

    public BinaryTreeNode(int key)
    {
        this.key = key;
        this.leftChild = null;
        this.rightChild = null;
    }
}
