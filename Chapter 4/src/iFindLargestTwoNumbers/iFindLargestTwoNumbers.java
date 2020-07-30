/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iFindLargestTwoNumbers;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class iFindLargestTwoNumbers {
    
    public static void main(String args[]) {
        
    Scanner input = new Scanner( System.in );
        
    int number;
    int largest = 0;
    int secondLargest = 0;
    int counter = 1;
        
    while ( counter <= 10 ) {   //    54, 7, 65, 2, 8, 9, 3, 11, 13, 17 
            
        System.out.println("Please enter number: ");
        number = input.nextInt();
            // second largest
        if (number > largest) {         // 54 > 0   // 7 > 54   // 65 > 54    //  2 > 65
            secondLargest = largest;    // 0>0                  // 54         //
            largest = number;           // 54                   // 65         //
            }
        else if (number > secondLargest) {//        // 7 > 0                  //  2 > 
	    secondLargest = number;       //        // 
        }
            counter++;
    }
        System.out.printf("Largest number is %d\n"
                + "Second largest number is %d\n"
                , largest, secondLargest);
    }
}

/*
find the largest two numbers
******************************************************
declare/initialize variables
prompt/input 10 numbers
calculate largest and second largest
******************************************************
variables:
number
largest = 0
second largest = 0

while counter is less than or equal to 10
    prompt user for number 1 2 3 etc
    input 13t 2nd etc number

    if largest is greater than number
       largest = largest
    else
        largest = number
*/


           /*
            if ((largest > secondLargest) && (secondLargest > number))  {
                secondLargest = secondLargest;
            }
            else {
                secondLargest = number;
            }
                
  /*           // largest
        if ( largest > number ) {       // 0>54     // 54 > 7     // 54 > 65     
            largest = largest;                      // 
            }
        else {
            largest = number;           // 54                     // 65
            }*/ 