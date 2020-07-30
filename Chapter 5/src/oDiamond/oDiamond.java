/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oDiamond;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class oDiamond {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        for ( int j = 0; j < 5; j++ ) {
            
            for ( int i = 4; i > j ; i-- ) {
                
                System.out.print(" ");
            }
            for ( int k = 1; k < ( 2 * j ) + 2; k++ ) {
        
                System.out.print("*");
            }
            System.out.println();
        }
        
        for ( int z = 1; z < 5; z++ ) {
            
            for ( int l = 0; l < z; l++ ) {
                
                System.out.print(" ");
            }
            for ( int m = 8; m + 1 > (2 * z); m-- ) {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }  
      
        
        
        
        
        
        
        
 /*       for ( int m = 4; m > j; m-- ) {
                System.out.print(" ");
        }*/
}
