package com.ff.tree;
/*
* @farhan-faruque
*
 */

public class BinarySearchTree 
{

    private BinaryTreeNode root;

    BinarySearchTree()
    {
        root = null;

    }

    public void insert(int key)
    {
        if(root == null)
            root = new BinaryTreeNode(key);
        else
            insert(root,key);
    }

    public boolean search(int key)
    {
        if(root == null)
            return false;
        else
        {
            return search(root,key);

        }

    }

    public int getMaximum()
    {
        if (root == null)
            return 0;
        else
        {

            BinaryTreeNode node = root;
            while (node.rightChild != null)
            {
                node = node.rightChild;
            }
            return node.key;
        }

    }

    public int getMinimum()
    {
        if (root == null)
            return 0;

        else{
            BinaryTreeNode node = root;
            while (node.leftChild != null)
            {
                node = node.leftChild;
            }
            return node.key;
        }
    }

    public boolean find(int key)
    {
        if (root == null)
            return false;

        BinaryTreeNode node = root;
        while (node != null)
        {
            if(node.key == key)
                return true;
            else if (key > node.key)
                node = node.rightChild;
            else
                node = node.leftChild;
        }
        return false;
    }

    /*
    *  recusrive search
     */
    private boolean search(BinaryTreeNode node,int key)
    {
        if(node == null)
            return  false;
        else
        {
            if (key == node.key)
                return  true;
            else
            {
                if (key > node.key)
                    return  search(node.rightChild, key);
                else
                   return search(node.leftChild, key);
            }
        }
    }

    public void add(int key)
    {
        BinaryTreeNode node = root;
        if (root == null)
        {
            root = new BinaryTreeNode(key);
            return;
        }

        while (node != null)
        {
            if (key > node.key)
            {
                if (node.rightChild == null)
                {
                    node.rightChild = new BinaryTreeNode(key);
                    break;
                }else
                    node = node.rightChild;
            }else
            {
                if (node.leftChild == null)
                {
                    node.leftChild = new BinaryTreeNode(key);
                    break;
                }else
                    node = node.leftChild;
            }
        }
    }

    private void insert(BinaryTreeNode node,int key)
    {
        if(key < node.key)
        {
            if(node.leftChild == null){
                node.leftChild = new BinaryTreeNode(key);
            }else
            {
                insert(node.leftChild, key);
            }
        }else
        {
            if (node.rightChild == null)
            {
                node.rightChild = new BinaryTreeNode(key);
            }else
            {
                insert(node.rightChild, key);
            }

        }
    }

    public void show()
    {
        traverse(root);
    }

    private void traverse(BinaryTreeNode node)
    {
        if (node == null)
            return;

        traverse(node.leftChild);
        System.out.print(node.key+" ");
        traverse(node.rightChild);
    }

}
