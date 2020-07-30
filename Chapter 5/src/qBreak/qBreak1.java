/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qBreak;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class qBreak1 {
    
    public static void main( String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int x = 1;
        
        for ( int i = 1; i <= 10; i++ ) {
            
            System.out.printf("%d ", i );
        }
                
        System.out.println();

        do {
            System.out.printf("%d ", x );
            x++;
        } while ( x <= 5 );
        {
        
        System.out.println("\nEarly exit "
            + "because of a 'break' condition");
        }
    //    System.out.println();
        
    }
}

