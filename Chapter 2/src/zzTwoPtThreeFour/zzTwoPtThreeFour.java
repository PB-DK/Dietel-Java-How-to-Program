/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzTwoPtThreeFour;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class zzTwoPtThreeFour {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        double population, growthRate,  // 7.7  1.07(1.0107
        pop1 ,pop2 ,pop3 ,pop4 ,pop5;
                
        System.out.print("Please enter the current world population: ");
        population = input.nextDouble();
        
        System.out.print("Please enter the growth rate: ");
        growthRate = input.nextDouble();
        
        pop1 = population * growthRate;
        
        pop2 = pop1 * growthRate;
        
        pop3 = pop2 * growthRate;
        
        pop4 = pop3 * growthRate;
        
        pop5 = pop4 * growthRate;
        
        System.out.printf("The current population is %f Billion\n", population);
        System.out.printf("The estimated population after one year is %f Billion\n", pop1);
        System.out.printf("After two years is %f Billion\n",pop2);
        System.out.printf("After two years is %f Billion\n",pop3);
        System.out.printf("After two years is %f Billion\n",pop4);
        System.out.printf("After two years is %f Billion\n",pop5);

    }
    
}
