/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cCreditLimitCalculator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DCreditLimitCalculator {
    
    public static void main(String args[]) {
        
        int accountNo;
        double balance;
        double totItemsCharged;
        double totCredits;
        double creditLimit;
        double newBalance;
        
        Scanner input = new Scanner( System.in );
        
        System.out.println("Please enter your account number ");
        accountNo = input.nextInt();
    
        System.out.println("Please enter your balance");
        balance = input.nextDouble();
    
        System.out.println("Please enter total items charged");
        totItemsCharged = input.nextDouble();
    
        System.out.println("Please enter total credits");
        totCredits = input.nextDouble();
    
        System.out.println("Please enter credit limit");
        creditLimit = input.nextDouble();
        
        newBalance = (balance + totItemsCharged) - totCredits;
        
        System.out.printf("Your account: %d has a\n"
                + "new balance of: %.2f \n", accountNo, newBalance);
        
        if ( newBalance > creditLimit ) {
            System.out.printf("Credit limit %.2f exceeded\n", creditLimit);
        }
    }
    
}
/*
    Initialize new balance to zero
    
    Prompt the user to enter ac/t no.
    Input user's account number
    Prompt the user to enter balance @ start of month
    Input user's balance @ start of month
    Prompt the user to enter the total of all items this month
    Input user's total of all items
    Prompt the user to enter all credits to a/c this month
    Input user's credits this month
    Prompt user's allowed credit limit
    Input user's allowed credit limit
    
    Calculate new balance by adding charges to beginning
     balance and subtracting credits
    Display new balance and determine if it exceeds cred
     limit
        if new balance exceeds credit limit
            Print "Credit limit exceeded"
*/