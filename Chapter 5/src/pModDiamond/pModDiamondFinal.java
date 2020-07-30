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
public class pModDiamondFinal {
    
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
   
            int y = 11;
            int m = 1;
           
            for ( int z = 1; z <= y - ( m / 2); z++ ) {
            
            for ( int l = 0; l < z ; l++ ) {
                
                System.out.print("^");
            }
            for ( m = 11; m + 1 >= (2 * z); m-- ) {   
                System.out.print("*");
            }
            System.out.println();
           }
    }
}
  //         for ( int m = y; m >= ( z / 2) - 3; m-- ) {
  //         for ( int m = 8; m + 1 > (2 * z); m-- ) {


       /*
        System.out.println("Enter an odd number in the "
                + "range of 1 to 19");
        int r = input.nextInt();
        */