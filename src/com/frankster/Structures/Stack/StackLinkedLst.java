package com.frankster.Structures.Stack;

public class StackLinkedLst<T> implements IStack<T> {

	private int total;
	
	private Node firstElement;
	
	private class Node{
		private T element;
		private Node next;
	}
	
	public StackLinkedLst(){} //Constructor
	
	public StackLinkedLst<T> push(T element)
	{
		Node tempElement=firstElement;
		firstElement=new Node();
		firstElement.element=element;
		firstElement.next=tempElement;
		total++;
		return this;
	}
	
	public T pop()
	{
		if(firstElement==null)
		{
			throw(new java.util.NoSuchElementException());
		}
		
		T element =firstElement.element;
		firstElement=firstElement.next;
		total--;
		return element;

	}
	
	@Override
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		Node tmp=firstElement;
		while(tmp!=null)
		{
			sb.append(tmp.element).append(",");
			tmp=tmp.next;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack<String> myStack=new StackLinkedLst<>();
		myStack.push("Hello");
		myStack.push("-");
		myStack.push("World");
		myStack.push("!");
		
		System.out.println("Printing the Stack: " + myStack.toString());
		
		myStack.pop();
		System.out.println("After first pop: " + myStack.toString());
		
		myStack.pop();
		System.out.println("After second pop:" + myStack.toString()); 
		
		myStack.push("facebook");
		System.out.println("Second push: " + myStack.toString());

	}

}
