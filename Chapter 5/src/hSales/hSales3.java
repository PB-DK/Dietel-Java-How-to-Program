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
public class hSales3 {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int productNo = 0;
        double total = 0.0;
        int quantity = 0;
        int counter = 0;
        double total1 = 0.0;
        double product1= 0.0, product2= 0.0, 
        product3= 0.0, product4= 0.0, product5 = 0.0;

        
        while ( productNo != -1 ) {
            
            System.out.println("Enter product number: ");
            productNo = input.nextInt();
                    
        if ( productNo != -1 ) {
            
            System.out.println("Enter quantity sold: ");
            quantity = input.nextInt();
            counter++;        
        }   
        else {
            if ( counter > 0 )
                {
            System.out.println(
                "You have finished entering your sales:");
            
                switch ( productNo ) {
            case 1: 
                product1 = (quantity * 2.98);
                break;
            case 2:
                product2 = (quantity * 4.50);
                break;
            case 3:
                product3 = (quantity * 9.98);
                break;
            case 4:
                product4 = (quantity * 4.49);
                break;
            case 5:
                product5 = (quantity * 6.87);
                break;
       //     default:
       //     System.out.println("Number entered is not correct");
            } 
                   //     total += total;
        System.out.println( "Product 1: " + "€" + product1 + "\n" +
	    "Product 2: " + "€" + product2 + "\n" +
                "Product 3: " + "€" + product3 + "\n" +
                    "Product 4: " + "€" + product4 + "\n" +
                        "Product 5: " + "€" + product5 );
        }
         else {
            System.out.println( 
                "No sales were entered" );    
                }
            }
        }
    }
}
