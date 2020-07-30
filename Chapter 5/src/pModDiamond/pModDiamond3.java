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
public class pModDiamond3 {
    
    public static void main(String args[]) {
        
    Scanner input = new Scanner( System.in );
    
        int y = 17;
        int m = 1;
           
           for ( int z = 1; z <= y - ( m / 2); z++ ) {
            
            for ( int l = 0; l < z - 1; l++ ) {
                
                System.out.print(" ");
            }
  //         for ( int m = y; m >= ( z / 2) - 3; m-- ) {
  //         for ( int m = 8; m + 1 > (2 * z); m-- ) {

            for ( m = 17; m + 1 >= (2 * z); m-- ) {   
                System.out.print("*");
            }
            System.out.println();
           }
    //             for ( int m = y; m >= z; m-- ) {

}
}
