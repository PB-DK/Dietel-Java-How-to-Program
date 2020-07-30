/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xCryptography;

/**
 *
 * @author User
 */
public class xxCryptography {
    
    public static void main(String args[]) {
        
        int digit = 6381;
        int numdigits = 2;
        int counter = 1;
        int firstDigit;
        int work;
        int newDigit, firstdigit;
        int number = 6381;
     
        while ( counter <= 4 ) {
            
            digit = number % 10;  //      1 = 6381 % 10
            newDigit = digit + 7;   //    8 = 1 + 7
            firstDigit = newDigit % 10;// 8 = 8 % 10
            
            /*
 each digit will be multiplied by 100 or divided by 100
 to chaqnge its position. use an if else with the counter 
 as two arguments and inside that then multiply numbers 
            by 100 or divide by 100
            
            
            if ( counter == 1 ) {
                firstDigit = 
            }*/
            
        }
    }
}
            /*
            firstDigit = digit % 10;    // 1 = 6381 % 10
            work = digit / 10;          // 638 = 6381 / 10
            newDigit = digit + 7;                            
                                        // 8 = 638 % 10 
            System.out.printf(          // 63 = 638 / 10
            "%d , %d ", firstDigit,newDigit);
                                   // 63 = 638 / 10
                                        
                                        // 3 = 63 % 10
                                        // 6 = 63 / 10
                                        
                                        // 6 = 6 % 10 
            
        counter++;    
        }
        
    }    
}
*/