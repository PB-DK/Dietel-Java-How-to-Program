package lEx7pt19a;

import java.util.Scanner;

public class Plane {
    
public void checkIn()
{
 
    Scanner input = new Scanner( System.in );
 
        boolean seats[] = new boolean[ 10 ]; // array of seats
        int firstClass = 0; // next available first class seat
        int economy = 5; // next available economy seat

    while ( ( firstClass < 5 ) || ( economy < 10 ) )
        {
        System.out.println( "Please type 1 for First Class" );
        System.out.println( "Please type 2 for Economy" );
        System.out.print( "choice: " );
        int section = input.nextInt();

        if ( section == 1 ) // user chose first class
            {
            if ( firstClass < 5 )
            {
                firstClass++;
                System.out.printf( "First Class. Seat #%d\n", firstClass );
            } // end if
 
            else if ( economy < 10 ) // first class is full
            {
                System.out.println(
                "First Class is full, Economy Class?" );
                System.out.print( "1. Yes, 2. No. Your choice: " );
                int choice = input.nextInt();

                if ( choice == 1 )
                {
                    economy++;
                    System.out.printf( "Economy Class. Seat #%d\n",
                    economy );
                }
                else
                    System.out.println( "Next flight leaves in 3 hours." );
                } // end else if
                } // end if
                else if ( section == 2 ) // user chose economy
                {
                    if ( economy < 10 )
                    {
                    economy++;
                    System.out.printf( "Economy Class. Seat #%d\n", economy );

                    } // end if
                    else if ( firstClass < 5 ) // economy class is full
                    {
                        System.out.println(
                            "Economy Class is full, First Class?" );
                        System.out.print( "1. Yes, 2. No. Your choice: " );
                        int choice = input.nextInt();

                        if ( choice == 1 )
                            {
                            firstClass++;
                            System.out.printf( "First Class. Seat #%d\n",
                            firstClass );
                            } // end if
                        else
                            System.out.println( "Next flight leaves in 3 hours." );
                    } // end else if
                } // end else if

                System.out.println();
                    } // end while

                System.out.println( "The plane is now full." );
                } // end method checkIn
                    } // end class Plan