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
public class gBarChart3 {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int number = 5;
        int j = 1;
        int i = 1;
        String output = null;
        
        while ( j <= 5 ) {    //  AN ARRAYYYYYYYYYYYYYYYY
        
        System.out.println("Enter number of asterisks");
        number = input.nextInt();
        
        j = j + 1;
        
        while ( i <= 5 ) {
        for ( int x = 1; x <= number; x++ ) {
            
            output = "*"; 
            }
        i = i + 1;
        }
            System.out.print(output);
        }
        System.out.println();        
    }
    
}
