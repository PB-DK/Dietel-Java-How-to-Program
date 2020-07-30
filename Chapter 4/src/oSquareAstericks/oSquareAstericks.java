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
public class oSquareAstericks {
    
    public static void main(String args[]) {
        int len = 8; // user input
       int x = 0;

       // print first line
       while (x++ < len) {
           System.out.print("* ");
       }
       System.out.println(); // new line
       // print the rest of lines *      * in a loop
       x = 0;
       while (x++ < len - 2) {
           System.out.print('*'); // beginning of line
           int y = 0;
           while (y++ < len - 2) {
               System.out.print("  "); // dobule spaces
           }
           System.out.println(" *"); // end of line
       }
       x = 0;
       // print the last line
       while (x++ < len) {
           System.out.print("* ");
       }
    }
    
    /*public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int size;
        int counter = 1;
        int counter1 = 1;
        int counter2 = 1;
        int counter3 = 1;
        
        System.out.println("Enter the size of the square,\n"
                + "any number between 1 and 20: ");
        size = input.nextInt();
        
        while ( counter <= size )   // 5 = size
        {
            System.out.print("*"); //prints top horizontal line       * * * * *
            System.out.print(" ");                               
            counter++;
            
        }
            System.out.println("");
        
            while ( counter1 <= size - 2  )
            {
                System.out.print("*");    //prints verticle line
                
                while ( counter2 <= size * ( size /2 ) ) 
                {
                    System.out.print(" ");
                    
                    counter2++;                     
                }    //prints verticle line
                System.out.println("&");
                
                counter2 = 1; 

                counter1++;
            }
            counter = 1;
        
            while ( counter <= size )   // 5 = size
            {
                System.out.print("* "); //prints top horizontal line       * * * * *
                                            
                counter++;
                }
                System.out.println("");
        }*/
    }
/*  HELP!





            while ( counter3 <= 5 )
            {
                System.out.print(" ");
                
                counter3++;
            }
            counter1++;
            }
        while ( counter2 <= 5 )
        {
            System.out.print("* "); //prints 2nd horizontal line
                                            
            counter2++;
            
        }
                    
        System.out.println("");
                
        */
   
    

/*
        while ( counter <= size )
        {
            System.out.print("* "); //prints top horizontal line
                                            
            counter++;
            
        }
 //           System.out.println("");
        while ( counter1 <= size )
            {
            System.out.println("*         *");    //prints verticle line
                    
            counter1++;
            }
        while ( counter2 <= size )
        {
            System.out.print("* "); //prints 2nd horizontal line
                                            
            counter2++;
            
        }
                    
        System.out.println("");
                
        
    }

        while ( counter <= size + 1 )
        {
            System.out.print("* "); //prints top horizontal line
                                            
            counter++;
            
        }
            System.out.println("");
        while ( counter1 <= size - 1 )
            {
            System.out.println("*         *");    //prints verticle lines
                    
            counter1++;
            }
        while ( counter2 <= size + 1 )
        {
            System.out.print("* "); //prints 2nd horizontal line
                                            
            counter2++;
            
        }
                    
        System.out.println("");
*/
