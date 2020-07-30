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
public class kCalculatePii1 {
    
    public static void main(String args[]) {

    Scanner input = new Scanner( System.in );

        double pii = 0.0;
        double pii1;
        int n = 1;
    
    //    for ( int n = 1; n < 20; n = n + 2 ) {
            
            pii1 = (4 / (n)) ;
            
            pii += pii1;
            
            for ( n = 3; n < 20; n = n + 4 ) {
        
            pii -= pii1;
            }
            for ( n = 1; n < 20; n = n + 4 ) {
        
            pii += pii1;
            }
                         // 4/1  4/3  4/5  4/7
            pii += pii1;
                
        System.out.printf("Pii is: %f\n", pii);
        }
    }
