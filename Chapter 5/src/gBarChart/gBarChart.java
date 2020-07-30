/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gBarChart;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class gBarChart {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int number, number1 ,number2 ,number3 ,number4;
        
        System.out.println("Enter number of asterisks");
        number = input.nextInt();
        
        System.out.println("Enter number of asterisks");
        number1 = input.nextInt();
        
        System.out.println("Enter number of asterisks");
        number2 = input.nextInt();
        
        System.out.println("Enter number of asterisks");
        number3 = input.nextInt();
        
        System.out.println("Enter number of asterisks");
        number4 = input.nextInt();
    
        for ( int x = 1; x <= number; x++ ) {
            
            System.out.print("*");
        }
        System.out.println();
        
        for ( int x = 1; x <= number1; x++ ) {
            
            System.out.print("*");
        }
        System.out.println();
        
        for ( int x = 1; x <= number2; x++ ) {
            
            System.out.print("*");
        }
        System.out.println();
        
        for ( int x = 1; x <= number3; x++ ) {
            
            System.out.print("*");
        }
        System.out.println();
        
        for ( int x = 1; x <= number4; x++ ) {
            
            System.out.print("*");
        }
        System.out.println();  
        
        /*    
        System.out.println("Enter number of asterisks");
        number = input.nextInt();
      */  
                
    }    
}

/*

int number1, number2, number3, number4, number5;
        
        System.out.println("Enter number of asterisks");
        number1 = input.nextInt();
        
        System.out.println("Enter number of asterisks");
        number2 = input.nextInt();
        
        System.out.println("Enter number of asterisks");
        number3 = input.nextInt();
        
        System.out.println("Enter number of asterisks");
        number4 = input.nextInt();
        
        System.out.println("Enter number of asterisks");
        number5 = input.nextInt();

*/
