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
public class SalesCommissionWrong {
    
    public static void main(String[] args) {  
        
        double grossPay; 
        double grossSales = 0.0;
        double pay = 0.0;

        double[] Salaries = { 200-299, 300-399, 400-499, 500-599, 
            600-699, 700-799, 800-899, 900-999, 1000 };
        
        grossPay = 200 + ( 0.09 * grossSales );
        
        if ( grossPay < 650 ) {
             pay = 650;
        }
        else {
            pay = grossPay;            
        }
        
        
        
    }
}
