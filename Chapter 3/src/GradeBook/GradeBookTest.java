/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeBook;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GradeBookTest {
    
    public static void main(String args[]) {
        
        GradeBook myGradeBook1 = 
                new GradeBook("CS101: Intro to Java Programming!", 
                        "Mr. James Vaughn ");

        GradeBook myGradeBook2 = 
                new GradeBook("CS102: Data Structures in Java",
                "Mr. Sec Ret ");

        System.out.printf("gradebook1 course name is: %s\n"
                + "gradebook1 instructor is: %s\n",
                myGradeBook1.getCourseName(), myGradeBook1.getInstructorsName());
        
        System.out.printf("gradebook2 course name is: %s\n"
                + "gradebook2 instructor is: %s\n",
                myGradeBook2.getCourseName(), myGradeBook2.getInstructorsName());
    
        myGradeBook1.displayMessage();
        myGradeBook2.displayMessage();
        
        /*    System.out.printf("gradebook2 course name is: %s\n",
                "gradebook2 instructor is: %s\n",
                myGradeBook2.getCourseName(), myGradeBook2.getInstructorsName());
       */ 
        /*
        System.out.printf("CS101: Intro to Java Programming! \n%s\n",
                myGradeBook1.setCourseName());
        */
        /*
        
        Scanner input = new Scanner( System.in );
        
        GradeBook myGradeBook = new GradeBook();
        
        System.out.printf("Initial course name is:\n%s\n",
                myGradeBook.getCourseName());
        
        System.out.println("Please enter your course name:");
        String theName = input.nextLine();
        myGradeBook.setCourseName(theName);
                
        System.out.println();
        
        myGradeBook.displayMessage();

        */
        
       /* 
        Scanner input = new Scanner( System.in );
        
        GradeBook myGradeBook = new GradeBook();
        
        System.out.println("Please enter your course name here: ");
        
        String courseName = input.nextLine();
        
        System.out.println();
        
        myGradeBook.displayMessage( courseName );
*/   
}
    
}
