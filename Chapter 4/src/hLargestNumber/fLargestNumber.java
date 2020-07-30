/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hLargestNumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class fLargestNumber {
    

/*
find the largest number of units sold by each salesperson
*******************************************************
-variables:
 initialize variables 
-prompt the user to enter no. of units sold
 input no. of units sold
-find the largest amount of units sold
******************************************************
-counter
 number
 largest
-while counter is less than or equal to 10
 prompt the user to enter no. of units sold
 input no. of units sold
 
 loop counter adds one and loops around ten
 times
*/
    public static void main(String args[]) {
        
         Scanner input = new Scanner( System.in );
        int counter = 1;
        int number = 0;
        int largest = 0;
        
        while ( counter <= 10 ) {
            
            System.out.printf("Enter the amount "
                + "of units sold by employee "
                + "number %d?\n" ,counter);
            number = input.nextInt();
            
            if ( largest > number) {
                largest = largest;
            }        
            else {
                largest = number;
            }
            counter = counter + 1;           
        }
        
        System.out.printf("The largest number "
            + "of items sold is:%d\n", largest);
    }

}
