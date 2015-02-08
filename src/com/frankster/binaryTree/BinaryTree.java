package com.frankster.binaryTree;

public class BinaryTree {
	private Node root;
 

  /*
   --Node--
   The binary tree is built using this nested node class.
   Each node stores one data element, and has left and right
   sub-tree pointer which may be null.
   The node is a "dumb" nested class -- we just use it for
   storage; it does not have any methods.
  */
  private static class Node {
    Node left;
    Node right;
    int data;

    Node(int newData) {
      left = null;
      right = null;
      data = newData;
    }
  }

  /**
   Creates an empty binary tree -- a null root pointer.
  */
   BinaryTree() {
    root = null;
  }
 

  /**
   Returns true if the given target is in the binary tree.
   Uses a recursive helper.
  */
  public boolean lookup(int data) {
    return(lookup(root, data));
  }
 

  /**
   Recursive lookup  -- given a node, recur
   down searching for the given data.
  */
  private boolean lookup(Node node, int data) {
    if (node==null) {
      return(false);
    }

    if (data==node.data) {
      return(true);
    }
    else if (data<node.data) {
      return(lookup(node.left, data));
    }
    else {
      return(lookup(node.right, data));
    }
  }
 

  /**
   Inserts the given data into the binary tree.
   Uses a recursive helper.
  */
  public void insert(int data) {
    root = insert(root, data);
  }
 

  /**
   Recursive insert -- given a node pointer, recur down and
   insert the given data into the tree. Returns the new
   node pointer (the standard way to communicate
   a changed pointer back to the caller).
  */
  private Node insert(Node node, int data) {
    if (node==null) {
      node = new Node(data);
    }
    else {
      if (data <= node.data) {
        node.left = insert(node.left, data);
      }
      else {
        node.right = insert(node.right, data);
      }
    }

    return(node); // in any case, return the new pointer to the caller
  } 
  
  /**
  Given a tree and a sum, returns true if there is a path from the root
  down to a leaf, such that adding up all the values along the path
  equals the given sum.

  Strategy: subtract the node value from the sum when recurring down,
  and check to see if the sum is 0 when you run out of tree.
 */ 
  public boolean hasPathSum(int sum){
	  return (hasPathSum(root, sum));
  }
  
  private boolean hasPathSum(Node node, int sum) {
	  // return true if we run out of tree and sum==0
	  if (node == null) {
	    return(sum == 0);
	  }
	  else {
	  // otherwise check both subtrees
	    int subSum = sum - node.data;
	    return(hasPathSum(node.left, subSum) || hasPathSum(node.right, subSum));
	  }
	} 
  
  
	/**
	 Returns the number of nodes in the tree.
	 Uses a recursive helper that recurs
	 down the tree and counts the nodes.
	*/ 
	public int size(){
		return size(root);
	}
	
	/**
	 Returns the max root-to-leaf depth of the tree.
	 Uses a recursive helper that recurs down to find
	 the max depth.
	*/ 
	public int maxDepth()
	{
		return maxDepth(root);
	}
	
	/**
	 Returns the min value in a non-empty binary search tree.
	 Uses a helper method that iterates to the left to find
	 the min value.
	*/ 
	public int minValue(){
		return minValue(root);
	}
	
	public int maxValue(){
		return maxValue(root);
	}
	
	/**
	 Prints the node values in the "inorder" order.
	 Uses a recursive helper to do the traversal.
	*/ 
	public void printTree(){
		 printTree(root);
	}
	
	
	
	/**
	 Prints the node values in the "postorder" order.
	 Uses a recursive helper to do the traversal.
	*/
	public void printPostorder() {
	 printPostorder(root);
	 System.out.println();
	}

	public void printPostorder(Node node) {
	  if (node == null) return;

	  // first recur on both subtrees
	  printPostorder(node.left);
	  printPostorder(node.right);

	  // then deal with the node
	 System.out.print(node.data + "  ");
	} 
	


	private int size(Node node){
		if(node==null){return 0;}
		else{
			return (size(node.left)+size(node.right)+1);
		}
	}
	
	private int maxDepth(Node node)
	{
		if(node==null){return 0;}
		else{
			int lDepth=maxDepth(node.left);
			int rDepth=maxDepth(node.right);
			return Math.max(lDepth, rDepth)+1;
		}
	}
	
	private int minValue(Node node){
		Node current=node;
		while(current.left!=null){
			current=current.left;
		}
		return current.data;
	}
	
	private int maxValue(Node node){
		Node current=node;
		while(current.right!=null){
			current=current.right;
		}
		return current.data;
	}

	private void printTree(Node node){
		if(node==null){return;}
		
		printTree(node.left);
		System.out.print(node.data+"-");
		printTree(node.right);
	}
	

}
