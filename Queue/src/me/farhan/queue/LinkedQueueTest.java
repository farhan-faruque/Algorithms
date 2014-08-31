package me.farhan.queue;

public class LinkedQueueTest {

	public static void main(String[] args) {
		try {

			LinkedQueue<String> s = new LinkedQueue<>();
			s.enque("Farhan");
			s.enque("Faruque");
			System.out.println(s.toString());
			System.out.println(s.peek());
		} catch (Exception e) {
			
		}

	}
}
