/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aEx7pt8;

import java.util.Arrays;
/**
 *
 * @author User
 */
public class dCopy1a {
    
    public static void main(String[] args) {

        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[ intArray.length ];
        System.arraycopy( intArray, 0, intArrayCopy, 0, intArray.length );
        displayArray( intArray, "intArray" );
        displayArray( intArrayCopy, "intArrayCopy" );

        System.out.println();
    }
    public static void displayArray( int[] array, String description ) {
        
    System.out.printf( "\n%s: ", description );

    for ( int value : array ) {
        System.out.printf( "%d ", value );
    }
    }
}
