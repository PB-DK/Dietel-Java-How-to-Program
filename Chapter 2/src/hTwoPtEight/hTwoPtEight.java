/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hTwoPtEight;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*
The following program performs 
a sample payroll calculation.
*/
public class hTwoPtEight {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner ( System.in );
        
        int x;
        
        System.out.print("Enter an integer ");
     //   x = input.nextInt();
        
     
    int a;
    int b;
    int c;
     
    System.out.print("Enter 1st integer ");
    b = input.nextInt();
     
    System.out.print("Enter 2nd integer ");
    c = input.nextInt();
     
    a = b * c;
    
    System.out.printf("The product of %d and %d = %d\n",
            b , c , a);

     
     
     
     
     
        
    }
    
}
