/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oSquareAstericks;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ooSquareAstericks {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int size = 5;
        int counter = 1;
        int counter1 = 1;
        int counter2 = 1;
        int counter3 = 1;
    /*    
        System.out.println("Enter the size of the square,\n"
                + "any number between 1 and 20: ");
        size = input.nextInt();
    */   
        while ( counter <= (size) )   // 5 = size
        {
            System.out.print("*"); //prints top horizontal line       * * * * *
            System.out.print(" ");                               
            counter++;            
        }
            System.out.println("");
       /* 
            while ( counter1 <= size - 2  )
            {
                System.out.print("*");    //prints verticle line
            
                while ( counter2 <= size * ( size /2 ) ) 
                {
                    System.out.print(" ");
                    
                    counter2++;                     
                }    //prints verticle line
                System.out.println("*");
                
                counter2 = 1; 

                counter1++;
            }
            counter = 1;
            /*
        
            while ( counter <= size )   // 5 = size
            {
                System.out.print("* "); //prints top horizontal line       * * * * *
                                            
                counter++;
                }
                System.out.println("");
        }
*/
    }
}