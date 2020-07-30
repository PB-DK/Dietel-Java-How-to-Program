/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fTriangleProblem;

/**
 *
 * @author User
 */
public class fTriangleProblem3 {
    
    public static void main(String args[]) {
        
        int j = 0;
        int i = 0;
        
        for ( int k = 0; k < i + 1; k++ ) {

        
        for ( j = 10; j > k ; j-- )  {
                        
            System.out.print( " " );
        }
        for ( i = 0; i < j + 1; i++ ) {
                        
            System.out.print( "*" );
            }       
/*        for ( int k = 10; k > j; k-- ) {
                        
            System.out.print( "*" );
        }*/
            System.out.println();       
                
        }    
    }
}

