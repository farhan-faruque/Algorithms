package com.ff.stack;

public interface Stack<T> {
	boolean isEmpty();
	void push(T t);
	T pop();
	void show();
	int size();
}
