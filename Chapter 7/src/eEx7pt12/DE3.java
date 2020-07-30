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
public class DE3 {
    
        public static void main( String[] args) {
        
        int[] array = { 18, 96, 71, 71, 34 };
        int n = 0;
        int x = 1;  
        
        while ( x < 5 ) {
            
            if ( array[ n ] != array[ n + 1 ] ) {
                System.out.printf("%d ", array[ n ] );
                }
            else {
                n++;
                continue;
            }
            if ( n == 3 ) {
                break;
            }
            n++;
            x++;
        }   
        System.out.println();
        }   }
//********************************************************
  /*      
        int[] array = { 18, 96, 71, 71, 34 };
        int temp = 0;
        int num = 0;
     //   int n = 1;
        int x = 1;  
        
        for ( int n = 0; n < 5; n++ ) {
            
            if ( array[ n ] != array[ n + 1 ] ) {
                System.out.printf("%d ", array[ n ] );
                }
            else {
                continue;
            }
        }
            */
//********************************************************
        
        /*
        while ( x < 6 ) {
            if ( array[ n ] != array[ n + 1 ] ) {
                System.out.printf("%d ", array[ n ] );
            }
            else {
                continue;
            }
            n++;
        x++;
        }
    }   
*/
        
