package com.frankster.Structures.Stack;

public class StackArray<T> implements IStack<T> {
	
	public T[] arr;
	
	private int total;
	
	public StackArray(){
		arr=(T[]) new Object[2];
	};
	
	private void resize(int capacity)
	{
		T[] tmp=(T[]) new Object[capacity];
		System.arraycopy(arr, 0, tmp, 0, total);
		arr=tmp;
	}
	
	public StackArray<T> push(T element)
	{
		if(arr.length==total)
		{
			resize(arr.length*2);			
		}
		arr[total++]=element;
		return this;
	}
	
	public T pop(){
		if(total==0){throw new java.util.NoSuchElementException();}
		
		T element=arr[--total];
		arr[total]=null;
		if(total>0 && total==arr.length/4)
		{
			resize(arr.length/2);
		}
		
		return element;
	}
	
	@Override
	public String toString(){
		return java.util.Arrays.toString(arr);
	}

	public static void main(String[] args) {
		
				IStack<String> myStack=new StackArray<>();
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
