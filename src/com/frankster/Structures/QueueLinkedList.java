package com.frankster.Structures;

public class QueueLinkedList<T> {
	
	private int total;
	private Node first, last;
	
	private class Node{
		T element;
		Node next;
	}
	
	private QueueLinkedList<T> enqueue(T element){
		Node current = last;
		last=new Node();
		last.element=element;
		
		if(total==0){
			first=last;
		}
		else{
			current.next=last;
		}
		
		total++;
		return this;
	}
	
	private T dequeue(){
		if(total==0){throw new java.util.NoSuchElementException();}
		T element=first.element;
		first=first.next;
		
		if(--total==0){
			last=null;
		}
		
		return element;
	} 
	
	@Override
	public String toString()
	{
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
		QueueLinkedList<String> myQueue = new QueueLinkedList<String>();
		myQueue.enqueue("Hello");
		myQueue.enqueue("_");
		myQueue.enqueue("World");
		myQueue.enqueue("!");
		System.out.println("After the enqueue: " + myQueue.toString());
		
		String s=myQueue.dequeue();
		System.out.println("Dequeued element: "+s);
		System.out.println("After de dequeue: " + myQueue.toString());

	}

}
