/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mEx7pt20;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TStest4 {
    
    public static void main( String[] args ) {
        
        int[][] sales = new int[4][2];
        
        Scanner input = new Scanner( System.in );
        int salesPerson = 0;
        int totalProduct = 0;
        
        int row = 0;
        int column = 0;
        int n = 1;
        int prodNumber = 0;
                
        System.out.println( "Please enter your\n"
            + "salesperson number\n"
                + "or -1 to quit.");
        salesPerson = input.nextInt();
        
        System.out.println( "Please enter the\n"
            + "product number.");
        prodNumber = input.nextInt();       
      
    
        System.out.println( "Please enter the\n"
            + "sales amount.");
        totalProduct = input.nextInt();
        row++;
            
        
        System.out.printf("%-9s %-7s %-7s \n",
                //+ "%-7s %-7s \n",
            "Prod No" ,"SP" 
                ,"SP"// ,"SP" ,"SP"
        );
        
        for ( row = 0; row < sales.length; row++ )
        {
            System.out.printf( "%3d       ", n );
                n++;
            // loop through columns of current row
            for ( column = 0; column < sales[ row ].length; column++ ) {
                System.out.printf( "%-7d ", sales[ row ][ column ] );
                }
            System.out.println(); // start new line of output
            
        }
    }    
}
