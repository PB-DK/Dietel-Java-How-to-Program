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
public class wwFactorial {    
        
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
 
        double e = 0.0;
        int number ;
        double factorial = 1; 
        int counter = 1;
        
        System.out.println("Enter a number of values "
        + "to estimate the value of e: ");
        number = input.nextInt();
        
            while ( counter <= number ) {
                
                e = e + (1 / ( factorial )); 
                
                factorial = factorial * counter;
                counter++;
            //    factorial++;
            }
            System.out.printf("The value of e is: %f "
                + "with %d number of terms\n",e ,number);
        
       
        
}
}
/*
           
                e += 1/(factorial = factorial * counter); 
*/