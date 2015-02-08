package com.frankster.Structures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WordFrequency {

	public static void main(String[] args) {
		String str="Facebook, Information wants to be free, so start hacking the Information right away, and get that Facebook job, dude!";
		
		Map<String, Integer> frequencies=new HashMap<String, Integer>();
		
		String[] words=str.replaceAll(",", "").split(" ");
		
		for(String word: words)
		{
			Integer frec=frequencies.get(word);
			
			if(frec==null){
				frequencies.put(word, 1);
			}
				
			else{frequencies.put(word, ++frec);}
		}
		
		Set<String> keys= frequencies.keySet();
		
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext())
		{
			String tmp=it.next();
			System.out.println("Word: "+ tmp + "\t\tFrequency: "+ frequencies.get(tmp) );
			
		}

	}

}
