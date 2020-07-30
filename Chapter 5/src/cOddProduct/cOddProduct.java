/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cOddProduct;

/**
 *
 * @author User
 */
public class cOddProduct {
    
    public static void main(String args[]) {
        
        int product = 1;

        for ( int i = 1; i <= 15; i += 2) {
            product *= i;
        
        System.out.println("Product is: \n" + product);
        }
        System.out.printf("Product is: %d\n" , product);
    }
}
        // 1 = 1 * 1    
        //  = 
        // i = i + 2
        // 3 = 1 + 2
        // 5 = 3 + 2

