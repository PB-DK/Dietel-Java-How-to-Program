/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iModifiedCompoundInterest;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class iModifiedCompoundInterest {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int finalAmount;
        int startAmount = 100000;
        double interestRate = 0.05;
        int years;
        int centsPortion;
        int temp;
        int dollarsPortion;
        
        System.out.printf("%s%19s\n", "Years", "Amount");
        
        for ( years = 1; years <= 10; years++ ) {
        
        finalAmount = (int) (startAmount 
            * ( Math.pow(interestRate + 1, years)));
        
        System.out.printf("%4d%20d\n", years, finalAmount);
        
        }
        System.out.println();

        startAmount = 100000;
        finalAmount = 0;
        System.out.printf("%s%21s\n", "Years", "Amount" );
        
        for ( years = 1; years <= 10; years++ ) {
            
        finalAmount = (int) (startAmount 
            * ( Math.pow(interestRate + 1, years)));

        centsPortion = finalAmount % 100;  //  115762 % 100 = 62
        dollarsPortion = finalAmount / 100; //  115762 / 100 = 1157
        
        System.out.printf("%4d%20d.%2d\n", years,
            dollarsPortion, centsPortion);
        }        
    }
}
/*
-How can I get .00 to be displayed in the portion of the question
 eg 1340. 9
*/