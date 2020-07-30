/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bGasMileage;

import java.util.Scanner;      //sticher

/**
 *
 * @author User
 */
public class CGasMileage {
    
    public static void main(String args[]) {
       
    double miles = 0;
    double gallons;
    int numTrips = 0;
    double totalMiles = 0.0;
    double totalGallons = 0.0;
    double milesPerGallon = 0.0; 
    double totalMilesPerGallons = 0.0;
    
    Scanner input = new Scanner( System.in );
    
        while ( miles != -1 )   {
    
            System.out.println("Please enter the miles driven(-1) to exit: ");
            miles = input.nextDouble();
            
            if ( miles != -1 )    {
    
            System.out.println("Please enter the gallons used: ");
            gallons = input.nextDouble();
    
            numTrips = numTrips + 1;
            milesPerGallon = miles / gallons ;

    
            System.out.printf("For trip number %d there are %.2f miles\n"
                            + "driven and %.2f gallons used, meaning there\n"
                            + "are %.2f miles per gallon obtained.\n\n", 
            numTrips, miles, gallons, milesPerGallon);
    
            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;
            }
//            else    {
//                //System.out.println(""); 
//                System.out.println("No values have been entered");
//
//            }
        }
            if ( numTrips != 0 )    {
             
                System.out.printf("The total number of trips taken is: %d\n", numTrips++);
        
                totalMilesPerGallons = totalMiles / totalGallons ;

        
                System.out.printf("With %.2f total miles driven and\n"
                                + "%.2f total gallons used, meaning\n"
                                + "there are %.2f total miles per\n"
                                + "gallon obtained\n", 
                    totalMiles, totalGallons, totalMilesPerGallons);
            }
            else{
                System.out.println("No values have been entered");
            }
    }
}
/*
*****************************************************************
-For using a sentinel value when I need to separate two inputs, is
 using an if the only way i could go about it?

- With----- System.out.println("No values have been entered");
  -> How can I correctly code a "No values entered" statement
     Line 50

        









    double miles;
    double gallons;
    int numTrips = 0;
    double totalMiles = 0.0;
    double totalGallons = 0.0;
    double milesPerGallon = 0.0; 
    double totalMilesPerGallons = 0.0;
    
    Scanner input = new Scanner( System.in );
    
    System.out.println("Please enter the miles driven(-1) to exit: ");
    miles = input.nextDouble();
    
    System.out.println("Please enter the gallons used: ");
    gallons = input.nextDouble();
    
    numTrips++;
    milesPerGallon = miles / gallons ;

    
            System.out.printf("For trip number %d there are\n"
                    + "%.2f miles driven and %.2f gallons used\n"
                    + "meaning there are %.2f miles per gallon\n"
                    + "obtained.\n", 
            numTrips++, miles, gallons, milesPerGallon);
    
    while ( miles != -1 )   {
        totalMiles = totalMiles + miles;
        totalGallons = totalGallons + gallons;
        numTrips++;
        
        System.out.println("Please enter the miles driven(-1) to exit: ");
        miles = input.nextDouble();
    
        System.out.println("Please enter the gallons used: ");
        gallons = input.nextDouble();  
        
        System.out.printf("For trip number %d there are\n"
                    + "%.2f miles driven and %.2f gallons used\n"
                    + "meaning there are %.2f miles per gallon\n"
                    + "obtained.\n", 
            numTrips++, miles, gallons, milesPerGallon);
    }
    
    if ( numTrips != 0 )    {
        numTrips++;
             
        System.out.printf("The total number of trips taken is:%d\n", numTrips++);
        
                totalMilesPerGallons = totalMiles / totalGallons ;

        
        System.out.printf("With %.2f total miles driven\n"
                + "and %.2f total gallons used there\n"
                + "are %.2f total miles per gallon obtained\n", 
            totalMiles, totalGallons, totalMilesPerGallons);
    }
    */
    /*
    Initialize miles/gallon to zero
    Initialize total miles/gallon to zero
    Initialize counter to zero
    
    Prompt the user to enter numMiles
    Input the the number of miles driven(poss sentinel)
    Prompt the user to enter numGallons
    Input the amount of gallons used
    
    While counter is not equal to sentinel
       -Prompt the user to enter numMiles
        Input the the number of miles driven(poss sentinel)
       -Prompt the user to enter numGallons
        Input the amount of gallons used
    
        Calculate and display miles/gallons/trip
        
    Print the total miles/gallon for all trips
   */ 