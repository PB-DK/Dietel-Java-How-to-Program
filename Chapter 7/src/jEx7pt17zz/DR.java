package jEx7pt17zz;

import java.util.Random;

public class DR {
 
    public void RollDice() {
    
        Random randomNumbers = new Random();
    
        int face1;
        int face2;
        int totals[] = new int[13];

    for ( int index = 0; index < totals.length; index++ )
        totals[ index ] = 0;
    
    for ( int roll = 1; roll <= 3600000; roll++ ) {
        face1 = 1 + randomNumbers.nextInt(6);
        face2 = 1 + randomNumbers.nextInt(6);
        totals[ face1 + face2 ]++;        
        }
    
    System.out.printf("%3s%12s%12s\n", 
            "Sum", "Frequency", "Percentage" );
    
        for ( int k = 2; k < totals.length; k++ ) {
            
            int percent = totals[ k ] / 36000;
            System.out.printf( "%3d%12d%12d\n", 
                k, totals[ k ], percent );            
        }    
    }
}