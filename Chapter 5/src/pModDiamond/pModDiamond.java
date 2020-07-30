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
public class pModDiamond {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int r = 13;
        int l = 0;
        
        for ( int j = 0; j < r; j++ ) {
            
            for ( int i = r - l; i > j ; i-- ) {
                
                System.out.print(" ");
            }
            for ( int k = 1; k < ( 2 * j ) + 2; k++ ) {
        
                System.out.print("*");
            }
            System.out.println();
        }
        
        for ( int z = 1; z < r; z++ ) {
            
            for ( l = 0; l < z; l++ ) {
                
                System.out.print(" ");
            }
            for ( int m = 8; m + 1 > (2 * z); m-- ) {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}
