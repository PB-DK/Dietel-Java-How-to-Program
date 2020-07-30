/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCompoundInterest;

/**
 *
 * @author User
 */
public class eCompoundInteresta {
    
    public static void main(String args[]) {
    
        int years;
        double finalAmount = 0;
        double rate = 0.05;
        double beginAmount = 1000;
        
        System.out.printf( "%-6s%9s","Year","Amount\n");

        for ( years = 1; years <= 5; years++ ) {
            
            for ( rate = 0.05; rate <= 0.1; rate = rate + 0.01 )
            
            finalAmount = beginAmount * 
                    ( Math.pow( 1 + rate ,years));
        
            System.out.printf( 
                "%-6d%9.2f\n", years, finalAmount  );
        }
    }       
}    
