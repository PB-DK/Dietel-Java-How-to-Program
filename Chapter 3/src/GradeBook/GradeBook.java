/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeBook;

/**
 *
 * @author User
 */
public class GradeBook {
    
    private String courseName;
    private String courseInstructorName;
    
    public GradeBook( String name, String instructorName ){
        courseName = name;
        courseInstructorName = instructorName;
    }
    
    public void setCourseName( String name ) {
        
        courseName = name;    
    }
    public String getCourseName() {
    
        return courseName;
    }
    public void setInstructorsName( String instructorName ) {
            courseInstructorName = instructorName;
        }
    public String getInstructorsName() {
            return courseInstructorName;
        }
    public void displayMessage() {
        
        System.out.printf("Welcome to the grade book \n%s!\n"
                + "This course is presented by \n%s!\n", 
                getCourseName(), getInstructorsName() );
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
    /*
    
    public void displayMessage( String courseName )   {
      
        System.out.printf("Welcome to the grade book \n%s!\n", courseName);
*/
                
  //    System.out.println("Welcome to the Grade Book! ");
    
