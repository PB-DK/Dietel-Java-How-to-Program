/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fCompare6Ifs;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class fCompare6Ifs {
    
    public static void main(String args[]){
    
        Scanner input = new Scanner( System.in );
        
        int number1,
            number2,
            sum;
        
        System.out.print("Enter first integer ");
        number1 = input.nextInt();
        
        System.out.print("Enter second integer ");
        number2 = input.nextInt();
        
        if ( number1 == number2 ) {
            System.out.println("Number1 is equal to number2 ");
                    }
        if ( number1 != number2 ) {
            System.out.println("Number1 is not equal to number2 ");
                    }
        if ( number1 <= number2 ) {
            System.out.println("Number1 is smaller or equal to number2 ");
                    }
        if ( number1 >= number2 ) {
            System.out.println("Number1 is greater or equal to number2 ");
                    }
        if ( number1 > number2 ) {
            System.out.println("Number1 is greater than number2 ");
                    }
        if ( number1 < number2 ) {
            System.out.println("Number1 is smaller than number2 ");
                    }   
    }    
}
