/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hSales;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class hSales {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int productNo = 0;
        double total = 0;
        int quantity = 0;
        double total1 = 0;
        
        while ( productNo != -1 ) {
            
            System.out.println("Enter product number: ");
            productNo = input.nextInt();
        
        if ( productNo != -1 ) {
            
            System.out.println("Enter quantity sold: ");
            quantity = input.nextInt();
            
        switch ( productNo ) {
            case 1: 
                total += (quantity * 2.98);
                break;
            case 2:
                total += (quantity * 4.50);
                break;
            case 3:
                total += (quantity * 9.98);
                break;
            case 4:
                total += (quantity * 4.49);
                break;
            case 5:
                total += (quantity * 6.87);
                break;
            default:
            System.out.println("Number entered is not correct");
            }  
        }
        else {
            System.out.println("");
        }
    }
        total1 += total;
        
        System.out.printf(
            "The total of all the products sold \n%.2f\n",
                total1);
    }
}

/* 
How can i fix this empty else in line 55-56? its bad 
programming. i have the answer to similar question 
in old notes, have a look
*/
