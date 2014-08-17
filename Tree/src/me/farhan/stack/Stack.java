package me.farhan.stack;

public interface Stack<T>
{
	void push(T t);
	T pop();
	T peek();
	boolean isEmpty();
}
