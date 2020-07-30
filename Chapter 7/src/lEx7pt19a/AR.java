/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lEx7pt19a;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class AR {
    
    enum Seat{ FIRSTCLASS, SECONDCLASS };
    Seat seatClass;
    boolean[] seating = new boolean[10]; 
    Scanner input = new Scanner( System.in );
    int upper;
    int lower;
    
    public void makeReservation() {
        
        while (true) //Sorry, I'm still using this loop for now
        {  
            bookClass();  
            System.out.println(seatClass == Seat.FIRSTCLASS ? "First Class " : "Economy");
     //       System.out.printf("Seat# %d\n", bookSeat(lower, upper));         
        }
    }    
    public void bookClass() {
        
        System.out.println("Please select a class:\n"
                + "1 for First Class\n"
                + "2 for Second Class");
        int choice = input.nextInt();
        
        if ( choice == 1 ) {
            seatClass = Seat.FIRSTCLASS;
            lower = 0;
            upper = 4;
        } else if ( choice == 2 ){
            seatClass = Seat.SECONDCLASS;
            lower = 5;
            upper = 9;
        }       
    }
    public void bookSeat( int upp, int low ) {
        
        boolean seatAssigned = false;
        int seatNumber = -1;
        
        for ( int i = low; seatAssigned = false && i <= upp; i++ ) {
            
            if ( seating[i] = false ) {
                
                seating[i] = true;
                seatNumber = i + 1;
                seatAssigned = true;
            }
        }
        if ( seatAssigned == false ) {
            
            System.out.println("Class full");
        }       
    }   
    public static void main( String[] args ) {
        
        
        
     
        
        
    }    
}
