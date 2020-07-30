/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AccountTest1 {
    
    public static void main(String args[]) {
        
        Account myAccount1 = new Account( 50.8 );
        Account myAccount2 = new Account( -12.7 );   // add 30,  bal = 17.30, 
        // withdraw 15, IT STILL WRITES:"debit amount exceeded account balance 
        
        System.out.printf("Your account balance is: \n%.2f\n",
                myAccount1.getBalance());
        System.out.printf("Your account balance is: \n%.2f\n",
                myAccount2.getBalance());
        
        Scanner input = new Scanner( System.in );
        double depositAmount;
        double debitAmount;
        
        System.out.println("Enter deposit amount for account1 "
                + "you wish to lodge: ");
        depositAmount = input.nextDouble();
        
        System.out.printf("Adding %.2f to account1 balance.\n", 
                depositAmount);
        myAccount1.credit(depositAmount);
        
        System.out.printf("Account1 balance is %.2f\n", 
                myAccount1.getBalance());

    
        System.out.println("Enter deposit amount for account2 "
                + "you wish to lodge");
        depositAmount = input.nextDouble();
    
        System.out.printf("Adding %.2f to account2 balance.\n",
                depositAmount);
        myAccount2.credit(depositAmount);
   
         System.out.printf("Account2 balance is %.2f\n",
                myAccount2.getBalance());
         
         
        System.out.println("Enter the amount you would like "
                + "to withdraw");
        debitAmount = input.nextDouble();
        
        System.out.printf("Subtracting %.2f from account1 balance.\n",
            debitAmount);
        myAccount1.debit(debitAmount);
        
        System.out.printf("Account1 balance is %.2f\n", 
                myAccount1.getBalance());
        
        System.out.println("Enter the amount you would like"
                + " to withdraw");
        debitAmount = input.nextDouble();
        
        System.out.printf("Subtracting %.2f from account2 balance.\n",
                debitAmount);       
        myAccount2.debit(debitAmount);
        
        System.out.printf("Account1 balance is %.2f\n", 
                myAccount2.getBalance());
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        
    }
    
}
        /*    
        System.out.println("Please enter your the amount you "
                + "wish to lodge: \n");
        System.out.printf("Your new balance is: \n%.2f\n",
                myAccount2.getBalance());
*/