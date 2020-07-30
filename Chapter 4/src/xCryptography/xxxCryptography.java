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
public class xxxCryptography {
    
    public static void main(String args[]) {
      
        int result = 0;
        int place = 1;
        int number = 2413;
        
 //       while ( number > 9 )  {
            
            result += ( 100 * ( number % 10));
            
            number /= 10;
            
            result += ( 1000 * ( number % 10 ));
            
            number /= 10;
            
            result += ( number % 10 );
            
            number /= 10;

            result += ( 10 * ( number % 10 ));   
   //     }
        System.out.println("Result: "+ result);
        
        
    }
    
}
