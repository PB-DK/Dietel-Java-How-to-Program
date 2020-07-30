/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rTwoPtTwoFour;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class rTwoPtTwoFour {
    
        public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int a, b, c, d, e;
        
        System.out.print("Enter the first digit: ");
        a = input.nextInt();
                
        System.out.print("Enter the second digit: ");
        b = input.nextInt();
                
        System.out.print("Enter the third digit: ");
        c = input.nextInt();
                
        System.out.print("Enter the fourth digit: ");
        d = input.nextInt();
                
        System.out.print("Enter the fifth digit: ");
        e = input.nextInt();
        
        if ((a > b) && (a > c) && (a > d) && (a > e)) {
            System.out.printf("%d is the largest number\n", a );
        }
        if ((b > a) && (b > c) && (b > d) && (b > e)) {
            System.out.printf("%d is the largest number\n", b );
        }
        if ((c > b) && (c > a) && (c > d) && (c > e)) {
            System.out.printf("%d is the largest number\n", c );
        }
        if ((d > b) && (d > c) && (d > a) && (d > e)) {
            System.out.printf("%d is the largest number\n", d );
        }
        if ((e > b) && (e > c) && (e > d) && (e > a)) {
            System.out.printf("%d is the largest number\n", e );
        }
        if ((a < b) && (a < c) && (a < d) && (a < e)) {
            System.out.printf("%d is the smallest number\n", a );
        }
        if ((b < a) && (b < c) && (b < d) && (b < e)) {
            System.out.printf("%d is the smallest number\n", b );
        }
        if ((c < b) && (c < a) && (c < d) && (c < e)) {
            System.out.printf("%d is the smallest number\n", c );
        }
        if ((d < b) && (d < c) && (d < a) && (d < e)) {
            System.out.printf("%d is the smallest number\n", d );
        }
        if ((e < b) && (e < c) && (e < d) && (e < a)) {
            System.out.printf("%d is the smallest number\n", e );
        }
    
}
}
