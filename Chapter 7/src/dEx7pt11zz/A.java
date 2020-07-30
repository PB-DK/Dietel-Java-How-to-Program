/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dEx7pt11zz;

/**
 *
 * @author User
 */
public class A {
    
    public static void main( String[] args ) {
        
        double[] counts = new double [ 10 ]; 
        
        for ( int row = 0; row < counts.length; row++ ) {
            
        //    for ( int column = 0; column < counts[ row ].length; column++ )
                System.out.printf( "%.1f  ", counts[ row ] );
            }
            System.out.println();
        
        System.out.print("counts = {");
            
        for ( int row = 0; row < counts.length; row++ ) {
            
        //    for ( int column = 0; column < counts[ row ].length; column++ )
                System.out.printf( "%.1f, ", counts[ row ] );
            }
        System.out.println("}");
    }    
}
