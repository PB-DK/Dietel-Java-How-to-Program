/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kEx7pt18;

import java.util.Random;

/**
 *
 * @author User
 */
public class Craps1 {
    
    // create random number generator for use in method rollDice
    private static final Random randomNumbers = new Random();

    private enum Status { CONTINUE, WON, LOST };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;    
 // constants that represent common rolls of the dice

    // plays one game of craps
    public static void main( String[] args )
    {    
    int myPoint = 0; // point if no win or loss on first roll
    Status gameStatus = null; // can contain CONTINUE, WON or LOST
    int sevenElevenWin = 0;
    int twoThreeTwelve = 0;
    int twoRollDice = 2;
    int sumOfDiceLost = 2;
    int won = 0;
    
    int sumOfDice = rollDice();
    int sumOfDice1 = rollDice();
 
    for ( int game = 1; game <= 1000; game++ ) {
    
    // determine game status and point based on first roll
    switch ( sumOfDice )
 {
        case SEVEN: // win with 7 on first roll
        case YO_LEVEN: // win with 11 on first roll
            gameStatus = Status.WON;
            sevenElevenWin++;
            won++;
            break;
        case SNAKE_EYES: // lose with 2 on first roll
        case TREY: // lose with 3 on first roll
        case BOX_CARS: // lose with 12 on first roll
            gameStatus = Status.LOST;
            twoThreeTwelve++;
            break;
        default: // did not win or lose, so remember point
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice; // remember the point
            System.out.printf( "Point is %d\n", myPoint );
            break;
    }

    
    while ( gameStatus == Status.CONTINUE )
    {
        sumOfDice1 = rollDice(); // roll dice again
        
        if ( sumOfDice == myPoint ) {
            gameStatus = Status.WON;
            twoRollDice = sumOfDice;
            sumOfDice++;
            won++;
        }
        else
            if ( sumOfDice1 == SEVEN ) {// lose by rolling 7 before point
                gameStatus = Status.LOST;
                twoRollDice = sumOfDice;
                sumOfDiceLost++;
        }
        
        switch ( sumOfDice1 )
 {
        case SEVEN: // win with 7 on first roll
        case YO_LEVEN: // win with 11 on first roll
            gameStatus = Status.WON;
            sevenElevenWin++;
            break;
        case SNAKE_EYES: // lose with 2 on first roll
        case TREY: // lose with 3 on first roll
        case BOX_CARS: // lose with 12 on first roll
            gameStatus = Status.LOST;
            twoThreeTwelve++;
            break;
        default: // did not win or lose, so remember point
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice1; // remember the point
            System.out.printf( "Point is %d\n", myPoint );
            break;
    }
    
    while ( gameStatus == Status.CONTINUE )
    {
        sumOfDice1 = rollDice(); // roll dice again
        
        if ( sumOfDice1 == myPoint ) {
            gameStatus = Status.WON;
            twoRollDice = sumOfDice1;
            sumOfDice1++;
        }
        else
            if ( sumOfDice1 == SEVEN ) {// lose by rolling 7 before point
                gameStatus = Status.LOST;
                twoRollDice = sumOfDice1;
                sumOfDiceLost++;
        }
                   
    } // end while
    }
    }
 // display won or lost message
    if( gameStatus == Status.WON )
        System.out.println( "Player wins" );
    else
        System.out.println( "Player loses" );
 
    System.out.println();
    System.out.printf
        ("Games won on first roll: %d\n", sevenElevenWin );
    System.out.printf
        ("Games won on second roll: %d\n", sumOfDice );
    System.out.printf
        ("Games lost on second roll: %d\n", twoThreeTwelve );  
    System.out.printf
        ("Games won on second roll: %d\n", sumOfDice1 );
    System.out.printf
        ("Games won: %d\n", won );
    
    int percent = ( won/100 ) * 100;
    
    System.out.printf
        ("Percentage of games won: %d\n", percent );
 } // end main
 
 
 // roll dice, calculate sum and display results
    public static int rollDice()
 {
 // pick random die values
        int die1 = 1 + randomNumbers.nextInt( 6 ); // first die roll
        int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll

        int sum = die1 + die2; // sum of die values

        // display results of this roll
        System.out.printf( "Player rolled %d + %d = %d\n",
            die1, die2, sum );
        
        return sum;
        
    } // end method rollDice
}
    
