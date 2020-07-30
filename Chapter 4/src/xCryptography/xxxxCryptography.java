/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xCryptography;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class xxxxCryptography {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int number;
        int counter = 1;
        int digit;
        int remainder;
        int newNumber = 0;
        int newValue;
        int counter1 = 1;
        int result = 0;
        int place = 100;
        
        System.out.println("Enter a number to encrypt: ");
        number = input.nextInt();
        
        while ( counter <= 4 ) {
            digit = number % 10;
            newValue = digit + 7;
            remainder = newValue % 10;
            number = number / 10;
            newNumber = newNumber + ( remainder * counter1 );
            counter1 = counter1 * 10;
            
            counter++;           
        }
        while ( newNumber > 9 ) {
            result = result + ( place * ( newNumber % 10 ));
            newNumber = newNumber / 10;
            
            result = result + ( place * 10 * ( newNumber % 10));
            newNumber = newNumber / 10;
            place = place / 100;
            
        }
        System.out.printf("Number: %d\n", result);     
    }
}