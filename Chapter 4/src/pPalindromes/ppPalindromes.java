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
public class ppPalindromes {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int reverse = 0;
        int number;
        int counter = 1;
        int digit,realNumber;
        
        System.out.println("Enter a number");
        number = input.nextInt();
        
        realNumber = number;
    
        while ( counter <= 5 ) {
            
            digit = number % 10;               // 35953 % 10 = 3       3595 % 10 = 5       359 % 10 = 9     35 % 10 = 5      3 % 10 = 3
            reverse = ( reverse * 10 ) + digit;// 3                    30 + 5 = 35         350 + 9 = 359    3590 + 5 = 3595  35950 + 3 = 35953
            number = number / 10;              // 35953 / 10 = 3595    3595 / 10 = 359     359 / 10 = 35    35 / 10 = 3      3 / 10 = 0
            
            counter++;
        }
        
        if ( realNumber == reverse ) {
            System.out.printf("Number %d is a Palindrome\n", realNumber);
        }
        else  {
            System.out.printf("Number %d is not a Palindrome\n", realNumber);            
        }
    }
}
        
        /*
        
        int num, temp, digit, count = 0;
        
        //getting the number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = scanner.nextInt();
        scanner.close();
        
        //making a copy of the input number
        temp = num;
        
        //counting digits in the input number
        while(num > 0)
        {
            num = num / 10;
            count++;
            }
        while(temp > 0)
        {
            digit = temp % 10;
            System.out.println("Digit at place "+count+" is: "+digit);
            temp = temp / 10;
            count--;
        }
    }   
}
*/