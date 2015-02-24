package com.frankster.Algorithms;

public class MergeArrays {
	
	public static void merger(int[] a, int[]b)
	{
		
		 int i=0;
		 int j=0;
		 int k=0;
		 Integer[] temp=new Integer[a.length+ b.length];
		 
		 while(i<a.length && j < b.length)
		 {
			 if(a[i]<b[j])
			 {
				 temp[k]=a[i++];
			 }
			 
			 else{
				 temp[k]=b[j++];
			 }
			 
			 k++;
		 }
		
		while(i<a.length)
		{
			temp[k]=a[i++];
			k++;
		}
		
		while(j<b.length)
		{
			temp[k]=b[j++];
			k++;
		}
		
		for(Integer x: temp)
		{
			System.out.println("\tArray: " + x.toString());
		}
		
	}

	public static void main(String[] args) {
		int[] a ={8,3,5,2,7};
		int[] b={1,4,9};
		merger(a, b);

	}

}
