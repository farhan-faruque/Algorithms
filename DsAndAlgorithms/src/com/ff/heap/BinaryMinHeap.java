package com.ff.heap;


public class BinaryMinHeap {

	private int [] data;
	private int heapSize;
	
	public BinaryMinHeap(int size)
	{
		data = new int[size];
		heapSize = 0;		
	}
	
	public void buildHeap(int [] array)
	{
		heapSize = array.length;
		System.arraycopy(array, 0, data, 0, array.length);
		
		for(int i = heapSize/2-1; i >= 0; i--) 		// from n/2 downto 1
		{
	   		heapify(i);		// call Heapify method
		}
	}
	
	public void show()
	{
		System.out.print("Heap :");
		for(int i =0; i< heapSize; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.print("\n");
	}
	
	private void heapify(int nodeIndex)
	{
		int smaller;
		
		int leftChildIndex = getLeftChildIndex(nodeIndex);
		int rightChildIndex = getRightChildIndex(nodeIndex);
		
		if(heapSize >= leftChildIndex && data[nodeIndex] > data[leftChildIndex])
			smaller = leftChildIndex;
		else 
			smaller = nodeIndex;
		
		if(heapSize >= rightChildIndex && data[smaller] > data[rightChildIndex])
			smaller = rightChildIndex;
		
		if(smaller != nodeIndex)
		{	
			swap(smaller, nodeIndex);
			heapify(smaller);
		}
	}
	
	private void swap(int index1,int index2)
	{
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
	public int getMinimun()
	{
		if(isEmpty())
			throw new HeapException("Heap is empty");
		else {
			return data[0];
		}		
	}
	
	private void shiftUp(int nodeIndex) 
	{
		int parentIndex;
		
		if(nodeIndex != 0)
		{
			parentIndex = getParentIndex(nodeIndex);
			if(data[parentIndex] > data[nodeIndex])
			{
				swap(parentIndex, nodeIndex);
				shiftUp(parentIndex);
			}
			
		}
	
	}
	
	public void insert(int value)
	{
		if(heapSize == data.length)
		{
			throw new HeapException("Heap's underlying storage is overflow");
		}
		else {
			heapSize++;
			data[heapSize - 1] = value;
			shiftUp(heapSize - 1);
		}
	}
	
	public void removeMin()
	{
		if(isEmpty())
		{
			throw new HeapException("Heap is empty");
		}else 
		{
			data[0] = data[heapSize -1];
			heapSize --;
			if(heapSize > 0)
				shiftDown(0);			
		}
		
	}
	
	private void shiftDown(int nodeIndex)
	{
		int leftChildIndex,rightChildIndex,minIndex;
		leftChildIndex = getLeftChildIndex(nodeIndex);
		rightChildIndex = getRightChildIndex(nodeIndex);
		
		if(rightChildIndex >= heapSize)
		{
			if(leftChildIndex >=  heapSize)
				return;
			else
				minIndex = leftChildIndex;
				
		}else {
			if(data[leftChildIndex] <= data[nodeIndex])
				minIndex = leftChildIndex;
			else 
				minIndex = rightChildIndex;
		}
		
		if(data[nodeIndex] > data[minIndex])
		{
//			temp = data[nodeIndex];
//			data[nodeIndex] = data[minIndex];
//			data[minIndex] = temp;
			
			swap(nodeIndex, minIndex);
			shiftDown(minIndex);
		}		
	}
	
	private int getLeftChildIndex(int index) 
	{
		return 2*index +1;	
	}
	
	private int getRightChildIndex(int index) 	
	{
		return 2*index +2;	
	}
	
	private int getParentIndex(int index) 	
	{
		return (index -1)/2;	
	}
	
	
	public boolean isEmpty()
	{
		return (heapSize == 0);
	}
	
	public class HeapException extends RuntimeException
	{
		public HeapException(String message)
		{
			super(message);
		}
		
	} 
	
}
