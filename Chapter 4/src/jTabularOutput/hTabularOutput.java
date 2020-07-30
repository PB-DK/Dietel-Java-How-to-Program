/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jTabularOutput;

/**
 *
 * @author User
 */
public class hTabularOutput {
    
    public static void main(String args[]) {
        
        int N = 1;

        System.out.printf("N    10*N    100*N   1000*N\n\n");
    
    while ( N <= 5 )  {
        System.out.printf("%d    %d      %d     %d\n", N, 10*N, 100*N, 1000*N );
        N++;
        }
    }
    
    /*
    Use looping to output a table of multiples of N
    ************************************************
    declare variables + initialize
    create a while loop
    print the values in table form
    ***********************************************
    variables: 
    N
    ?? counter
    
        Print heading 
            N  N multi 10   N multi 100    N multi 1000
    
    while N is less than or equal to 5
            Print n=1,2,3,4,5    
    
    
    */
}
