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
public class VarLenArgDouble {

    public static double product( double... numbers )
    {
        double product = 1.0;
        
        for ( double p : numbers )
            product *= p;
        
        return product;
    }    
    public static void main( String[] args ) {
        
        double[] sales = { 3.0, 8.0, 2.0, 23.0, 99.0 };
        
        double d1 = 3.0;
        double d2 = 8.0;
        double d3 = 2.0;
        double d4 = 23.0;
        double d5 = 99.0;
        
        System.out.printf( "d1 = %.1f\n"
            + "d2= %.1f\n"
                + "d3 = %.1f\n"
                    + "d4 = %.1f\n"
                        + "d5 = %.1f\n",
            d1, d2, d3, d4, d5 );
        
        System.out.printf( "Product of d1 and d2 is "
            + "%.1f\n", product( d1, d2 ));
               
        System.out.printf( "Product of d1 d2 and d3 is "
            + "%.1f\n", product( d1, d2, d3 ));
        
        System.out.printf( "Product of d1 d2 d3 and d4 is "
            + "%.1f\n", product( d1, d2, d3, d4 ));
                
        System.out.printf( "Product of d1 d2 d3 d4 "
            + "and d5 is %.1f\n", product( d1, d2, d3, d4, d5 ));
    }
}    
//            int[][] sales = new int[ 3 ][ 5 ];
    