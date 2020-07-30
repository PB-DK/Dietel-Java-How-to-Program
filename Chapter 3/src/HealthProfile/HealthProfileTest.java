/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthProfile;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class HealthProfileTest {
    
    public static void main(String args[]) {
        
        HealthProfile myHealthProfile = 
            new HealthProfile("","","",0,0,0,0,0);  // am initialising these correctly?
            // am i meant to have so many instance variables in HealthProfileClass??
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first name: ");
        String firstName = input.nextLine();
        myHealthProfile.setFirstName( firstName );
        
        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();
        myHealthProfile.setLastName( lastName );
       
        System.out.println("Please enter your gender: ");
        String gender = input.nextLine();
        myHealthProfile.setGender(gender);
        
        System.out.println("Please enter the day of your birth: ");
        int day = input.nextInt();
        myHealthProfile.setDayOfBirth( day );
        
        System.out.println("Please enter the month of your birth: ");
        int month = input.nextInt();
        myHealthProfile.setMonthOfBirth( month );
        
        System.out.println("Please enter the year of your birth: ");
        int year = input.nextInt();
        myHealthProfile.setYearOfBirth( year );
        
        System.out.println("Please enter your height: ");
        int height = input.nextInt();
        myHealthProfile.setHeightInInches( height );
        
        System.out.println("Please enter weight in pounds: ");
        int weight = input.nextInt();
        myHealthProfile.setWeightInPounds( weight );
        
        System.out.printf("The name you have entered is: %s %s\n"
                + "The gender you have entered is: %s \n"
                + "The DOB you have entered is: %d/%d/%d\n"
                + "The height you have entered is: %d\n"
                + "The weight you have entered is: %d pounds\n",
                myHealthProfile.getFirstName(),
                myHealthProfile.getLastName(),
                myHealthProfile.getGender(),
                myHealthProfile.getDayOfBirth(),
                myHealthProfile.getMonthOfBirth(),
                myHealthProfile.getYearOfBirth(),
                myHealthProfile.getHeightInInches(),
                myHealthProfile.getWeightInPounds()  );
                         
                myHealthProfile.calculateAge();
                myHealthProfile.calculateMaxHR();
                myHealthProfile.targetHR();
                myHealthProfile.calculateBMI();


    }
    
}
/*
NOTES:
-Should I be initialising the attributes in line 19 above?
-Is it ok to declare instance variables at the top of 
 HealthProfile Class HeartRates Class etc and not make 
 them attributes of the constructor? Or make set and get 
 methods out of them?
-DOES BLAIRRRRRRRRRRR USE COMMENTS?
-Any advice about the way I'm doing my coding? Anything?
-Does he use Pseudocode?
*/















     /*
        System.out.printf("The name you have entered is: %s %s\n",
                "The gender you have entered is: %s \n",
                "The DOB you have entered is: %d/%d/%d\n",
                "The height you have entered is: %d\n",
                "The weight you have entered is: %d",
                myHealthProfile.getFirstName(),
                myHealthProfile.getLastName(),
                myHealthProfile.getGender(),
                myHealthProfile.getDayOfBirth(),
                myHealthProfile.getMonthOfBirth(),
                myHealthProfile.getYearOfBirth(),
                myHealthProfile.getWeightInPounds(),
                myHealthProfile.getHeightInInches());
        
                myHealthProfile.calculateAge();
                myHealthProfile.calculateMaxHR();
                myHealthProfile.targetHR();
                myHealthProfile.getHeightInInches();
                myHealthProfile.getWeightInPounds();
    
*/