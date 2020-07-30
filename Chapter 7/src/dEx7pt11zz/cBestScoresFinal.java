/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dEx7pt11zz;

/**
 *
 * @author User
 */
public class cBestScoresFinal {
    
    public static void main( String[] args ) {

        int[] bestScores = { 76, 81, 72, 98, 67 };
        int num = 1;
        
        System.out.printf("%5s ", "Subject: " );
                
    for ( int test = 0; test < bestScores.length; test++ ) {
        System.out.printf("%s %d ", "Subject", test + 1 );
    }
        System.out.println();
    
        System.out.printf("%-9s ", "Score: ");

    for ( int test = 0; test < bestScores.length; test++ ) {
        
        System.out.printf("Score %-3d ", bestScores[ test ]);
    }
        System.out.println();
        }
    }

