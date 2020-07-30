package j5pt19;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class j5pt19 {
    
    public static void main( String args[] ) {
        
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;
        
        System.out.println( i == 1 );
        System.out.println( j == 3 );
        System.out.println( (i >= 1) && ( j < 4) );
        System.out.println( (m <= 99) & ( k < m) );  //********
        System.out.println( (j >= i) || (k == m) );
        System.out.println( (k + m < j) | ( 3 - j >= k));
        System.out.println( !( k > m) );

        



        
    }
    
}
