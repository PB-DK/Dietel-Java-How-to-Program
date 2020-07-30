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
public class kCalculatePii2Final1 {
    
    public static void main(String args[]) {
        
    Scanner input = new Scanner( System.in );
    
    double pii = 0.0;
    int odd = 1;
    
    for ( int i = 1; i <= 200000; i++) {
        double currentTerm = 0.0;
        
        if ( i % 2 == 0 ) {
            currentTerm = (double) -4/odd;
        }
        else {
            currentTerm = (double)4/odd;
        }
        odd = odd + 2;
        pii = pii + currentTerm;        
    }
    System.out.println(pii);       
}
}
