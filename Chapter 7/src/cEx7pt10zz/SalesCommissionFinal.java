/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cEx7pt10zz;

/**
 *
 * @author User
 */
public class SalesCommissionFinal {
    
    public static void main(String[] args) {  
        
        double grossPay; 
        double grossSales = 0.0;
        double pay = 0.0;
        
        double[] salaries = { 2, 2, 4, 3, 1, 3, 1, 2, 0 };
        
        System.out.println("Salary distribution:");
        
        for ( int counter = 2; counter < salaries.length+2; counter++ ) {
            
            if ( counter == 10 ) {
                System.out.printf("%7d: ", 1000);
            }
            else
                System.out.printf( "%3d-%3d: ", 
                    counter * 100, counter * 100 + 99 );
            
            for ( int stars = 0; stars < salaries[ counter - 2 ]; stars++ ) {
                System.out.print( "*" );
            
            }
            System.out.println();
            
            
            
            
        }
        
        
        /* double[] Salaries1 = { 220, 278, 333, 355, 409,
            459, 477, 499, 540, 565, 590, 606, 700,
                777, 799, 801, 951, 998, 1000 };
        */
        
        
        
        
        /*
        double[] Salaries = { 200-299, 300-399, 400-499, 500-599, 
            600-699, 700-799, 800-899, 900-999, 1000 };
        
        grossPay = 200 + ( 0.09 * grossSales );
        
        if ( grossPay < 650 ) {
             pay = 650;
        }
        else {
            pay = grossPay;            
        }
        */
        
        
    }
}
