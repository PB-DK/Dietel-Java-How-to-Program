/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bEx7pt9;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class N {
    
    public static void main(String[] args) {    
    
    int[][] v = {{ 6, 5, 4 },{ 3, 9, 1 },{ 7, 2, 8 }};
    int rows = 1;
 //   String Column = "";
        
//    System.out.printf("%s: \t %s %d \t %s %d \t %s %d \t \n", Rows, Column, 1, Column, 2, Column, 3 );
  
//    System.out.printf("%s: %s \t %s \t %s \t \n", Rows, Column, Column, Column );
    System.out.print("Rows:  Column 1  Column 2  Column 3 \n");


        for ( int row = 0; row < v.length; row++ ) {
            
                System.out.printf("Row %d : ", rows);
            
            for ( int column = 0; column < v[ row ].length; column++ ) {
                
                System.out.printf( " [%d]   \t", v[ row ][ column ] );
            }           
                rows++;
                
                System.out.println();
        }
                System.out.println();
    
        System.out.printf("%5s %8s %8s %8s\n","Rows:", "Column 1" , "Column 2" , "Column 3");


        for ( int row = 0; row < v.length; row++ ) {
            
                System.out.printf("Row %d: ", rows);
            
            for ( int column = 0; column < v[ row ].length; column++ ) {
                
                System.out.printf( " %5s%d%s ", "[",v[ row ][ column ],"]" );
            }           
                rows++;
                
                System.out.println();
            }
        }
    }