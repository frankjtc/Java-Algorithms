package com.frankster.Structures.Interfaces;

import java.util.ArrayList;
import java.util.List;

 public abstract class AbstractArrList {
	 
		public static List<String> createArrayList(String[] myStrings){
			List<String> myArrList=new ArrayList<String>();
			for(String item:myStrings)
			{
				myArrList.add(item);
			}
			return myArrList;
		}

}
