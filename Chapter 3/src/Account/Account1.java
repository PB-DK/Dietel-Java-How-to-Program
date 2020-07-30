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
public class Account1 {
    
    private double balance;
    
    public Account1( double initialBalance ) {
         
        if ( initialBalance > 0.0 )
        {
            balance = initialBalance;
        }
    }
        public void credit( double amount ) {
            
            balance = balance + amount;
    }
    
        public void debit( double amount ) {
    
            if ( amount > balance ) {              //  5 < 7.70    yes
             
                System.out.println( 
                    "Debit amount exceeded account balance" );
        }
            if ( amount <= balance ) {             //   
             
                balance = balance - amount;
        }
    }
        public double getBalance() {
            return balance;
    }
    


}

















