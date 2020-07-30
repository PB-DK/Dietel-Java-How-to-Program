/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dSalaryCalculator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FSalaryCalculator {
    
    public static void main(String args[]) {
       
    Scanner input = new Scanner( System.in );
        
    double grossPay = 0.0;
    double hours;
    double totalHours;
    double hourlyRates = 0;
    int counter = 1;
//    String name;
    
    while ( counter <= 3) {
        String name = null;
        
        System.out.println("Please enter employee name: ");
        name = input.next();
                
        System.out.println("Please enter their hours worked: ");
        hours = input.nextDouble();
        
        System.out.println("Please enter their hourly rates: ");
        hourlyRates = input.nextDouble();
        
        if ( hours <= 40) {
            grossPay = hours * hourlyRates;
        }
        else {
            grossPay = (( 40 * hourlyRates ) + ((hours - 40) * (hourlyRates * 1.5) ));
        }
            System.out.printf("Employee %s's grosspay is: €%.2f\n"
                + "after working %.1f hours\n"
                + "at an hourly rate of €%.2f\n"
                + "***************************\n\n", name, grossPay, hours, hourlyRates);
        
        counter = counter + 1;
        }
    }
}
/*
Determine gross pay for three employees
********************************************************
declare/initialize variables
Input no. hours, hourly rates
Determine/display Each employees wage
********************************************************
gross pay
hours
employee number
total hours
hourly rates

while counter less than or equal to 3
    Prompt for employee name:
    input name

    prompt for number of hours worked
    input hours worked

    prompt for hourly rates
    input hourly rates

if hours less than or equal 40
    grosspay = no. hours * hourly rate
if else????/  hours greater than 40
    grosspay = (40 * hourly rate) 
        + ((no. hours - 40)*(1.5 * hourly rate)

Print each employees gross pay

//    int employeeNumber;

   //     name = null;
    //            + "after working %f hours\n", name, hours );

        /*
        System.out.println("Please enter their hourly rates:");
        hourlyRates = input.nextDouble();
        
        if ( hours <= 40) {
            grossPay = hours * hourlyRates;
        }
        else {
            grossPay = (( 40 * hourlyRates ) + ((hours - 40) * (hourlyRates * 1.5) ));
        }
        System.out.printf("Employee %s's grosspay is: %f\n"
                + "after working %f hours\n"
                + "at an hourly rate of %f\n", name, grossPay, hours, hourlyRates);
        */




