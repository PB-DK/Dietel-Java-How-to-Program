/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fTriangleProblem;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class fTriangleProblem3a {    
        
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
    
        for ( int j = 0; j < 10; j++ ) {
                        
            for ( int i = 10; i > j; i--) {

                System.out.print(" ");
            }
            for ( int k = 0; k < j + 1; k++ ) {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
