/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aSelfReviewQs;

/**
 *
 * @author User
 */
public class SelfReview {
    
    /*
    
11.1)
    InputMismatchException ( Strings )  
    ArithmeticException ( int, double, zero )
    IOException
    NullPointerException
    IndexOutOfBoundsException   
    
11.2)
    Exception handling is not designed to process 
    problems associated with asynchronous events 
    (e.g., disk I/O completions, network message 
    arrivals, mouse clicks and keystrokes), which 
    occur in parallel with, and independent of, 
    the program’s flow of control.
    
***************************************************
    
    (a) Exception handling is designed to handle 
    infrequently occurring situations that often
    result in program termination, not situations 
    that arise all the time. 
    (b) Flow of control with conventional control 
    structures is generally clearer and more eff
    -icient than with exceptions. 
    (c) The additional exceptions can get in the 
    way of genuine error-type exceptions. It 
    becomes more difficult for you to keep track 
    of the larger number of exception cases.
    
****************************************************    
  
11.3)
    Because you can find out informations about these
    exceptions in the API making them easier to 
    understand and implement.
    
****************************************************
    
    It’s unlikely that methods of classes in the Java 
    API could perform error processing that would meet 
    the unique needs of all users.
    
******************************************************
    
11.4)
    Programs that obtain certain types of resources 
    must return them to the system explicitly to avoid 
    so-called resource leaks. These leaks are such as 
    memory leaks ie unused memory. Other resource leaks
    can occur such as when databases connections or 
    files or network connections that are not properly
    closed after they are no longer needed might not
    be available for use in other programs.
    
11.5)
    The catch blocks for that try statement are skipped, 
    and the program resumes execution after the last 
    catch block. If there’s a finally block, it’s 
    executed first; then the program resumes execution 
    after the finally block.
    
11.6)
    
    
    
    
    

11.9)
    The first matching catch block after the try block
    is executed.
    
11.10)
    Because that exception would be inherited by all 
    subclasses in the program eliminating the need for 
    wasted code ie the same code being rewritten in
    all of the subclasses which wastes time and makes
    be bulky and running a lot less efficintly and more
    prone to errors.
    
    *****
    This enables a program to catch related types of 
    exceptions and process them in a uniform manner. 
    However, it’s often useful to process the subclass 
    types individually for more precise exception 
    handling.
    *****
    
11.11)
    The finally block is the preferred means for 
    releasing resources to prevent resource leaks.
    
11.12)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
    
}
