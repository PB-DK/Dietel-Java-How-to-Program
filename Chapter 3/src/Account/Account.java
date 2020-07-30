 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author User
 */
public class Account {
    
    private double balance;
    
    public Account( double initialBalance ) {
         
        if ( initialBalance > 0.0 )
        {
            balance = initialBalance;
        }
        //
        if ( initialBalance < 0.0 )
        {
            balance = initialBalance;
        }
        //
        if ( initialBalance == 0.0 )
        {
            balance = initialBalance;
        }
    
    }
        public void credit( double amount ) {
            balance = balance + amount;
    }
    
        public void debit( double debitAmount ) {
    
            if ( debitAmount < balance ) {              //  5 < 7.70    yes
             
                balance = balance - debitAmount;
        }
            if ( debitAmount == balance ) {             //   
             
                balance = 0.0;
        }  
            if ( debitAmount > balance ) {
            
                System.out.println("Debit amount exceeded "
                    + "account balance");
    }
    }
        public double getBalance() {
            return balance;
    }
    


}

















