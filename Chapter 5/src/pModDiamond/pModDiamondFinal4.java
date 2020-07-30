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
public class pModDiamondFinal4 {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        System.out.println("Enter the number of "
                + "lines you would like the diamond "
                + "to have, number must be between "
                + "1 and 19: ");
        int number = input.nextInt();
        
    if ( (number > 0 ) && ( number < 20 )) {
    
        int r = ( (number / 2) + 1 );

        for ( int j = 0; j < r; j++ ) {
            
            for ( int i = r - 1; i > j ; i-- ) {
                
                System.out.print(" ");
            }
            for ( int k = 1; k < ( 2 * j ) + 2; k++ ) {
        
                System.out.print("*");
            }
                System.out.println();
        }
        
        for ( int z = r; z > 1; z-- ) {
            
            for ( int y = r; y >= z; y--  ) {
                
                System.out.print(" ");
            }
            for ( int x = 1; x < ( 2 * ( z - 1 )); x++) {
                
                System.out.print("*");
            }            
                System.out.println();
            }
        }
    else 
    {
        System.out.println("You have not entered a valid number");
    }
    }    
}
