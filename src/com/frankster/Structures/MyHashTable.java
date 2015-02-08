package com.frankster.Structures;
import java.util.Hashtable;
//import java.util.Iterator;
import java.util.Map;
//import java.util.Set;
public class MyHashTable {

	public static void main(String[] args) throws Exception {
		 // Start with ten, expand by ten when limit reached
		Map<Integer, String> hash=new Hashtable<Integer, String>(10, 10);

		for(int i=0;i<=100;i++){
			Integer integer=new Integer(i);
			hash.put(integer,"Number: " + i);
			
		}
		
		System.out.println(hash.get(new Integer(5)));
		
		System.out.println(hash.get(new Integer(21)));
		
		System.out.print("\n");
		
//		Set<Integer> mySet=hash.keySet();
//		Iterator<Integer> it=mySet.iterator();
//		
//		while(it.hasNext())
//		{
//			Integer n=it.next();
//			System.out.println(hash.get(n));
//	  	}
		
		for(int i=0;i<hash.size();i++){
			System.out.println(hash.get(i));
		}

	}

}
