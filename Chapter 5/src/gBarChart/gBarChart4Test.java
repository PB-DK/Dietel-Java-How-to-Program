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
public class gBarChart4Test {
    
        public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int number = 1; 
        int count = 1;
        String output = "";
         
        while ( count <= 5 ) {
           
            System.out.println("Enter number of astericks: ");
            number = input.nextInt();
        
  //    number = 5;
            switch ( count ) {
                
                case 1:  
                
                    for ( int x = 1; x <= number; x++ ) {
                        
                    output += "*";
                    }
                    output += "\n";
        //            System.out.println();
                    break;
                case 2:   
                
                    for ( int x = 1; x <= number; x++ ) {
                        
                    output += "*";
                    }
                    output += "\n";
         //           System.out.println();                    
                    break; 
                case 3:                     
                   for ( int x = 1; x <= number; x++ ) {
                        
                    output += "*";
                    }
                    output += "\n";
                    
                    break;
                case 4:                     
                for ( int x = 1; x <= number; x++ ) {
                        
                    output += "*";
                    }
                    output += "\n";
                    
                    break;
                case 5:                    
                    for ( int x = 1; x <= number; x++ ) {
                        
                    output += "*";
                    }
                    output += "\n";
                    
                    break;
                
            }
            
                    count++;
        }    
                    System.out.println(); 
                    System.out.println(output); 
        }
    }
    

