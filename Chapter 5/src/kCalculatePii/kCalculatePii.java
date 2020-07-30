/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kCalculatePii;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class kCalculatePii {
    
    public static void main(String args[]) {

        Scanner input = new Scanner( System.in );

        double pii = 0;
        
        for ( double i = 1.0; i <= 11; i = i + 2 ) {
                        
            if ( (i == 4) || (i == 1.0) ) {
                pii = pii;
            }
            else {
                pii = -pii;
            }
            pii = pii + 4 / i;
            /*
            for ( double pii = 4; pii <= 20; )

            */
  //        System.out.printf("%f", pii );
        }
        System.out.printf("%f\n", pii );   
    }
}
