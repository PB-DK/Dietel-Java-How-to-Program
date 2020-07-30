/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eEx7pt12;

/**
 *
 * @author User
 */
public class DuplicateEliminationTryCatch {
    
    public static void main( String[] args) {
    
        int[] array = { 18, 96, 71, 71, 34, 49 };
        int temp = 0;
        int num = 0;
        
        for ( int row = 0; row < array.length; row++ ) {
  
            try
            {
            if ( array[ num ] != array[ num + 1 ] ) {
            //  System.out.printf("%d ", array[ num ] );
                }
            }
            catch ( ArrayIndexOutOfBoundsException e ) 
                    {
                System.out.println( e );
       //         System.out.printf( "%d = %d ", array[ num ], array[ num + 1 ]);
                System.out.printf( "array[%d] = %d\n\n",
                    row, array[ row ]);
                    }
                num++;
        }        
        for ( int number = 0; number <= array.length; number++ ) {
            System.out.printf("%d ", array[ number ] );
    }
            System.out.println();
    }
} 