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
public class pModDiamond2 {
    
    public static void main(String args[]) {
        
    Scanner input = new Scanner( System.in );
    
        int r = 13;
       /*
        System.out.println("Enter an odd number in the "
                + "range of 1 to 19");
        int r = input.nextInt();
        */
        for ( int j = 0; j < r; j++ ) {
            
            for ( int i = r - 1; i > j ; i-- ) {
                
                System.out.print(" ");
            }
            for ( int k = 1; k < ( 2 * j ) + 2; k++ ) {
        
                System.out.print("*");
            }
            System.out.println();
        }
    
}
}
