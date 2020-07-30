/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dFactorials;

/**
 *
 * @author User
 */
public class dFactorials {
    
    public static void main(String args[]) {
        
        long factorial = 1;
        long factorial1 = 1;
        
        System.out.printf( 
            "%s%30s\n","Number","Factorial" );
        
        for ( int i = 1; i <= 20; i++ ) {
            factorial = factorial * i; 
            
        System.out.printf("%6d%30d\n", i, factorial);
            
        }
        System.out.printf(
            "\nFactorial of 20: %d\n", factorial );
        
        for ( int i = 1; i <= 100; i++ ) {
            factorial1 = factorial1 * i;
        }    
        System.out.printf(
            "\nFactorial of 100: %d\n", factorial1 );
        //I am only getting a value of zero, I assume
        //it is because there is not enough space to 
        //display the solution???
    }
}
