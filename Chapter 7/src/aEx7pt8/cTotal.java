/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aEx7pt8;

/**
 *
 * @author User
 */
public class cTotal {
    
    public static void main(String[] args) {
        
        float [] c = new float [100];
        int total = 0;
        
        for ( int d = 0; d < c.length; d++ ) {
            total += c[d];
        }
        System.out.printf("%d\n", total );
         
        float [] e = { 5, 4, 3, 2, 1 };
        int total1 = 0;
        
        for ( int f = 0; f < e.length; f++ ) {
            total1 += e [f];
        }
        System.out.printf("%d\n", total1 );
    }    
}
