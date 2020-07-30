/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qBinary;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class qBinary {
    
    public static void main(String args[]) {
       
    Scanner input = new Scanner( System.in );
    
    int binaryNumber;
    int counter = 1;
    int digit1, digit2, digit3, digit4,
            work3, work2;
   
    
    System.out.println("Please enter a binary integer: ");
    binaryNumber = input.nextInt();
    
    digit1 = binaryNumber % 10;      //   1101 % 10 = 1
    work3 = binaryNumber / 10;       //   1101 / 10 = 110
    
    digit2 = work3 % 10;             //   110 % 10 = 0
    work2  = work3 / 10;             //   110 / 10 = 11
    
    digit3 = work2 % 10;             //   11 % 10 = 1 
    digit4  = work2 / 10;            //    11 / 10 = 1
    
    System.out.printf(
            "The decimal equivalent of binary number\n" 
            +"%d is: %d * 1 + %d * 2 + %d * 4 + %d * 8\n",
            binaryNumber, digit1, digit2, digit3, digit4);
    }
}
    /*
    System.out.printf("");
      
    
      
    
    binaryNumber % 1
    
    System.out.println("Please enter a binary integer: ");
    binaryNumber = input.nextInt();
    
    while ( counter <= 3) {
    
        binaryNumber = binaryNumber / divider;      1101/10=110
        digit = binaryNumber % divider;             1101%10=1
    
        divider = divider * 10;          
    
        
*/
 /*   System.out.println( 1101 % 10 );    
    
    System.out.println( 1101 / 10 );
    }
}*/
