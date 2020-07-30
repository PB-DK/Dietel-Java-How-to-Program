/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeartRate;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class HeartRateTest {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        HeartRates myHeartRate1 = new HeartRates(/*"","",0,0,0*/);  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      
        System.out.println("Please enter your first name: ");
        String firstName = input.nextLine();
        myHeartRate1.setFirstName( firstName );
        
        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();
        myHeartRate1.setLastName( lastName );
        
        System.out.println("Please enter the day of your birth: ");
        int day = input.nextInt();
        myHeartRate1.setDayBirth( day );
        
        System.out.println("Please enter the month of your birth: ");
        int month = input.nextInt();
        myHeartRate1.setMonth( month );

        
        System.out.println("Please enter the year of your birth: ");
        int year = input.nextInt();
        myHeartRate1.setYearBirth( year );
        
        System.out.println("");
                
        System.out.printf("The name you have entered is: %s %s\n"
                + "The DOB you have entered is: %d/%d/%d\n",
                myHeartRate1.getFirstName(),
                myHeartRate1.getLastName(),
                myHeartRate1.getDayBirth(),
                myHeartRate1.getMonth(),
                myHeartRate1.getYearBirth());
        
                myHeartRate1.calculateAge();
                myHeartRate1.calculateMaxHR();
                myHeartRate1.targetHR();
     
    } 
}
/*
NOTES: 
-Should I be "return"ing the data from the methods ( calculateAge(), 
 calculateMaxHR(), targetHR()) in Tthe HeartRate Class?




            public void calculateMaxHR( age ) {
        int MaxHR;
        MaxHR = 220 - (int age);
        System.out.printf("Your max HR is: %d\n", MaxHR);
        */