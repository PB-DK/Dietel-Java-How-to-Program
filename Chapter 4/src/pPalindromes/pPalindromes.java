/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pPalindromes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class pPalindromes {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int digit;
        int counter = 1;
        int num1, num2, num3, num4, digit1, digit2;
        
        System.out.println("Please enter a five digit integer ");
        digit = input.nextInt();
       
     
        num1 = digit / 10000;
        
        digit1 = digit / 1000;
        num2 = digit1 % 10;
        
        digit2 = digit / 10;
        num3 = digit2 % 10;
        
        num4 = digit % 10;
        
        if (( num1 == num4 ) && (num2 == num3 )) {
            System.out.printf("The number: %d \n"
                    + "is a palindrome because \n"
                    + "digit 1: %d is equal to digit 5: %d \n"
                    + "and digit 2: %d is equal to digit 4: %d \n"
                    , digit ,num1, num4, num2, num3);
        }
        else {
            System.out.printf("The number: %d \n"
                    + "is not a palindrome because either \n"
                    + "or both digit 1: %d is not equal to \n"
                    + "digit 5: %d and digit 2: %d is not \n "
                    + "equal to digit 4: %d \n", digit ,num1, 
                    num4, num2, num3);
        }
    }
}
        /*
        System.out.println( 12321 % 10);
        */    
            
        
    /*    
    num1 = 12321(digit) / 10000;        32423 / 10000 = 3
    
    num2; 12321 / 1000;   ( 12 )    12 % 10 = 2
            digit/1000 = digit1     digit1 % 10 = num2
    
    num3; 12321 / 10;    ( 1232 )   1232 % 10 = 2
        digit /10 = digit2

    num4; 12321 % 10;   (1)
        digit % 10 = num4
    */

