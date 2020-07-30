/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pModDiamond;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class pModDiamondFinal2 {
    
    
    public static void main(String args[]) {
        
    Scanner input = new Scanner( System.in );
    
        int r = 7;

        for ( int j = 0; j < r; j++ ) {
            
            for ( int i = r - 1; i > j ; i-- ) {
                
                System.out.print("^");
            }
            for ( int k = 1; k < ( 2 * j ) + 2; k++ ) {
        
                System.out.print("*");
            }
            System.out.println();
        }
        
        for ( int z = r; z > 1; z-- ) {
            
            for ( int y = r; y >= z; y--  ) {
                
                System.out.print("^");
            }
            for ( int x = 1; x < ( 2 * ( z - 1 )); x++) {
                
                System.out.print("*");
            }            
                System.out.println();
        }
    }
}
        
        
        
        
        
        
   /*
            int y = 13;
            int m = 1;
           
            for ( int z = 1; z <= y - ( m / 2); z++ ) {
            
            for ( int l = 0; l < z ; l++ ) {
                
                System.out.print("^");
            }
            for ( m = 11; m + 1 >= (2 * z); m-- ) {   
                System.out.print("*");
            }
            System.out.println();
        }*/
   
