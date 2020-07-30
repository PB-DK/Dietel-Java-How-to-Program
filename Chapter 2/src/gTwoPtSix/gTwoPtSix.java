/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gTwoPtSix;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class gTwoPtSix {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner( System.in );
        
        int x,
            y,
            z,
            product;
        
        System.out.print("Enter the first digit: ");
        x = input.nextInt();
        
        System.out.print("Enter the second digit: ");
        y = input.nextInt();
        
        System.out.print("Enter the third digit: ");
        z = input.nextInt();
        
        product = x * y * z;
        
        System.out.printf("The product of "
                + "%d , %d , %d = %d \n",
                x , y , z , product);
        
        
        
    }

    
}
