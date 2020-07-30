/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aEx7pt8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class eSmallestLargest {
    
    private float[] w;
    
    public static void main( String args[] ) {
        
    float[] w = { 9, 5, 13, 18, 76, 51 };
   
    float smallest = w[ 0 ];
    float largest = w[ 0 ];
    
    for ( int row = 0; row < w.length; row++ ) {
        
        for ( int column = 0; column < w.length; column++ ) {
                    
            for ( float xw : w) {
        
            if ( xw < smallest ) {
                smallest = xw;
            } else {
                smallest = smallest;
                }
            }
        }
    }  
        for ( int row = 0; row < w.length; row++ ) {
        
        for ( int column = 0; column < w.length; column++ ) {
                    
            for ( float xw : w) {
        
            if ( xw > largest ) {
                largest = xw;
            } else {
                largest = largest;
                }
            }
        }
    } 
    System.out.printf( "Minimum of w: %.1f\n", smallest );
    System.out.printf( "Maximum of w: %.1f", largest );
    
    System.out.println();
            //getMinimum() );
    }
}
    /*
    public void processNumbers() {
        
        System.out.printf( "Smallest number: ", getMinimum());
        
    }
    
    public float getMinimum() {
    
        float smallest = w[ 0 ];
        
        for ( float xw : w) {
        
        if ( xw < smallest ) {
            smallest = xw;
            } 
        }
        return smallest;
    }
}

    
    
    
    
    public void displayArray( float[] w, float smallest ) {
        
    System.out.printf( "\n%f: ", getMinimum() );

    for ( float value : w ) {
        System.out.printf( "%f ", value );
        }    
    }
}
*/