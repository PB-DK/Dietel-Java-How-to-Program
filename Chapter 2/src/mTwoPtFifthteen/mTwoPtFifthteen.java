/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mTwoPtFifthteen;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class mTwoPtFifthteen {
    
    public static void main(String args[])  {
        
        Scanner input = new Scanner( System.in );
        
        int x, y, sum, product, diff, division;
        
        System.out.print("Enter 1st integer: ");
        x = input.nextInt();
        
        System.out.print("Enter 2nd integer: ");
        y = input.nextInt();
        
        sum = x + y;
        product = x * y;
        diff = x - y;
        division = x / y;

        
        System.out.printf("The sum of %d and %d = %d\n", x, y, sum);

        System.out.printf("The product of %d and %d = %d\n", x, y, product);
              
        System.out.printf("The difference of %d and %d = %d\n", x, y, diff);
        System.out.printf("The division of %d and %d = %d\n", x, y, division);
        
        
        
    }
    
}
