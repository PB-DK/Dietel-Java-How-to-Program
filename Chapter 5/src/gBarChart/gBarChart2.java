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
public class gBarChart2 {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int number = 5;
        int j = 1;
        int i = 1;
        
        while ( j <= 5 ) {    //  AN ARRAYYYYYYYYYYYYYYYY
        
        System.out.println("Enter number a of asterisks: ");
        number = input.nextInt();
        
        for ( int x = 1; x <= number; x++ ) {
            
        System.out.print("*");
        }
        System.out.println();
        
        j = j + 1;
    }
    }
}
