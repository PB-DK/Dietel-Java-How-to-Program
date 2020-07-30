/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bEx7pt9;

/**
 *
 * @author User
 */
public class K {
    
    public static void main(String[] args) {
        
        int[][] w = {{ 23, 11, 4 },{ 3, 7, 8 }};
        
            int smallest = w[ 0 ][ 0 ];
        
        for ( int row = 0; row < w.length; row++ ) {
            
            for ( int column = 0; column < w[ row ].length; column++ )
                System.out.printf( "[%d]  ", w[ row ][ column ] );
            
                System.out.println();
        
            for ( int[] xw : w) {
                
                for ( int ws : xw )
        
                    if ( ws < smallest ) {
                        smallest = ws;
                        } 
            }
        }
        System.out.println();

    System.out.printf( "Minimum of w: %d", smallest );
        
        System.out.println();
        System.out.println();
        
        int[][] v = {{ 6, 5, 4 },{ 3, 2, 1 },{ 3, 2, 1 }};
        
        for ( int row = 0; row < v.length; row++ ) {
            
            for ( int column = 0; column < v[ row ].length; column++ )
                System.out.printf( "[%d]  ", v[ row ][ column ] );
            
                System.out.println();
        }
        
        
    }
    
/*
            int[][] w = {{ 6, 5, 4 },{ 3, 2, 1 }};
        
        for ( int row = 0; row < w.length; row++ ) {
            
            for ( int column = 0; column < w[ row ].length; column++ )
                System.out.printf( "[%d]  ", w[ row ][ column ] );
            
                System.out.println();
        
            int smallest = w[ 0 ][ 0 ];
        
    for ( row = 0; row < w.length; row++ ) {
        
        for ( int column = 0; column < w.length; column++ ) {
                    
            for ( int xw : w) {
        
            if ( xw < smallest ) {
                smallest = xw;
            } else {
                smallest = smallest;
                }
            }
        }
    }   
        
    System.out.printf( "Minimum of w: %f", smallest );
    */
}