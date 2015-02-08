package com.frankster.Structures;

public class ArrayClass {

	public static void main(String[] args) {
		char[] myArray= {'f','a','c','e','b','o','o','k'};
		//StringBuilder strB=new StringBuilder();
		char[] mySecArray=new char[5];
		mySecArray[0]='R';
		mySecArray[1]='o';
		mySecArray[2]='c';
		mySecArray[3]='k';
		mySecArray[4]='s';
		//int i=0;
		
		for(int c=0;c<myArray.length;c++){
			System.out.print(myArray[c]);
			//strB.append(v);
			//System.out.print(mySecArray[i]+" "+v);
			//i++;
		}
		

	}

}
