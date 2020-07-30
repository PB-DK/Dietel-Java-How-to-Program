/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gEx7pt14zz;

/**
 *
 * @author User
 */
public class VarLenArgArray {

    public static int product( int... numbers )
    {
        int product = 1;
        
        for ( int p : numbers )
            product *= p;
        
        return product;
    }    
    public static void main( String[] args ) {
        
        int[] sales = { 3, 8, 2, 23, 99 };
        
        int num = 0;
        int count = 1;
        
        System.out.printf( "d1 = %d \nd2 = %d \n"
            + "d3 = %d \nd4 = %d \nd5 = %d\n", 
                sales[0], sales[1], sales[2], 
                    sales[3], sales[4] );
        
        while ( count <= 5 ) {
            System.out.printf( "Product of %d and %d is "
                + "%d\n", product( sales[num], sales[num++] ));
        }
    /*           
        System.out.printf( "Product of d1 d2 and d3 is "
            + "%d\n", product( d1, d2, d3 ));
        
        System.out.printf( "Product of d1 d2 d3 and d4 is "
            + "%d\n", product( d1, d2, d3, d4 ));
                
        System.out.printf( "Product of d1 d2 d3 d4 "
            + "and d5 is %d\n", product( d1, d2, d3, d4, d5 ));
    */
        }
}



/*
            int[][] sales = new int[ 3 ][ 5 ];
    */