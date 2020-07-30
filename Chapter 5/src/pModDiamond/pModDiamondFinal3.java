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
public class pModDiamondFinal3 {
    
        public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
    
        int r = 7;
        
        
        
        
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
            }        
        }    
    }
