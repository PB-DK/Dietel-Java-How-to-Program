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
public class M {
    
    public static void main(String[] args) {    
    
        int[][] v = {{ 6, 5, 4 },{ 3, 9, 1 },{ 7, 2, 8 }};
        
        for ( int row = 0; row < v.length; row++ ) {
            
            for ( int column = 0; column < v[ row ].length; column++ )
                System.out.printf( "[%d]  ", v[ row ][ column ] );
            
                System.out.println();
        }
        System.out.println();
        
        int total = 0;

        for ( int row = 0; row < v.length; row++ ) {
            
            for ( int column = 2; column < v[ row ].length; column++ )
                System.out.printf( "[%d]  ", v[ row ][ column ] );
            
                total += v[ row ][ 2 ];
            
                System.out.println();
        }      
                System.out.printf("Total is: %d", total);
                System.out.println();
    }
}
