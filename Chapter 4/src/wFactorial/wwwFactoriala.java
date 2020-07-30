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
public class wwwFactoriala {    
      
// Java code to print the  
// sum of the series 
 
    public static void main(String[] args) {
            
        Scanner input = new Scanner( System.in );
{// 1 + x^1/1! + x^2/2!  + x^3/3! + ....+ x^n/n!
//  1 + x^1/1! + x^2/2*1 + x^3/3*2*1
//  1 + 1/1    + 2^2/2   + 3^3/6  
//  1 + 1      + 4/2     + 3*3*3/6
//  2          + 2       + 1.5
//  4                    + 1.5
//  5.5
        double i = 1.0;
        double total = 1.0; 
        int n = 25; 
        int x = 1;
        double z = 1.0;        
                   
        System.out.println("Enter a number of values "
        + "to estimate the value of e: ");
        n = input.nextInt();    //x = number
            
        for (i = 1; i <= n; i++) {
        z = z * i;

        total = total +  
                ( Math.pow(x, i) / z );
        x++;
        }    
    System.out.printf("\n%f\n", total );
/*  Enter a number of values to estimate the value of e: 
    35

    170257107406764.470000
    BUILD SUCCESSFUL (total time: 4 seconds)
        */
        } 
    }
}
    

