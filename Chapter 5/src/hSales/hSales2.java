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
public class hSales2 {
    
    private String salesBook;
    private int productNo;
    private int quantity;
    private int total;
    
    public hSales2( String sales ) {
        
        salesBook = sales; 
    }
    public void setTotalSales( String sales ) {
        
        salesBook = sales; 
    }
    public String getTotalSales() {
        
        return salesBook;
    }
    public void displayMessage() {
        
        System.out.printf( 
            "Welcome to my sales calculator:"
            + "\n%d", getTotalSales() );
    }
    public void calculateSales() {
        
        Scanner input = new Scanner( System.in );
        
        int productNo = 0;
        double total = 0;
        int quantity = 0;
        double total1 = 0;
        int counter = 0;
        
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
                "You have finished entering yor sales");
                }
            else {
            System.out.println( 
                "No sales were entered" );    
            }
        }  
        switchStatement( productNo );
        }
    }
    private void switchStatement( int productNo ) {
        
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
    public void displaySales() {
           
        System.out.println("Total sales are equal to: "+
        total);  
    }
}
