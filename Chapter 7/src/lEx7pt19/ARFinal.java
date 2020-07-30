/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lEx7pt19;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ARFinal {
    
    public static void main( String[] args ) {
        
        Scanner input = new Scanner( System.in );
        
        boolean[] seats = new boolean[10];
        Arrays.fill( seats, Boolean.FALSE);
        int column = 0;
        int seatFill = 1;
        int n = 0;
        int l = 5;
        
    while ( seatFill != -1 ) {
            
        System.out.println("Please press:\n"
                + "1 for non smoking\n"
                + "2 for smoking"
                + "-1 to quit.");
        int choice = input.nextInt();
        
        if ( choice == 1 ) {

            if ( n < 5 ) {
                seats[n] = true;
                System.out.println("BOARDING PASS\n"
                    + "Seat Number: " + (n + 1) +
                    "\nNon-smoking Section\n"  );
            }
            else {
                System.out.println("Non-smoking section is full!\n"
                    + "Would you accept a seat\n"
                    + "in the smoking section?\n"
                    + "1 for yes, 2 for no");  
                int choice2 = input.nextInt();
                
                if (( choice2 == 1 ) && ( l < 10 )) {
                    seats[l] = true;
                    System.out.println("BOARDING PASS\n"
                    + "Seat Number: " + (l + 1) +
                    "\nSmoking Section\n"  );
                    l++;               
                }
                else {
                    System.out.println(
                        "Next flight leaves in 3 hours");
                    System.exit(0);
                }
                    } 
                n++;
            }                        
        else if ( choice == 2 ) {
          
            if ( l < 10 ) {
       
                seats[l] = true;
                System.out.println("BOARDING PASS\n"
                    + "Seat Number: " + (l + 1) +
                    "\nSmoking Section\n"  );
          //      l++;
                    }
            else {
                System.out.println("Smoking section is full!\n"
                    + "Would you accept a seat\n"
                    + "in the non-smoking section?\n"
                    + "1 for yes, 2 for no");  
                int choice3 = input.nextInt();
                
                if (( choice3 == 1 ) && ( n < 5 )) {
                    seats[n] = true;
                    System.out.println("BOARDING PASS\n"
                    + "Seat Number: " + (n + 1) +
                    "\nSmoking Section\n" );
                    n++;               
                }
                else {
                    System.out.println(
                        "Next flight leaves in 3 hours");
                    System.exit(0);
                }
                    } 
                l++;               
                }
            }       
        }
    }
/*     int n = 0;
        int l = 5;
        
    while ( seatFill != -1 ) {
            
        System.out.println("Please press:\n"
                + "1 for non smoking\n"
                + "2 for smoking"
                + "-1 to quit.");
        int choice = input.nextInt();
        
        if ( choice == 1 ) {

            if ( n < 5 ) {
                seats[n] = true;
                System.out.println("BOARDING PASS\n"
                    + "Seat Number: " + (n + 1) +
                    "\nNon-smoking Section\n"  );
            }
            else {
                System.out.println("Non-smoking section is full!\n"
                    + "Would you accept a seat\n"
                    + "in the smoking section?\n"
                    + "1 for yes, 2 for no");  
                int choice2 = input.nextInt();
                
                if ( choice2 == 1 ) {
                    break;
                }
                else {
                    System.exit(0);
                }
                    } 
                n++;
            //    break;
            }                        
        else if ( choice == 2 ) {
          
            while ( l < 10 ) {
        //    for ( int l = 5; l < 10; l++ ) {
                seats[l] = true;
                System.out.println("BOARDING PASS\n"
                    + "Seat Number: " + (l + 1) +
                    "\nSmoking Section\n"  );
                l++;
                break;
                    }
                }       
            }
        }
    }
//****************************************************************************
    /*                     if ( count > 5 ) {
                            System.out.println("Non-smoking section is full!\n"
                            + "Would you accept a seat\n"
                                + "in the smoking section?");
                        }//   }
        }
        else if ( choice == 2 ) {
            
     //     for ( column = 0; column < seats.length/10; column++ )
                Arrays.fill( seats, true );   
                System.out.println("BOARDING PASS\n"
                    + "Seat Number: " + count1 +
                    "\nSmoking Section\n"  );
                        count1++;
                        if ( count1 > 10 ) {
                            break;
          //            }
        }
        if (( count > 5 ) && ( count1 > 10 )) {
                System.out.println("All seats have been filled.\n"
                    + "Next Flight Leaves in 3 Hours.");
            System.exit(0);
            /*
            if ( seats[column] == true ) {
                System.out.println("All seats have been filled.\n"
                    + "Next Flight Leaves in 3 Hours.");
            */
                

    /*
Arrays.fill(seats, true);
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
    

