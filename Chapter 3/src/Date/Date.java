/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

/**
 *
 * @author User
 */
public class Date {
    
    int month;
    int day;
    int year;
    
    public Date(int monthInt, int dayInt, int yearInt) {
        month = monthInt;
        day = dayInt;
        year = yearInt;
    }
     public void setMonth(int monthInt) {
         month = monthInt;
     }
     public int getMonth() {
         return month;
     }
     public void setDay(int dayInt) {
         day = dayInt;
     }
     public int getDay() {
         return day;
     }
     public void setYear(int yearInt) {
         year = yearInt;
     }
     public int getYear() {
         return year;
     }
     public void displayDate() {
         System.out.printf("%d/%d/%d\n",
                 getMonth(),getDay(),getYear());
     }
    
}
