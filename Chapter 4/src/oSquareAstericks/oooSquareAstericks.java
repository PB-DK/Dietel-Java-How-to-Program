/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oSquareAstericks;

/**
 *
 * @author User
 */
public class oooSquareAstericks {
    
    public static void main(String args[]) {
        int len = 8; // user input
       int x = 0;

       // print first line
       while (x++ < len) {
           System.out.print("* ");
       }
       System.out.println(); // new line
       // print the rest of lines *      * in a loop
       x = 0;
       while (x++ < len - 2) {
           System.out.print('*'); // beginning of line
           int y = 0;
           while (y++ < len - 2) {
               System.out.print("^^"); // dobule spaces
           }
           System.out.println("^*"); // end of line
       }
       x = 0;
       // print the last line
       while (x++ < len) {
           System.out.print("* ");
       }
       System.out.println();
    }   
}
