/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeartRate;

/**
 *
 * @author User
 */
public class HeartRates {
    
    private String firstName;
    private String lastName;
    private int monthBirth;
    private int dayBirth;
    private int yearBirth;
    private int age;
    private int MaxHR;

   
    public HeartRates(/*String firstN , String lastN, int month, int day, int year */) {

        firstName = "";
        lastName = "";
        monthBirth = 0;
        dayBirth = 0;
        yearBirth = 0;
       
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
    public void setMonth(int month) {
        monthBirth = month;
    }
    public int getMonth() {
        return monthBirth;
    }
    
    public void setDayBirth(int day) {
        dayBirth = day;
    }
    public int getDayBirth() {
        return dayBirth;
    }
    public void setYearBirth(int year) {
        yearBirth = year;
    }
    public int getYearBirth() {
        return yearBirth;
    }
    
    public void calculateAge() {
        age = 2019 - getYearBirth();
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
}


