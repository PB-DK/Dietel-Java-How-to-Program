/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jEx7pt17zz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RDSumMethArrFinal {
    
        private static final Random diceRoll = new Random();
    
    public static void main( String[] args ) {
        
        Scanner input = new Scanner( System.in );
        
        int sum = 0;
        
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;        
        
        int[] freq = new int[11];
                
        for ( int roll = 1; roll <= 36000000; roll++ ) {
            
            int diceSum = rollDice();

         switch ( diceSum ) 
            {
            case 2:
                ++freq[0];
                break;
            case 3:
                ++freq[1];
                break;
            case 4:
                ++freq[2];
                break;
            case 5:
                ++freq[3];
                break;
            case 6:
                ++freq[4];
                break;
            case 7:
                ++freq[5];
                break;
            case 8:
                ++freq[6];
                break;
            case 9:
                ++freq[7];
                break;
            case 10:
                ++freq[8];
                break;
            case 11:
                ++freq[9];
                break;
            case 12:
                ++freq[10];
                break;
         }
        }
         
        System.out.printf("%-9s %11s\n", "Addition", "Times");
            System.out.println("2\t\t" + freq[0] + "\n3\t\t" 
            + freq[1] + "\n4\t\t" + freq[2] + "\n5\t\t" 
                + freq[3] + "\n6\t\t" + freq[4] + "\n7\t\t" 
                + freq[5] + "\n8\t\t" + freq[6] + "\n9\t\t"
                    + freq[7] + "\n10\t\t" + freq[8] 
                    + "\n11\t\t" + freq[9] + "\n12\t\t" 
                        + freq[10]); 
                    //+ "\n3\t\t" + freq[11] 
                      //  + "\n4\t\t"); 
                    //+ freq[12] + "\n5\t\t");
    }
    public static int rollDice() {
        
        int face1 = 1 + diceRoll.nextInt( 6 );
        
        int face2 = 1 + diceRoll.nextInt( 6 );
        
        int sum = face1 + face2;        
        
        return sum;
    }
}
            