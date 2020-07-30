/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oEx7pt22TEST;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KT2Test2 {
    
    public static void main( String[] args ) {
        
        Scanner input = new Scanner( System.in );
        
        int[][] board = new int[8][8];
        
        int countMoves = 0;
        int countSpaces = 0; 
        int totSpacesMoved = 0;
        int currentRow = 3;
        int currentColumn = 4;
        int moveNumber = 3;
        int count = 0;
        
        int horizontal[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int vertical[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
        
    while ( moveNumber != 9 ) {
        
        System.out.println("Enter move number"
            + " (-1) to exit: ");
        moveNumber = input.nextInt();
        countMoves++;
        countSpaces += 3;
       
        System.out.println();
        
            currentRow += vertical[ moveNumber ];  //cR = 2
                
            currentColumn += horizontal[ moveNumber ];  //cC = 2

        for ( int row = 0; row < board.length; row++ ) {
            
            for ( int column = 0; column < board.length; column++ ) {
                
            if ( (row == currentRow) && (column == currentColumn) ) {
                
                board[currentRow][currentColumn] = 8;
                
                System.out.print( " " 
                        + board[row][column] + " " );
            }
            else  
                {
                board[row][column] = 0;
                
                System.out.print( " " 
                    + board[row][column] 
                        + " ");                                     
                }
            }
            System.out.println("");
            }
            count++;
            System.out.println();
                    
            System.out.printf("Number of moves taken: %d\n",
                countMoves );
            System.out.printf("Number of spaces moved: %d\n", 
                countSpaces );
            System.out.println();
        }
        totSpacesMoved = ( countSpaces / 64 ) * 100;
        System.out.println();
    }
}