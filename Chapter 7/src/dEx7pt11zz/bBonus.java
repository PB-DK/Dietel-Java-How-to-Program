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
public class bBonus {
    
    public static void main( String[] args ) {

        int[] bonus = new int [15];   
    /*    
            for ( int row = 0; row < bonus.length; row++ ) {
            
                System.out.printf( "%d  ", (bonus[ row ] + 1) );
            }
            System.out.println();
    */        
        int[] bonus1 = { 5, 6, 9, 12, 16, 25, 
            93, 37, 2, 77, 102, 88, 989, 33, 1 };
        
            for ( int row = 0; row < bonus1.length; row++ ) {
            
                System.out.printf( "%d  ", (bonus1[ row ] + 1) );
            }
            
            System.out.println();

        
    }    
}
