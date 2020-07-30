/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wFactorial;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class wFactorial {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int number;
        int factorial = 1; 
        int counter = 1;
        
        System.out.println("Enter an integer you would "
            + "like the factorial of: ");
        number = input.nextInt();
        
        while ( counter <= number ) {
            factorial = factorial * counter;
            
            counter++;
            } 
            System.out.printf("Factorial of %d "
                + "is: %d\n", number, factorial);
    }
}
        
        
        
        /*    
        System.out.println("Enter an integer you would "
                + "like the factorial of: ");
        number = input.nextInt();
        
        while ( counter <= num - 1 ) {               //  1 <= 5          2 <= 5
            factorial = factorial * (number = number - 1);     //  20 = 5 * 4       =              number = number - 1            

            counter++;                              //  2 = 1 + 1
        }        
        System.out.printf("The factorial of %d "
                + "is %d\n", counter, factorial);        
   */
/*
im not happy with the way i did this, want it better 

















































//   number = number - 1;

*/