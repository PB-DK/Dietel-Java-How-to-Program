/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vPhyTriangle;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class vPhyTriangle {
    
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
        
        if (( Math.pow(sideOne,2) == ( Math.pow(sideTwo,2) + Math.pow(sideThree,2) ) )
            ||  ( Math.pow(sideTwo,2) ==  (Math.pow(sideOne,2) + Math.pow(sideThree,2) )) 
                || ( Math.pow(sideThree,2) ==  (Math.pow(sideTwo,2) + Math.pow(sideOne,2)) )) {
            System.out.println("This is a right angled triangle ");
        }
        else {
            System.out.println("Not a valid right angled triangle ");
        }
        }
    
}
