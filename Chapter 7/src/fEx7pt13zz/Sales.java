/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fEx7pt13zz;

/**
 *
 * @author User
 */
public class Sales {
    
    public static void main( String[] args ) {
        
        int[][] sales = new int[ 3 ][ 5 ];
        
        for ( int row = 0; row < sales.length; row++ ) {
            
            for ( int column = 0; column < sales[ row ].length; column++ ) {
                
                sales[ row ][ column ] = 0;
                System.out.printf("%d ", sales[ row ][ column ]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] sales1 = new int[ 3 ][ 5 ];
        int num = 0;
        
        for ( int row = 0; row < sales.length; row++ ) {
            
            for ( int column = 0; column < sales[ row ].length; column++ ) {
                
                sales[ row ][ column ] = num;
                System.out.printf("%-4d   ", sales[ row ][ column ]);   // EQUAL SPACE DIVIDER
                num++;
            }
            System.out.println();
        }
    }    
}
