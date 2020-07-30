/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jAnalysis;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class jAnalysis {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;
        
        while ( studentCounter <= 10 )
        {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = input.nextInt();
            
            if (result != 1 && result != 2)
            {
                continue;
            }
            
            if ( result == 1 ) {
                passes = passes + 1;
                //studentCounter = studentCounter + 1;
            }
            else if ( result == 2 ) {
                failures = failures + 1;

            // if result =1 or 2
            studentCounter++;

            }

            System.out.printf("Passed: %d\nFailed: %d\n",
                passes, failures);
    
        if ( passes > 8 ) {
            System.out.println( "Bonus to instructor!" );
        }
    
    }
    
}
}
/*
I dont like the empty else!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Is there a better way to do it?
*/













