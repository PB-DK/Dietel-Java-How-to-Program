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
public class fTriangleProblem2a {
    
        
    public static void main(String args[]) {
        
    Scanner input = new Scanner( System.in );
    
    for ( int j = 0; j < 10; j++ ) {
        
        for ( int i = 0; i < j; i++ ) {
            System.out.print(" ");        
            }  
        for ( int k = 10; k > j; k-- ) {
            System.out.print("*");        
            }
        System.out.println();
        }
    }    
}
