/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zTwoPtThreeTwo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class zTwoPtThreeTwo {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int num1, num2, num3, num4, num5;
        int negative = 0, positive = 0, zero = 0;
        
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        
        System.out.print("Enter a third number: ");
        num3 = input.nextInt();
        
        System.out.print("Enter a fourth number: ");
        num4 = input.nextInt();
        
        System.out.print("Enter a fifth number: ");
        num5 = input.nextInt();
        
        if ( num1 < 0)  {
            negative++;
        }
        if ( num2 < 0)  {
            negative++;
        }
        if ( num3 < 0)  {
            negative++;
        }
        if ( num4 < 0)  {
            negative++;
        }
        if ( num5 < 0)  {
            negative++;
        }
        if ( num1 > 0)  {
            positive++;
        }
        if ( num2 > 0)  {
            positive++;
        }
        if ( num3 > 0)  {
            positive++;
        }
        if ( num4 > 0)  {
            positive++;
        }
        if ( num5 > 0)  {
            positive++;
        }
        if ( num1 == 0)  {
            zero++;
        }
        if ( num2 == 0)  {
            zero++;
        }
        if ( num3 == 0)  {
            zero++;
        }
        if ( num4 == 0)  {
            zero++;
        }
        if ( num5 == 0)  {
            zero++;
        }
        
        System.out.printf("The number of negative numbers is %d\n",
                negative);
        System.out.printf("The number of positive numbers is %d\n",
                positive);
        System.out.printf("The number of zeros is %d\n", 
                zero);
        System.out.printf("From the numbers %d, %d,"
                + " %d, %d, %d\n", num1, num2, num3, num4, num5);
        
        
    
}
}
