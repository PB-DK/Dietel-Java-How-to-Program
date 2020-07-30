/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bFindSmallestValue;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class bFindSmallestValue {
    
    public static void main(String args[]) {

        Scanner input = new Scanner( System.in );
        
        int value;
        int small = 1000000;
        int number = 0;
        
        System.out.print("Enter a number of values "
                + "to find the smallest of: ");
        value = input.nextInt();
        
        for ( int i = 1; i <= value; i++ ) {        
            System.out.print("Enter a number: ");
            number = input.nextInt();
             
            if ( small < number){
                small = small;
            }    
            else {
                small = number;
            }
        }
        System.out.printf(
            "The smallest number is: %d\n", small);
    }
}
/*
when i initialize small = 0, that ends up the smallest,
so what should i do? i dont like initializing it to 
1000000 but whats a better way?  
*/