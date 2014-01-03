package com.ff.heap;

public class HeapTest {

	public static void main(String [] args)
	{
		BinaryMinHeap minHeap = new BinaryMinHeap(50);
		int [] array = {20,5,10,12,15,8,6,2,9};
		minHeap.heapify(array);
		minHeap.show();
		minHeap.insert(2);
		minHeap.removeMin();
		minHeap.removeMin();
		minHeap.show();
	}

}
