/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lEx7pt19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AInternet {
    
    enum Seat{FIRSTCLASS, ECONOMY};
    Seat seatClass;     
    boolean[] seating = new boolean[11]; //create 10 seats. Empty seat indicated by false
    int upper; 
    int lower;
     
    Scanner input = new Scanner(System.in);  
       
    public void makeReservation()  
    {                           
        while (true) //Sorry, I'm still using this loop for now
        {  
            bookClass();  
            System.out.println(seatClass == Seat.FIRSTCLASS ? "First Class " : "Economy");
            System.out.printf("Seat# %d\n", bookSeat(lower, upper));  
        }     
    }  
     
    public void bookClass()  
    {  
        int section = 0;
        System.out.print("Please type 1 for First Class or 2 for Economy: ");  
        section = input.nextInt();  
        if (section == 1)  
        {  
            seatClass = Seat.FIRSTCLASS;
            lower = 0;
            upper = 4;                
        }  
        else if (section == 2) 
        {  
            seatClass = Seat.ECONOMY;
            lower = 5;
            upper = 9;
        }           
    }    
     
    public int bookSeat(int low, int upp) //assign a seat   
    {  
        boolean seatAssigned = false; // flag
        int seatNumber = -1;
        for (int i = low; seatAssigned == false && i <= upp; i++)  
        {  
            if (seating[i] == false)  //if false, then a seat is available for assignment  
            {
                seating[i] = true; //set to true to mark seat as unavailable next time
                seatNumber = i + 1;  
                seatAssigned = true; //set flag to true to exit for loop
            }  
        }
        if (seatAssigned == false)
        {
            System.out.println("Class full");
        }
        return seatNumber; 
     }
    
}
