package com.frankster.Structures.Stack;

public class MyStackLinkedList<T> {
	
	private int total=0;
	private Node first;
	
	private class Node{
		private T element;
		private Node next;
	}
	
	private MyStackLinkedList<T> push(T element)
	{
		Node current=first;
		first=new Node();
		first.element=element;
		first.next=current;
		total++;
		return this;
	}
	
	private T pop()
	{
		if(total==0){throw new java.util.NoSuchElementException();}
		
		T element=first.element;
		first=first.next;
		total--;
		return element;
	}

	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		Node tmp=first;
		
		while(tmp!=null)
		{
			sb.append(tmp.element).append(", ");
			tmp=tmp.next;
		}
		return sb.toString();	
	}
	
	public static void main(String[] args) {
		
		MyStackLinkedList<String> myStack=new MyStackLinkedList<String>();
		myStack.push("Hello");
		myStack.push("_");
		myStack.push("World");
		System.out.println("After the push: " + myStack.toString());
		
		String s= myStack.pop();
		System.out.println("popped element: " + s);
		System.out.println("After the pop: "+ myStack.toString());
		
		
	}

}
