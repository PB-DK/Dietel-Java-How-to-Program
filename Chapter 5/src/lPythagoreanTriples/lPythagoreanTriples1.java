/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lPythagoreanTriples;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class lPythagoreanTriples1 {    
        
    public static void main(String args[]) {
        
    Scanner input = new Scanner( System.in );
     
    int side1 , side2 , hypotenuse ;
    
    //That tries all possibilities
    
        System.out.printf("%5s%6s%11s\n", "Side1", "Side2", "Hypotenuse");
    
    for ( side1 = 1; side1 < 500; side1++ ) {
    
        for ( side2 = 1; side2 < 500; side2++ ) {
        
            for ( hypotenuse = 1; hypotenuse < 500; hypotenuse++ ) {
                
                int a = side1, b = side2, c = hypotenuse;
                
                if(( a * a ) + ( b * b )
                    == (c * c))                    {
                        if (a < b) {
                        System.out.printf("%5d %5d %10d \n", a, b, c);
                        }
                    }
                }
            }
        }    
    }
}