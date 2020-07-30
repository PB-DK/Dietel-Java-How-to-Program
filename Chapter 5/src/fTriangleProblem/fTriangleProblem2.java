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
public class fTriangleProblem2 {
    
    public static void main(String args[]) {
        
      for ( int j = 0; j < 10; j++ )  {

        for ( int i = 1; i < j + 1; i++ ) {
                        
            System.out.print( " " );
            }       
        for ( int k = 10; k > j; k-- ) {
                        
            System.out.print( "*" );
        }
            System.out.println();       
        }    
    }  
}
