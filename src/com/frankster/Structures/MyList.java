package com.frankster.Structures;
import java.util.Iterator;
import java.util.List;

import com.frankster.Structures.Interfaces.AbstractArrList;

public class MyList extends AbstractArrList {

	public static void main(String[] args) {
		String[] str= {"Hello", " ","facebook"};
		List<String> strArr=createArrayList(str);
		Iterator<String> it=strArr.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	}
}
