package com.frankster.Graph;


public class GraphTest {
    public static void main( String [] args ) {
        test1();
        test2();
    }
    ////////////////////////
    private static void test1() {
        for ( int nodeCount = 0; nodeCount <  5; ++nodeCount ) {
            for ( int edgeCount = -1; edgeCount <= nodeCount * 10; ++edgeCount ) {
                try {
                    System.out.println( "\n----- Test case nodeCount: " + nodeCount + " edgeCount: " + edgeCount + " -----" );
                    System.out.flush();
                    test( nodeCount, edgeCount, true );
                }
                catch ( Exception e ) {                   
                    System.out.println( "Graph creation failed: " + e.getMessage() );
                }               
            }
        }
        System.out.flush();
    }
    ////////////////////////
    private static void test2() {
        int nodeCount = 10000;
        int edgeCount = nodeCount * 10;
        System.out.println( "\n----- Test case nodeCount: " + nodeCount + " edgeCount: " + edgeCount + " -----" );
        test( nodeCount, edgeCount, false );       
    }
    ////////////////////////
    private static void test( int nodeCount, int edgeCount, boolean dumpGraph ) {
        Graph rg = Graph.createRandomGraph( nodeCount, edgeCount );       
        if ( !dumpGraph )
            System.out.print( rg.getGraphSummary() );       
        // Dump degree historgram
        int maxDegree = rg.computeMaxDegree();
        for ( int i = 0; i  <= maxDegree; ++i ) {
            int nodeCountWithDegree = rg.countNodesWithDegree( i );
            System.out.println( "Nodes with degree " + i + ": " + nodeCountWithDegree );
        }       
        // Test for self-looping nodes
        System.out.println( "Exists self-loops: " + rg.hasSelfLoops() );
        if ( dumpGraph )
            System.out.print( rg.toStringVerbose() );
    }
}

