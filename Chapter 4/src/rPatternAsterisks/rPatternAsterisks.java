/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rPatternAsterisks;

/**
 *
 * @author User
 */
public class rPatternAsterisks {
    
    public static void main(String args[]) {
        
        int counter = 1;
        int counter1 = 1;
        int counter2 = 1;
                
        while ( counter <= 8 ) {

            while ( counter2 <= 8 ) {   //prints first line of* * * * * * * *
                                        //the whole while performs its 8 repititions
                System.out.print("* "); // ie it prints out all the stars with a space
                counter2++;             //space inbetween as above^^^
            }

            System.out.println("");     //brings curser to next line
            counter++;
            
                if ( counter % 2 == 0 ) {   //if counter IS divisible by 2(ie no remainder)
                    System.out.print(" ");  //the begininng of the line starts with a space
                }                           //(indentation). so @ counter = 2 the line starts
                                            //with a space * * * * * * * *
            counter2 = 1;        // reinitialises counter2 back to 1 from 8
        }       //returns to top to first while loop performing the whole process again with
                //counter = 2 IS less than 8 so it all starts again
                //when counter gets to 8 it performs its last loop and the program
    }           //terminates
}        


//       while ( counter1 <= 8) {
           //          counter1++;


        
