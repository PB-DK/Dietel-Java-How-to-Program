/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lEx7pt19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AirlineReservation {
    
    public static void main( String[] args ) {
        
        Scanner input = new Scanner( System.in );
        
        boolean[] seats = new boolean[10];
                                    //      boolean[] seats1 = new boolean[10];
                                    //      int row = 0;
        int column = 0;
        int seatFill = 1;
        
        while ( seatFill != 0 ) {
//   for ( int seatFill = 1; seatFill <=10; seatFill++ )
        System.out.println("Please press 1 for "
            + "first class or \n2 for second "
                + "class");
        int choice = input.nextInt();
        
        if ( choice == 1 ) {
                   
            for ( column = 0; column < seats.length; column++ )
                seats[column] = false; 
                    System.out.println("BOARDING PASS\n"
                + "Seat Number: " + (column + 1) +
                "\nNon-smoking Section\n"  );
            }
        else if ( choice == 2 ) {
            
            for ( column = 5; column < seats.length/2; column++ )
                seats[column] = false;   
                System.out.println("BOARDING PASS\n"
                    + "Seat Number: " + (column + 1) +
                    "\nSmoking Section\n"  );
        }
                
        }
        if ( seats[4] == true )     // seats[column]  //5
        {
            System.out.println("Smoking section is full!\n"
                + "Would you accept a seat\n"
                    + "in the non-smoking section?");
            int choice1 = input.nextInt();
            
            if ( choice1 == 1 ) {
                seats[column] = false;                
            }
            else 
            {
                System.out.println("Next Flight Leaves in 3 Hours.");
            }
        }
        else {
            System.out.println("Non-smoking section is full!\n"
                + "Would you accept a seat\n"
                    + "in the smoking section?");
            int choice1 = input.nextInt();
            
            if ( choice1 == 1 ) {
                seats[column] = false;                
            }
            else 
            {
                System.out.println("Next Flight Leaves in 3 Hours.");
            }            
            
        }
            if ( seats[column] == true ) {
                System.out.println("All seats have been filled.\n"
                    + "Next Flight Leaves in 3 Hours.");
            }
        }        
    }   
    /*
        for ( int seatFill = 1; seatFill <=10; seatFill++ )
        {
        System.out.println("Please press 1 for "
            + "first class or 2 for second "
                + "class");
        int choice = input.nextInt();
        
        if ( choice == 1 ) {
                   
            for ( int column = 0; column < seats.length; column++ )
                seats[row] = false; 
            }
        else if ( choice == 2 ) {
            
            for ( int column = 0; column < seats1.length; column++ )
                seats1[row] = false;             
        }
        
        System.out.println("BOARDING PASS\n"
                + "Seat Number: " + seats[row] +
                "\nNon-smoking Section"  );
        
        System.out.println("BOARDING PASS\n"
                + "Seat Number: " + seats[row] +
                "\nSmoking Section"  );
        }
    */
    
    
    
    
    
    
    /*
    // create a column heading for each of the tests
146         for ( int test = 0; test < grades[ 0 ].length; test++ )
147         System.out.printf( "Test %d ", test + 1 );
    ********************************************
    
    // sort doubleArray into ascending order
10      double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
11      Arrays.sort( doubleArray );
12      System.out.printf( "\ndoubleArray: " );
    
    **********************************************
    // fill 10-element array with 7s
18          int[] filledIntArray = new int[ 10 ];
19          Arrays.fill( filledIntArray, 7 );
20          displayArray( filledIntArray, "filledIntArray" );
    
    
    
    
    ***************************************
    // loop through rows of grades array
for ( int[] studentGrades : grades )
{
// loop through columns of current row
for ( int grade : studentGrades )
{
// if grade less than lowGrade, assign it to lowGrade
if ( grade < lowGrade )
lowGrade = grade;
} // end inner
    */
    /*
    int total = 0;
    
    for ( int row = 0; row < a.length; row++ )
        {
        for ( int column = 0; column < a[ row ].length; column++ )
            total += a[ row ][ column ];
}
    */
    

