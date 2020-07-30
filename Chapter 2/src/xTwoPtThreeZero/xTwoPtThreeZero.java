/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xTwoPtThreeZero;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class xTwoPtThreeZero {
    
        public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int number, num1Final, num2, num3Final, num4, num5, num6Final,
                num7, num8, num9, num10Final, num11, 
                num12, num13, num14Final;
        
        System.out.print("Enter a number with five digits: ");
        number = input.nextInt();
    
        num1Final = number / 10000;      //  4
        
        num2 = number / 1000;       //  42
        num3Final = num2 % 10;           //  2
        
        num4 = number / 100;        //  423
        num5 = num4 % 100;           //23
        num6Final = num5 % 10;           //3
        
        num7 = number / 10;         //4233
        num8 = num7 % 1000;           // 233
        num9 = num8 % 100;          //33
        num10Final = num9 % 10;          //3
        
        num11 = number % 10000;       //2339
        num12 = num11 % 1000;       //339
        num13 = num12 % 100;        //39
        num14Final = num13 % 10;         //9
        
        System.out.printf("%d   %d   %d   %d   %d\n"
        , num1Final, num3Final, num6Final, 
        num10Final, num14Final);
     
   
}
}
