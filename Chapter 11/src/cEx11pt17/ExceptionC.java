/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cEx11pt17;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author User
 */
public class ExceptionC extends ExceptionB {
    
  /*  
    public static int sum( int num1, int num2 ) 
        throws ArithmeticException
    {
        return num1 + num2;
    }    
    
    public static void main( String args[] ) {
        
        Scanner scanner = new Scanner( System.in ); 
        
        try {
        
            System.out.print( "Please enter an integer numerator: " );
            int num1 = scanner.nextInt();
        
            System.out.print( "Please enter an integer denominator: " );
            int num2 = scanner.nextInt();
        
            int result = sum( num1, num2 );
        
            System.out.printf( "\nResult: %d / %d = %d\n",
                num1, num2, result );
            }
        catch ( InputMismatchException inputMismatchException ) {
            
            System.err.printf( "\nException: %s\n",
                inputMismatchException );
            
            scanner.nextLine(); // discard input so user can try again
    
            System.out.println( "You must enter integers. "
                + "Please try again.\n" );
        }
        catch ( ArithmeticException arithmeticException )
        {
            System.err.printf( "\nException: %s\n", 
                arithmeticException );            
            
            System.out.println( "Zero is an invalid "
                + "denominator. Please try again.\n" );
        } // end catch
    } //while ( continueLoop ); // end do...while
}
*/
}