package com.frankster.binaryTree;

public class MyBinaryTree {
	
	private Node root;
	//Node class
	private class Node{
		int data;
		Node left;
		Node right;
		
		//Constructor
		Node(int newData)
		{
			 data=newData;
			 left=null;
			 right=null;
		}
	}
	
	//Constructor
	MyBinaryTree(){
		root=null;
	}
	
	private void insert(int data){
		root= insert(root, data);
	}
	
	private Node insert(Node node, int data){
		if(node==null){node=new Node(data);}
		else if(data<node.data){node.left=insert(node.left, data);}
		else{node.right=insert(node.right, data);}
		
		return node;
	}
	
	private boolean lookUp(int data){
		return lookUp(root,data);
		
	}
	
	private boolean lookUp(Node node, int data){
		if(node==null){return false;}
		
		if(data==node.data){return true;}
		else if(data<node.data){return lookUp(node.left, data);}
		else{return lookUp(node.right, data);}
	}

	public static void main(String[] args) {
		 MyBinaryTree bt=new MyBinaryTree();
	      
	      bt.insert(2);
	      bt.insert(1);
	      bt.insert(5);
	      bt.insert(10);
	      System.out.println("Is in the tree: " + bt.lookUp(3));

	}

}
