package me.farhan.queue;

public class LinkedQueue<T> implements Queue<T> {

	private Node<T> front;
	private Node<T> rear;
	int size;
	public LinkedQueue() 
	{
		front = null;
		rear = null;
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return rear == null && front == null;
	}

	@Override
	public void enque(T t) {
		if(rear == null)
		{
			rear = new Node<>(t);
			front = rear;
			size++;
			return;
		}
		Node<T> node = new Node<>(t);
		Node<T> temp = rear;
		temp.next = node;
		rear = node;
	}

	@Override
	public void deque() throws Exception
	{
		if(front == null)
			throw new Exception("Queue is empty");

		Node<T> temp = front;
		front = temp.next;
		temp = null;
	}

	@Override
	public String toString() 
	{
		if(front == null)
			return "";
		String s = "";
		Node<T> temp = front;
		do {
			s += temp.data.toString()+" <-- ";
			temp = temp.next;
		} while (temp != null);

		return s;
	}

	@Override
	public T peek() {
		if(front == null)
			return null;
		return front.data;
	}

}
