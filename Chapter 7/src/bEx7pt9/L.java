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
public class L {
    
    public static void main(String[] args) {    
    
            int[][] v = {{ 6, 5, 4 },{ 3, 2, 1 },{ 3, 2, 1 }};
        
        for ( int row = 0; row < v.length; row++ ) {
            
            for ( int column = 0; column < v[ row ].length; column++ )
                System.out.printf( "[%d]  ", v[ row ][ column ] );
            
                System.out.println();
        }
        System.out.println();
        
        for ( int row = 0; row < v[1][1]; row++ ) {
            
            for ( int column = 0; column < v[ row ].length; column++ )
                System.out.printf( "[%d]  ", v[ 0 ][ column ] );        
        }
        System.out.println();
        System.out.println();
//********************************************************************
                
        for ( int column = 0; column < v[ 0 ].length; column++ )
                System.out.printf( "[%d]  ", v[ 0 ][ column ] );        
        
        System.out.println();
    }
    }    

