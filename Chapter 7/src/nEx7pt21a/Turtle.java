/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nEx7pt21a;

/**
 *
 * @author User
 */
public class Turtle {
    
    public static void main( String[] args ) {
    
    int[][] floor = new int[20][20];
    int[] upDown = new int[2];
    int[] rightLeft = new int[2];
    
    upDown[ 0 ] = -1;           // move up
    upDown[ 1 ] = +1;           // move down
    rightLeft[ 0 ] = +1;        // move right
    rightLeft[ 1 ] = -1;        // move left  
    
    for ( int row = 0; row < 20; row++ ) {        
       
        for ( int column = 0; column < 20; column++ ) {
    
            floor[row][column] = 0;  
            System.out.print( floor[row][column] + " " );
            }
        System.out.println();
        }
    }    
}
