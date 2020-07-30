/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oEx7pt22;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KT {
    
    public static void main( String[] args ) {
        
        Scanner input = new Scanner( System.in );
        
        int[][] board = new int[8][8];
        int[] horizontal = new int[8];
        int[] vertical = new int[8];
                
        int currentRow = 3;
        int currentColumn = 4;
        int moveNumber = 0;
        
        horizontal[ 0 ] = 2;
        vertical[ 0 ] = -1;

        horizontal[ 1 ] = 1;
        vertical[ 1 ] = -2;
        
        horizontal[ 2 ] = -1;
        vertical[ 2 ] = -2;
        
        horizontal[ 3 ] = -2;
        vertical[ 3 ] = -1;
        
        horizontal[ 4 ] = -2;
        vertical[ 4 ] = 1;
        
        horizontal[ 5 ] = -1;
        vertical[ 5 ] = 2;
        
        horizontal[ 6 ] = 1;
        vertical[ 6 ] = 2;
        
        horizontal[ 7 ] = 2;
        vertical[ 7 ] = 1;
        /*
        System.out.println("Enter horizontal move:");
        horizontal[ moveNumber ] = input.nextInt();
        
        System.out.println("Enter vertical move:");
        vertical[ moveNumber ] = input.nextInt();
        */
        System.out.println();
        
        for ( int row = 0; row < board.length; row++ ) {
            
            for ( int column = 0; column < board.length; column++ ) {
    
                System.out.print( " " + board[row][column] + " " );
                board[row][column] = 0;
                
     //           currentRow += vertical[ moveNumber ];
                
     //           currentColumn += horizontal[ moveNumber ];

            }
            System.out.println("");
        }
    }
}
        /*
        for ( int row = 0; row < board.length; row++ ) {
            
            for ( int column = 0; column < board.length; column++ ) {
    
                board[row][column] = 0;
            }
        } 
*/
     /*   
        for ( int horizontal = 0; horizontal < board.length; horizontal++ ) {
            
            for ( int vertical = 0; vertical < board.length; vertical++ ) {
    
                board[ horizontal ][ vertical ] = 0;
                
                currentRow += vertical[ moveNumber ];
            }
        }
        */