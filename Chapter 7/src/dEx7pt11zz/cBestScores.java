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
public class cBestScores {
    
    public static void main( String[] args ) {

        int[] bestScores = { 76, 81, 72, 98, 67 };
        
        System.out.printf("%7s %7s\n", "Subject", "Score");
        
    for ( int test = 0; test < bestScores.length; test++ ) {
        System.out.printf("%s %d ", "Subject", test + 1 );
        System.out.printf("Score %d ", bestScores[ test ]);

    
    
    System.out.println();
        }
    }
}
