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
public class lDeclareArray {
    
    public static void main( String[] args ) {
        
        int[][] t = new int [2][3];   
    
      //  for ( int row = 0; row < t.[0]; row++ ) {
            
            for ( int column = 0; column < t[ 0 ].length; column++ ) {
                
                System.out.printf( "[%d]  ", t[ 0 ][ column ] );
            }
            System.out.println();
            /*
        
            for ( int row = 0; row < t[ row ].length; row++ ) {
                
    //          for ( int column = 0; column < t[ 2 ].length; column++ ) {
                
                System.out.printf( "[%d]  \n", t[ column ][ row ] );
            }
            System.out.println();
*/
        }   
    }
