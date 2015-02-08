package com.frankster.Structures;
import java.util.*;

public class MyVector {
	
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>(3,2);
		v.addElement("Hello");
		v.addElement(" ");
		v.addElement("World");
		
		Iterator<String> it=v.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next());
		}
		
		System.out.println("\nsize: "+v.capacity());
	}

}
