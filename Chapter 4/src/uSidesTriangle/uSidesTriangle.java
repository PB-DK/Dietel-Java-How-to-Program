/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uSidesTriangle;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class uSidesTriangle {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int sideOne;
        int sideTwo;
        int sideThree;
            
        
        System.out.println("Please enter a side of the triangle ");
        sideOne = input.nextInt();
        
        System.out.println("Please enter a side of the triangle ");
        sideTwo = input.nextInt();
       
        System.out.println("Please enter a side of the triangle ");
        sideThree = input.nextInt();

        
        if ( (sideOne < ( sideTwo + sideThree)) && ( sideTwo < ( sideOne + sideThree) ) && ( sideThree < ( sideTwo + sideOne) )) {
            System.out.println("This is a valid triangle ");
        }
        else {
            System.out.println("Not a valid triangle ");
        }
    }
}

    
        
        
        
        
        
        
        
    