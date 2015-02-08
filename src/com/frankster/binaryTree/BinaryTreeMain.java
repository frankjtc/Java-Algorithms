package com.frankster.binaryTree;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class BinaryTreeMain {

	public static void main(String[] args) {
		 // BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	      //int n=Integer.parseInt(bf.toString());
	      BinaryTree bt=new BinaryTree();
	      
	      //bt.build123a();
	      //bt.build123b();
	      //bt.build123c();
	      
	      bt.insert(5);
	      bt.insert(4);
	      bt.insert(8);
	      bt.insert(11);
	      bt.insert(7);
	      bt.insert(2);
	      bt.insert(13);
	      bt.insert(4);
	      bt.insert(1);
	      	      
	      
	      System.out.println("Is in the tree: " + bt.lookup(4));
	      
	      System.out.println("Size: " + Integer.toString(bt.size()));
	      
	      System.out.println("Max depth: " + Integer.toString(bt.maxDepth()));
	      
	      System.out.println("Min value: " + Integer.toString(bt.minValue()));
	      
	      System.out.println("Max value: " + Integer.toString(bt.maxValue()));
	      
	      System.out.print("Tree: ");
	      bt.printTree();
	      
	      System.out.print("\nPostOrder: ");
	      bt.printPostorder();
	      
	      System.out.print("\nPathSum: " + bt.hasPathSum(27));
	      
	}

}
