package com.frankster.Structures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.frankster.Structures.Interfaces.IMySet;

public class MySet implements IMySet {

	@Override
	public Set<String> createSet(String[] myStr){
		Set<String> mySet=new HashSet<String>();
		 for(String s:myStr){
			 mySet.add(s);
		 }
		 return mySet;
	 }
	public static void main(String[] args) {
		String[] ch={"F", "r", "a", "n", "k"};
		IMySet s=new MySet();
		Set<String> set=s.createSet(ch);
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			//It's an ordered structure, you fool!!!
			System.out.print(it.next());
		}

	}

}
