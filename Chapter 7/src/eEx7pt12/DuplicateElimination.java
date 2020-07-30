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
public class DuplicateElimination {
    
    public static void main( String[] args) {
        
        int[] array = { 18, 96, 71, 71, 34 };
        int temp = 0;
        int num = 0;
        int n = 1;
            
            for ( num = n - 1; num < 5; num++ ) {
            
                for ( n = 1; n < 5; n++ ) {
                    
                    if ( array[ n ] != array[ num ] ) {
                        System.out.printf("%d ", array[ num ] );
                        break;
                        }                    
                }            
            }        
        System.out.println();
        System.out.println();
        
//***************************************************************
        int[] array1 = { 18, 96, 71, 71, 34 };
        int temp1 = 0;
        int num1 = 0;
       // int n = 0;
            
            for ( num1 = 0; num1 < 5; num1++ ) {
            
                for ( int n1 = 0; n1 < 5; n1++ ) {
                    
                    if ( array1[ n1 ] != array1[ n1 + 1 ] ) {
                        System.out.printf("%d ", array1[ n1 + 1 ] );
                        break;
                        }                    
                }            
            }        
        System.out.println();
        System.out.println();

//***************************************************************

        int[] array2 = { 18, 96, 71, 71, 34 };
        int temp2 = 0;
        int num2 = 0;
        int n2 = 0;
            
            for ( num2 = 0; num2 < 5; num2++ ) {
            
                for ( int l2 = 0; l2 < 5; l2++ ) {
                    
                    if ( array2[ n2 ] != array2[ num2 ] ) {
                        System.out.printf("%d ", array2[ num2 ] );
                        }
                    num2++;
                }            
            }        
        System.out.println();
    }
}
//}



    
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
    
        int[] array = { 18, 96, 71, 71, 34, 49 };
        int temp = 0;
        int num = 0;
        
        for ( int row = 0; row < array.length; row++ ) {
  
            if ( array[ num ] != array[ num + 1 ] ) {
                System.out.printf("%d ", array[ num ] );
            }
            if ( array[ num ] == array[ 5 ] ) {
                break;
            }
            num++;
        }
        System.out.println();
        */