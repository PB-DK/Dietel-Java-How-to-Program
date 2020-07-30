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
public class dCopy {
    
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 
                6, 7, 8, 9, 10, 11 };
        int[] b = new int[ 34 ];
        
        System.arraycopy(a, 0, b, 0, a.length);
        displayArray( a, "Array A");
        displayArray( b, "Array B");
        System.out.println();
                
        System.arraycopy(a, 0, b, 5, a.length);
        displayArray( a, "Array A");
        displayArray( b, "Array B");
        System.out.println();
    }
    public static void displayArray( int[] array, String description ) {
        
    System.out.printf( "\n%s: ", description );

    for ( int value : array ) {
        System.out.printf( "%d ", value );
        }
    }
}
