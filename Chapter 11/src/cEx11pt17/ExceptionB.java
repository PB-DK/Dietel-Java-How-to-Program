/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cEx11pt17;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExceptionB extends ExceptionA {
    
    public static int sum( int numA, int numB )
        throws ArithmeticException

    {
        return numA / numB; // possible division by zero
    } // end method quotient

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner( System.in ); // scanner for input
  //      boolean continueLoop = true; // determines if more input is needed

  //      do
    //    {
       //   try // read two numbers and calculate quotient
          //{
            System.out.print( "Please enter an integer numerator: " );

            int numA = scanner.nextInt();

            System.out.print( "Please enter an integer denominator: " );

            int numB = scanner.nextInt();

            int result = sum( numA, numB );

            System.out.printf( "\nResult: %d / %d = %d\n", numA,
                numB, result );

    //        continueLoop = false; // input successful; end looping
  //    end try
//catch ( InputMismatchException inputMismatchException )
         //{
         
            System.err.printf( "\nException: %s\n",
                    ExceptionA.inputMismatchException );
            scanner.nextLine(); // discard input so user can try again
            System.out.println(
                "You must enter integers. Please try again.\n" );
//} // end catch
        //catch ( ArithmeticException arithmeticException )
        
            System.err.printf( "\nException: %s\n", 
                    Exception.arithmeticException );
            System.out.println(
                "Zero is an invalid denominator. Please try again.\n" );
//} // end catch
      //  } while ( continueLoop ); // end do...while
        }
    }
