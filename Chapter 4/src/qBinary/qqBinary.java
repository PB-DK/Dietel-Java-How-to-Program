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
public class qqBinary {
    
    public static void main(String args[]) {
       
    Scanner input = new Scanner( System.in );
    
        int number;
        int lastDigit;
        int reverse = 0;
        int counter = 1;
        int fin;
        
        System.out.println("Please enter a binary integer: ");
        number = input.nextInt();
        
        while ( number != 0 ) {
                
            lastDigit = number % 10; //   1101 % 10 = 1
            reverse = ( reverse * 10 ) + lastDigit;
            number = number / 10;    //   1101 / 10 = 110
    //        fin = lastDigit * counter;

            System.out.printf("%d * %d ", lastDigit, counter);
            
            if ( number != 0 )  {
            System.out.print("+ ");
        //    System.out.printf("%d + ", fin);

            counter = counter + counter;    //   1 + 1 = 2
            }
        }
        System.out.println();
        System.out.printf("Number is: %d\n", reverse);    
    }
}
/*
        System.out.println("Please enter a binary integer: ");
        binaryNumber = input.nextInt();
*/
