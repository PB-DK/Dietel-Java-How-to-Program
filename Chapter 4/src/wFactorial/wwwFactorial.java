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
public class wwwFactorial {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );    
    
        double e = 0.0;   
        int number = 5;  //x = number
        double factorial = 1.0; 
        int counter = 1;
        int n = 0;
        int x = 0;
        /*   
        System.out.println("Enter a number of values "
        + "to estimate the value of e: ");
        number = input.nextInt();    //x = number
        */
            while ( counter <= number ) {
                
            e += ( Math.pow(x, n)) / (factorial * counter);           
            
                n++;            
                counter++;
                x++;
                }
            System.out.printf("The value of e is: %f "
                + "with %d number of terms\n",e ,number);
    }
}
/*

 
        String x = "x";
        double e = 0.0;
        int number = 5;
        double factorial = 0.0; 
        int counter = 1;
        int n = 0;
    /*   
        System.out.println("Enter a number of values "
        + "to estimate the value of e: ");
        number = input.nextInt();
        
            while ( counter <= number ) {

            e = ( x . Math.pow(1, n) / (factorial * counter));            
            
                n++;            
                counter++;
         //       x++;
            }
            System.out.printf("The value of e is: %f "
                + "with %d number of terms\n",e ,number);
    }
}

*/