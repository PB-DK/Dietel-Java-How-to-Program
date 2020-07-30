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
public class oDiamond1 {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        for ( int i = 1; i < 19; i = i + 2 ) {
            System.out.print("*");
        }
        System.out.println();
        
        for ( int j = 1; j < 14; j = j + 2 ) {
            System.out.print("*");
        }
        System.out.println(); 
        
        for ( int k = 1; k < 10; k = k + 2 ) {
            System.out.print("*");
        }
        System.out.println();
                
        for ( int l = 1; l < 6; l = l + 2 ) {
            System.out.print("*");
        }
        System.out.println();
                
        for ( int m = 1; m < 2; m = m + 2 ) {
            System.out.print("*");
        }
        System.out.println();
    }    
}
