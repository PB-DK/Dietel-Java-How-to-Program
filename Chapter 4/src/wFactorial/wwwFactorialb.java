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
public class wwwFactorialb {
    
    public static void main(String[] args) {
            
    Scanner input = new Scanner( System.in );
    
    double e = 2.718281828;
    int x = 0;
    double ans = 0.0;
   /* 
        System.out.println("Enter a number of values "
        + "to estimate the value of e^x: ");
        x = input.nextInt(); 
    */
   for ( x = 1; x < 5; x++ ) {
       
       ans = Math.pow( e, x );       
   }
   System.out.printf("%f\n", e);
    
    
    
}
}
