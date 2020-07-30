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
public class aDeclareCreateTest {
    
    public static void main( String[] args ) {
        
        int[][] t = new int [2][3];   
    
        for ( int row = 0; row < t.length; row++ ) {
            
            for ( int column = 0; column < t[ row ].length; column++ )
                System.out.printf( "[%d]  ", t[ row ][ column ] );
            
            System.out.println();
        }
        System.out.println();

        int[][] u = {{ 6, 5, 4 },{ 3, 2, 1 }};
        
         for ( int row = 0; row < t.length; row++ ) {
            
            for ( int column = 0; column < u[ row ].length; column++ )
                System.out.printf( "[%d]  ", u[ row ][ column ] );
            
                System.out.println();
        }
    } 


 //a)
  //    int[][] t = new int[2][3];
    
    //b)
        //two
    
    //c)
        //three
        
    //d)
        //6
        
    //e)
        //[1][0],[1][1],[1][2]
        
    //f)
        //[0][2],[1][2],[2][2]
        
    //g)
        // array[0][1] = 0;
        
    //h)
        /*
        array[0][0] = 0;
        array[0][1] = 0;
        array[0][2] = 0;
        array[1][0] = 0;
        array[1][1] = 0;
        array[1][2] = 0;
        */
        
    //i)
        /*
     for ( int row = 0; row < t.length; row++ ) {
            
            for ( int column = 0; column < t[ row ].length; column++ )
                System.out.printf( "%d  ", t[ row ][ column ] );
            
            System.out.println();

    */
    /*
    //j)
                for ( int row = 0; row < t.length; row++ ) {
            
            for ( int column = 0; column < t[ row ].length; column++ )
                System.out.printf( "[%d]  ", t[ row ][ column ] );
            
            System.out.println();
        }
        System.out.println();

        int[][] u = {{ 6, 5, 4 },{ 3, 2, 1 }};
        
         for ( int row = 0; row < t.length; row++ ) {
            
            for ( int column = 0; column < u[ row ].length; column++ )
                System.out.printf( "[%d]  ", u[ row ][ column ] );
            
                System.out.println();
        }
    }
*/
}
