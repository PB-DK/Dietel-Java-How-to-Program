/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tTwoPtTwoSix;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class tTwoPtTwoSix {
    
        public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int x, y ;
        
        System.out.print("Enter an integer: ");
        x = input.nextInt();
        
        System.out.print("Enter a second integer: ");
        y = input.nextInt();
        
        if ( x % y == 0) {
            System.out.printf("%d is a multiple of %d\n", x, y);
        }
        if ( x % y != 0) {
            System.out.printf("%d is not a multiple of %d\n", x, y);
        }
        }  
}
