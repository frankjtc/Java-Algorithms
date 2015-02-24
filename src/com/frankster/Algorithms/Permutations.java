package com.frankster.Algorithms;

public class Permutations {
	private static void stringPermutations(String prefix, String str)
	{
		int n=str.length();
		if(n==0){
			System.out.println(prefix);
		}
		else{
			for(int i=0;i<n;i++){
				stringPermutations(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1));
			}
		}
		
	}
	

	public static void main(String[] args) {
		String name="Frank";
		System.out.println(name.substring(0,1));
		stringPermutations("", "ABCD");

	}

}
