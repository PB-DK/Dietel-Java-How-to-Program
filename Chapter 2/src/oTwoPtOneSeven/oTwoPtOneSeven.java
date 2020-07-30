/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oTwoPtOneSeven;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class oTwoPtOneSeven {
    
    public static void main(String args[]) {        
        
        Scanner input = new Scanner( System.in );
        
        int num1, num2, num3, sum, average, product,
                numValues = 0;
        
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        numValues++;
        
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        numValues++;
        
        System.out.print("Enter third integer: ");
        num3 = input.nextInt();
        numValues++;
        
        sum = num1 + num2 + num3;
        average = sum / numValues++; 
        product = num1 * num2 * num3;
 /*       
        if ( num1 > ((num2) & (num3)) ) {
            System.out.printf("%d is smaller than %d and %d\n",
            num1, num2, num3);
        }
*/
        if ( (num1 > num2) && (num1 > num3) ) {
            System.out.printf("%d is larger than %d and %d\n",
            num1, num2, num3);
        }
        if ( (num2 > num1) && (num2 > num3) ) {
            System.out.printf("%d is larger than %d and %d\n",
            num2, num1, num3);
        }
        if ( (num3 > num2) && (num3 > num1) ) {
            System.out.printf("%d is larger than %d and %d\n",
            num3, num2, num1);
        }
        if ( (num1 < num2) && (num1 < num3) ) {
            System.out.printf("%d is smaller than %d and %d\n",
            num1, num2, num3);
        }
        if ( (num2 < num1) && (num2 < num3) ) {
            System.out.printf("%d is smaller than %d and %d\n",
            num2, num1, num3);
        }
        if ( (num3 < num2) && (num3 < num1) ) {
            System.out.printf("%d is smaller than %d and %d\n",
            num3, num2, num1);
        
        System.out.printf("The sum of %d and %d "
        + "and %d is %d\n", num1, num2, num3, sum);
        
        System.out.printf("The average is %d\n", average);
        
        System.out.printf("The product is %d\n", product);
        
        
        
            
            
            }
    
}
}
