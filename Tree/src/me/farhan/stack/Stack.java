package me.farhan.stack;

import me.farhan.tree.Node;

public interface Stack<T extends Node<V>, V>
{
	void push(Node<V> t);
	Node<V> pop();
	Node<V> peek();
	boolean isEmpty();
}
