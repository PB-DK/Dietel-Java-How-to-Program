/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author User
 */
public class EmployeeTest {
    
    public static void main(String args[]) {
        
        Employee myEmployee1 = new Employee("Paul","Burke",200000);
        Employee myEmployee2 = new Employee("Jay","Jameson",30000);

        
        System.out.printf("The employee's name is: \n%s\n", myEmployee1.getFirstName());
        System.out.printf("The employee's second name is: \n%s\n", myEmployee1.getLastName());
        System.out.printf("His yearly salary is: \n%s\n", myEmployee1.yearlySalary());       
        System.out.printf("After a 10percent increase his new yearly salary is: \n%.2f\n\n",
                myEmployee1.newYearlySalary());
        
        System.out.printf("The employee's name is: \n%s\n", myEmployee2.getFirstName());
        System.out.printf("The employee's second name is: \n%s\n", myEmployee2.getLastName());
        System.out.printf("His yearly salary is: \n%s\n", myEmployee2.yearlySalary());       
        System.out.printf("After a 10percent increase his new yearly salary is: \n%.2f\n",
                myEmployee2.newYearlySalary());
        
    }
}
    /*
NOTES:
-Should I be using return statements in the Employee/Invoice Class etc to transfer numbers to
 the test class? There has to be a better way.
*/





        /*
        myEmployee1.getMonthSalary(); {
            double newSalary = myEmployee1.getMonthSalary() * 1.1;
    }
        
        /*
        Employee myEmployee2 = new Employee("Frank","Ryan",-89);
               
        System.out.printf("The employee's name is: \n%s\n", myEmployee2.getFirstName());
        System.out.printf("The employee's second name is: \n%s\n", myEmployee2.getLastName());
        System.out.printf("His monthly salary is: \n%s\n", myEmployee2.getMonthSalary());
*/
        
        /*
        System.out.printf("The employee's name is: \n%s\n",
                "The employee's second name is: \n%s\n",
                myEmployee.getFirstName(), myEmployee.getLastName());
*/

   