/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthProfile;

/**
 *
 * @author User
 */
public class HealthProfile {
    
    private String firstName;
    private String lastName;
    private String gender;
    private int dayBirth;
    private int monthBirth;
    private int yearBirth;
    private int heightInches;
    private int weightPounds;
    private int age;
    private int MaxHR;
    private double BMI;
    
    public HealthProfile(String fName, String lName, String gend, int dayOfBirth, int monthOfBirth, int year, int height, int weight) {
       firstName = fName;
       lastName = lName;
       gender = gend;
       dayBirth = dayOfBirth;
       monthBirth = monthOfBirth;
       yearBirth = year;
       heightInches = height;
       weightPounds = weight;
    }
    public void setFirstName(String fName) {
        firstName = fName;        
    }
    public String getFirstName() {
        return firstName;
    }
        public void setLastName(String lName) {
        lastName = lName;        
    }
    public String getLastName() {
        return lastName;
    }    
    public void setGender(String gend) {
        gender = gend;        
    }
    public String getGender() {
        return gender;
    }   
    public void setDayOfBirth(int dayOfBirth) {
        dayBirth = dayOfBirth;        
    }
    public int getDayOfBirth() {
        return dayBirth;
    }    
    public void setMonthOfBirth(int monthOfBirth) {
       monthBirth = monthOfBirth;
    }
    public int getMonthOfBirth() {
        return monthBirth;
    }   
    public void setYearOfBirth(int year) {
        yearBirth = year;
    }
    public int getYearOfBirth() {
        return yearBirth;
    }    
    public void setHeightInInches(int height) {
        heightInches = height;
    }
    public int getHeightInInches() {
        return heightInches;
    }
    public void setWeightInPounds(int weight) {
        weightPounds = weight;
    }
    public int getWeightInPounds() {
        return weightPounds;
    } 
    public void calculateAge() {
        age = 2019 - getYearOfBirth();
        System.out.printf("Your age is: %d\n", age);
    }
    public void calculateMaxHR() {
        MaxHR = 220 - age;
        System.out.printf("Your max HR is: %d\n", MaxHR);
    }
    public void targetHR() {
        double targetHR1 = MaxHR * 0.5;
        double targetHR2 = MaxHR * 0.85;
        System.out.printf("Your target heart "
                + "rate is between\n%.2f beats per "
                + "minute \nand\n%.2f beats per minute \n",
                targetHR1,targetHR2);
    }
    public void calculateBMI() {
        BMI = (getWeightInPounds() / (Math.pow(getHeightInInches(),2))) * 704 ;
        System.out.printf("Your BMI is: %.2f\n", BMI);
        System.out.println("BMI VALUES\n"
                + "Underweight: less than 18.5\n"
                + "Normal       between 18.5 and 24.9\n"
                + "Overweight:  between 25 and 29.9\n"
                + "Obese:       30 or greater");
        if (BMI < 18.5 )  {
            System.out.println("You are underweight");
        }
        if ((BMI > 18.5) && (BMI < 25)) {
            System.out.println("You are normal weight");
        }
        if ((BMI > 24.5) && (BMI < 30)) {
                System.out.println("You are overweight");
        }
        if (BMI > 29.9) {
                System.out.println("You are obese");
        }    
    }
}
    
