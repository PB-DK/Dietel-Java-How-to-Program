/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eEx7pt12;

/**
 *
 * @author User
 */
public class DE4 {
    
    public static void main(String[] args) {
        
        int[] array = { 18, 96, 71, 71, 34, 49 };
        int temp = 0;
        int n = 0, num = 0;
        
        for ( int row = 0; row < array.length; row++ ) {
  
            if ( array[ num ] != array[ num + 1 ] ) {
                System.out.printf("%d ", array[ num ] );
                }
            n++;
        }        
    }    
}
