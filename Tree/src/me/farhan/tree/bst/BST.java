package me.farhan.tree.bst;


public class BST<T extends Comparable<T>> {

	private Node<T> root;

	/*
	 * find the key
	 * @param key
	 */
	public boolean findNr(T key) 
	{
		Node<T> current = root;
		while (current != null) 
		{
			if(key.compareTo(current.key) == 0)
				return 	true;
			else if(key.compareTo(current.key) >0)
				current = current.right;
			else 
				current = current.left;
		}
		return false;
	}

	public boolean find(T key) 
	{
		return findHelper(root, key);

	}

	private boolean findHelper(Node<T> node,T key) 
	{
		if(node == null)
			return false;
		else if(key.compareTo(node.key) == 0)
			return true;
		else if(key.compareTo(node.key) >0)
			return findHelper(node.right, key);
		else 
			return findHelper(node.left, key);

	}


	/*
	 * insert 
	 */
	public void insert(T data) 
	{
		if(root == null)
			root = new Node<T>(data);
		else 
			insertHelper(root, data);
	}
	/*
	 * insert data non recursive
	 */
	public void insertNr(T data) 
	{
		if(root == null)
		{
			root = new Node<T>(data);
			return;
		}

		Node<T> current = root;
		while (current != null) 
		{
			if(current.key == data)
				break;
			else if(current.key .compareTo(data) >0)
			{
				if(current.left == null)
					current.left = new Node<T>(data);
				else 
					current = current.left;
			}else 
			{
				if(current.right == null)
					current.right = new Node<T>(data);
				else
					current = current.right;
			}
		}
	}

	/*
	 * add recursive
	 */
	private void insertHelper(Node<T> root,T data) 
	{
		if(root.key.compareTo(data) == 0)
			return;
		else if(root.key.compareTo(data) > 0)
		{
			if(root.left == null)
				root.left = new Node<T>(data);
			else
				insertHelper(root.left, data);
		}
		else 
		{
			if(root.right == null)
				root.right = new Node<T>(data);
			else
				insertHelper(root.right, data);
		}
	}

	public void traverse()
	{
		traverseHelper(root);
	}

	private void traverseHelper(Node<T> root) 
	{
		if (root == null) 
			return;
		traverseHelper(root.left);
		System.out.print(root.key+" ");
		traverseHelper(root.right);

	}

	public void delete(T t) 
	{
		//this.root = deleteHelper(root, t);
	}
	private T max() 
	{
		return null;

	}
	//minimum of a specific node
	private Node<T> min(Node<T> root) 
	{
		if(root.left == null) return root;
		else return min(root.left);
	}

	/*private Node<T> deleteHelper(Node<T> root,T t) 
	{
		if(root == null)
			return root;
		else if(t.equals(root.key))
		{
			if(root.left == null && root.right == null)
				return null;
			else if(root.left == null) 
			{
				Node<T> temp  = root.right;
				root = null;
				return temp;
			}
			else if(root.right == null)
			{
				Node<T> temp  = root.left;
				root = null;
				return temp;
			}

			Node<T> tmp = min(root.right);
			root.key = tmp.key;
			root.right = deleteHelper(root.right, tmp.key);
			return root;
		}else if(t.compareTo(root.key) < 0)
		{
			root.left = deleteHelper(root.left, t);
			return root;
		}else {
			root.left = deleteHelper(root.right, t);
			return root;
		}

	}
*/
	  public void remove( T t )
      {
          root = remove( t, root );
      }

    private Node<T> remove( T x, Node<T> root )
    {
        if( root == null )
            return root;   // Item not found; do nothing
        if( x.compareTo( root.key ) < 0 )
        	root.left = remove( x, root.left );
        else if( x.compareTo( root.key ) > 0 )
        	root.right = remove( x, root.right );
        else if( root.left != null && root.right != null ) // Two children
        {
        	root.key = findMin(root.right).key;
            root.right = remove( root.key, root.right );
        }
        else
            root = ( root.left != null ) ? root.left : root.right;
        return root;
    }
    
    private Node<T> findMin( Node<T> t )
    {
        if( t == null )
            return null;
        else if( t.left == null )
            return t;
        return findMin( t.left );
    }
	public static void main(String[] args) 
	{
		BST<Integer> bst = new BST<Integer>();
		bst.insertNr(10);
		bst.insertNr(12);
		bst.insertNr(8);
		bst.insertNr(7);
		bst.insertNr(11);
		bst.insertNr(15);
		bst.insertNr(7);
		bst.insertNr(6);
		bst.traverse();
		System.out.print("\n");
		bst.remove(11);
		bst.traverse();

	}
}
