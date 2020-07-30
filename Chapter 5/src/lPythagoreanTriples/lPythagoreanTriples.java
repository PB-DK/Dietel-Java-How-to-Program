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
public class lPythagoreanTriples {
    
    public static void main(String args[]) {
        
    Scanner input = new Scanner( System.in );
     
    double side1 , side2 , hypotenuse ;
    
    //That tries all possibilities
    
        System.out.printf("%5s%6s%11s\n", "Side1", "Side2", "Hypotenuse");
    
    for ( side1 = 1; side1 < 25; side1++ ) {
    
        for ( side2 = 1; side2 < 25; side2++ ) {
        
            for ( hypotenuse = 1; hypotenuse < 25; hypotenuse++ ) {
                
                double a = side1, b = side2, c = hypotenuse;
                
                if (Math.pow(a, 2)+ Math.pow(b, 2)
                    == Math.pow(c, 2));
                    {
                        if (a < b) {
                        System.out.printf("%.2f\t %.2f\t %.2f\t \n", a, b, c);
                        }
                    }
                }
            }
        }    
    }
}
