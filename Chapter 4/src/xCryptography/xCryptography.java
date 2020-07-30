/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xCryptography;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class xCryptography {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int number4D, digitOne, digitTwo, remainderOne, 
                remainderTwo, remainderThree, digitThree,
                digitFour, replaceOne, replaceTwo,
                replaceThree, encrypOne, replaceFour,
                encrypTwo, encrypThree, encrypFour ;

        System.out.println("Enter a four digit integer: ");
        number4D = input.nextInt();
        
        digitOne = number4D / 1000;  //   4321 / 1000 = 4
        
        remainderOne = number4D % 1000;  // 4321 % 1000 = 321
        digitTwo = remainderOne / 100;  // 321 / 100 = 3
        
        remainderTwo = remainderOne % 100;  // 321 % 100 = 21
        digitThree = remainderTwo / 10;    // 21 / 10 = 2
    
        digitFour = remainderTwo % 10;  // 21 % 10 = 1
        
        replaceOne = digitOne + 7;
        encrypOne = replaceOne % 10;
        
        replaceTwo = digitTwo + 7;
        encrypTwo = replaceTwo % 10;
        
        replaceThree = digitThree + 7;
        encrypThree = replaceThree % 10;
        
        replaceFour = digitFour + 7;
        encrypFour = replaceFour % 10;
        
        
        System.out.printf("%d%d%d%d\n", 
                encrypThree, encrypFour, encrypOne, encrypTwo);
                /*
            System.out.printf("%d %d %d %d\n",
                digitOne, digitTwo, digitThree, digitFour );
        
 */       
        
        
     //   digitFour = remainderTwo / 100;
    }

    
}
