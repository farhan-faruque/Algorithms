package com.ff.stack;

public class StackTest {
	
	public static void main(String [] args)
	{
		LinkedStack<String> stack = new LinkedStack<String>();
		stack.push("Farhan");
		stack.push("Faruque");
		stack.push("Russel");		
		
		stack.show();
		System.out.print("\n"+stack.size());
		
	}

}
