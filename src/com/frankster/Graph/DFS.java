package com.frankster.Graph;
import java.util.*;

public class DFS {
	/* ------------------------------------------
    Data structure used to represent a graph
    ------------------------------------------ */
 int[][]  adjMatrix;
 int      rootNode = 0;
 int      NumberOfNodes;

 boolean[] visited; 

 /* -------------------------------
    Construct a graph of N nodes
    ------------------------------- */
 DFS(int N)
 {
    NumberOfNodes = N;
    adjMatrix = new int[N][N];
    visited = new boolean[N];
 }

 DFS(int[][] matrix)
 {
    int i, j;

    NumberOfNodes = matrix.length;

    adjMatrix = new int[NumberOfNodes][NumberOfNodes];
    visited = new boolean[NumberOfNodes];

    for ( i=0; i < NumberOfNodes; i++)
    {
       for ( j=0; j < NumberOfNodes; j++)
       {
          adjMatrix[i][j] = matrix[i][j];
       }
    }
 }

 public void dfs()
 {
    //DFS uses Stack data structure

    Stack<Integer> s = new Stack<Integer>();

    s.push(rootNode);
    visited[rootNode] = true;

    printNode(rootNode);

    while( !s.isEmpty() )
    {
       int n, child;

       n = (s.peek()).intValue();

       child = getUnvisitedChildNode(n);

       if ( child != -1 )
       {
          visited[child] = true;

          printNode(child);

          s.push(child);
       }
       else
       {
          s.pop();
       }
    }

    clearVisited();      //Clear visited property of nodes
 }


 int getUnvisitedChildNode(int n)
 {
    int j;

    for ( j = 0; j < NumberOfNodes; j++ )
    {
	 if ( adjMatrix[n][j] > 0 )
       {
	    if ( ! visited[j] )
             return(j);
       }
    }

    return(-1);
 }

 void clearVisited()
 {
    int i;

    for (i = 0; i < visited.length; i++)
       visited[i] = false;
 }

 void printNode(int n)
 {
    System.out.print(n+"\t");
 }
}
