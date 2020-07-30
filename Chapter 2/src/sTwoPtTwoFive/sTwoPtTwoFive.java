/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sTwoPtTwoFive;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class sTwoPtTwoFive {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int x ;
        
        System.out.print("Enter an integer: ");
        x = input.nextInt();
        
        if ( (x % 2) == 0) {
            System.out.printf("%d is an even number\n", x);
        }
        if ( (x % 2) != 0) {
            System.out.printf("%d is an odd number\n", x);
        }
    }
        
        
    }
    

