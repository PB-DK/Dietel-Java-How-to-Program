/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nTwoPtOneSix;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class nTwoPtOneSix {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int num1 = 0, num2 = 0;
        
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();        
        
        if ( num1 > num2 )  {
            System.out.printf("%d is larger than %d\n", num1 , num2 );
        }
        if ( num2 > num1 )  {
            System.out.printf("%d is larger than %d\n", num2 , num1 );
        }
        if ( num1 == num2 )  {
            System.out.printf("%d is equal to %d\n", num1 , num2 );
        }
        
        
        
        
    }
    
}
