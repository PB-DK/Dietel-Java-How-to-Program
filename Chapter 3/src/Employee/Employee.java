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
public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthSalary;
    
    public Employee( String firstN, String lastN, double monthS) {
        
        firstName = firstN;
        lastName = lastN;
        monthSalary = monthS;
    }
    
    public void setFirstName(String firstN) {
        
        firstName = firstN;
    }
    
    public String getFirstName() {
        
        return firstName;
    }
    
    public void setLastName(String lastN) {
        
        lastName = lastN;
    }
    
    public String getLastName() {
        
        return lastName;
    }
    
    public void setMonthSalary(double monthS) {
        
        monthSalary = monthS;
    }
    
    public double getMonthSalary() {
        
        if (monthSalary < 0) {
            monthSalary = 0.0;
        }
        return monthSalary;
        }
    
    public double yearlySalary() {
        
        double yearlySalary;
        yearlySalary = monthSalary * 12;
        
        return yearlySalary;
    }
    
    public double newYearlySalary() {
        
        double newYearlySalary;
        newYearlySalary = (monthSalary * 12) * 1.1;
    
        return newYearlySalary;
    }
    
}