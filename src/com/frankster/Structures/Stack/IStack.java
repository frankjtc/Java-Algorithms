package com.frankster.Structures.Stack;

public interface IStack<T> {
	IStack<T> push(T element);
	T pop();
}
