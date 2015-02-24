package com.frankster.Algorithms;

public class BubbleSortRecursive {
	

		
	private static int[] sort(int[] arr, int index)
	{
		int[] myArray=arr;	
		if(myArray[index]>myArray[index+1])
		{
			int tmp=myArray[index];
			myArray[index]=myArray[index+1];
			myArray[index+1]=tmp;
		}
		
		return myArray;
	}

	public static void main(String []args) {
		 
	      int[] array = {10,8,6,4,2,9,7,5,3,1};
	 
	      System.out.print("Before sort: " );     
	      for(int x = 0; x < array.length; x++) {
	         System.out.print( " " + array[x]);     
	      }
	      System.out.println(" ");     
	 
	      int[] tmpArray=new int[array.length];
	      int remaining = array.length - 1;
	      for(int x = 0; x < (array.length-1); x++) {
	    	  int y=0;
	    	  while(y<remaining) {          
	        	 tmpArray=sort(array,y++);
	        	// y++;
	            }
	         }
	         remaining--;
	      
	 
	      System.out.print("After sort: " );     
	      for(int x = 0; x < tmpArray.length; x++) {
	         System.out.print( " " + tmpArray[x]);     
	      }
	      System.out.println(" ");     
	   }

}
