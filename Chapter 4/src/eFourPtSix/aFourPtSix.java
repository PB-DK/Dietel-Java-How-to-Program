/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eFourPtSix;

/**
 *
 * @author User
 */
public class aFourPtSix {
    
    public static void main(String args[]) {
        int x = 1;
        int sum = 0;
        
        while ( x <= 10 )  {
            sum += x;
            ++x;
        }
        System.out.printf("The sum is: %d\n", sum);
        
    }
}
/*
Ex 4.7
int x = 5;
int product = 5;

product *= x++;
product = product * x++;
product = product * (x = x + 1);
                    (x = 5 + 1)
                    (x = 6)     X= 5
product = 5 * 6;        5*5  = 25
        = 30







*/
