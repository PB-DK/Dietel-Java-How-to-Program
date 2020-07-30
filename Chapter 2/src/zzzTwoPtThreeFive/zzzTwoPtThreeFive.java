/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzTwoPtThreeFive;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class zzzTwoPtThreeFive {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        double milesPerDay, costPerGallon, milesPerGallon,
        parkingPerDay, tollsPerDay, costPerDay, gallons;                
        
        System.out.print("Please enter total miles driven per day: ");
        milesPerDay = input.nextDouble();
        
        System.out.print("Please enter the cost per gallon of gas: ");
        costPerGallon = input.nextDouble();
        
        System.out.print("Please enter the average miles per gallon: ");
        milesPerGallon = input.nextDouble();
        
        System.out.print("Please enter the parking fees per day: ");
        parkingPerDay = input.nextDouble();
        
        System.out.print("Please enter the tolls per day: ");
        tollsPerDay = input.nextDouble();
        
        gallons = milesPerDay / milesPerGallon;
        
        costPerDay = ((gallons) * costPerGallon ) + parkingPerDay + tollsPerDay; 
        
        System.out.printf("The amount of gallons used today was %f\n", gallons );
        System.out.printf("The total cost of travelling per day is %f\n", costPerDay );


    
}
}
/*
Please enter total miles driven per day: 29
Please enter the cost per gallon of gas: 26
Please enter the average miles per gallon: 23.4
Please enter the parking fees per day: 3.5
Please enter the tolls per day: 1.9
The amount of gallons used today was 1.239316
The total cost of travelling per day is 37.622222
*/