/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mModifiedTriangle;

/**
 *
 * @author User
 */
public class mModifiedTriangle {
    
    public static void main(String args[]) {
        
        for ( int j = 0; j < 10; j++ ) {
            
            for ( int i = 0; i < j + 1; i++ ) {
                
                System.out.print("*");
            }  
            for ( int k = 10; k > j; k-- ) {
                
                System.out.print(" ");
            }
            for ( int l = 10; l > j; l-- ) {
                
                System.out.print("*");
            }
            for ( int m = 0; m < j + 1; m++ ) {
                
                System.out.print(" ");
            }
            for ( int n = 0; n < j + 1; n++ ) {
                
                System.out.print(" ");
            }
            for ( int o = 10; o > j; o-- ) {
                
                System.out.print("*");
            } 
            for ( int p = 10; p > j; p-- ) {
                
                System.out.print(" ");
            }
            for ( int q = 0; q < j + 1; q++ ) {
                
                System.out.print("*");
            }
            System.out.println();
        }       
    }   
}
