package com.ff.singlelinkedlist;


public class SingleLinkedList
{
    private SingleLinkedNode head;
    private int size;

    public SingleLinkedList()
    {
        size = 0;
        head = null;
    }

    public void addFirst(int data)
    {
        SingleLinkedNode node = null;
        node = new SingleLinkedNode();
        node.data = data;

        if(head == null)
        {
            node.next = null;
            head = node;
        }else
        {
            node.next = head;
            head = node;
        }
        size++;

    }

    public void addLast(int data)
    {
        SingleLinkedNode node = new SingleLinkedNode();
        node.data = data;

        if(head != null)
        {
            SingleLinkedNode temp = head;

            while (temp != null)
            {
                if(temp.next == null)
                {
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }
        }else
        {
            node.next = null;
            head = node;
        }
        size++;
    }

    public boolean add(int pos,int data)
    {
        if(pos  >= 0 && pos < size)
        {
            SingleLinkedNode node = new SingleLinkedNode();
            node.data = data;
            node.next = null;

            if(pos == 0)
            {
                addFirst(data);
            }
            else if (pos == size - 1)
            {
                addLast(data);
            }
            else
            {
                SingleLinkedNode tempNode = head;
                int tempPos = 0;

                while (tempNode != null)
                {
                    if(pos == tempPos + 1)
                    {
                        node.next = tempNode.next;
                        tempNode.next = node;
                        break;
                    }
                    tempNode = tempNode.next;
                    tempPos++;
                }
                size++;
            }
            return true;
        }
        return  false;

    }

    public int getFirst()
    {
        return 0;

    }
    public int getLast()
    {
        return 0;

    }
    public int get(int pos)
    {
        return 0;

    }

    public boolean removeFirst()
    {
        if(head != null)
        {
            SingleLinkedNode temp = head;
            head = head.next;
            temp = null;
            size--;
            return true;
        }
        return false;
    }

    public boolean removeLast()
    {
       if(head != null)
       {
    	   SingleLinkedNode tempNode = head;
    	   SingleLinkedNode prevNode = head;
    	   
    	   while (tempNode != null) 
    	   {    		 
    		   if(tempNode.next == null)
    		   {
    			   prevNode.next = null;
    			   tempNode = null;
    			   break;
    		   }
    		   prevNode = tempNode;
    		   tempNode = tempNode.next;
    	   }
    	   size--;
		return true;
       }
       
       return false;
    }

    public boolean remove(int pos)
    {
    	if(pos >= 0 && pos < size)
    	{
    		if(pos == 0)
    		{
    			removeFirst();
    		}else if (pos == size -1) 
    		{
    			removeLast();			
			}else 
			{
				SingleLinkedNode tempNode = head;
				SingleLinkedNode prevTempNode = head;
				int tempPos = 0;
				
				while (tempNode != null)
				{
					if(pos == tempPos)
					{
						prevTempNode.next = tempNode.next;
						tempNode = null;
						break;
					}
					prevTempNode = tempNode;
					tempNode = tempNode.next;
					tempPos++;				
				}
				size --;				
			}
    		return true;
    	}
    	return false;
    }

    public int find(int data)
    {
        return 0;
    }

    public void show()
    {
        if(head != null)
        {
        	System.out.print("\n");
            SingleLinkedNode temp = head;
            while (temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.print("\n"+"Size : "+size);
        }
    }

    public int getSize() {
        return size;
    }

}
