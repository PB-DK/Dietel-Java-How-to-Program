/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eAddition;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class eAddition {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner( System.in );
        
        int number1;
        int number2;
        int sum;
        
        System.out.print("Enter first integer ");
        number1 = input.nextInt();
        
        System.out.print("Enter second integer ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.printf("%s%d\n%s%d\n%s%d\n",
        "The sum of ", number1, "and ", number2, 
        "is equal to ", sum);
        
       
        
    }
    
}
