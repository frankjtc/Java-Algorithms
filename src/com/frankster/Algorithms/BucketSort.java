package com.frankster.Algorithms;

import java.util.Arrays;

public class BucketSort {

	public static void sort(int[] arr, int maxVal){
		int[] bucket=new int[maxVal+1];
		
		for(int i=0;i<bucket.length;i++)
		{
			bucket[i]=0;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			bucket[arr[j]]++;
		}
		
		int outPos=0;
		for(int i=0;i<bucket.length;i++)
		{
			for(int j=0;j<bucket[i];j++)
			{
				arr[outPos++]=i;
			}
		}
	}
	
	public static void main(String[] args) {
		  int maxVal=5;
	      int [] data= {5,3,0,2,4,1,0,5,2,3,1,4}; 
	 
	      System.out.println("Before: " + Arrays.toString(data));
	      sort(data,maxVal);
	      System.out.println("After:  " + Arrays.toString(data));
		

	}

}
