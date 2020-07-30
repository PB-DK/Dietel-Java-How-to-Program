/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gSalesCommissionCalculator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class eSalesCommissionCalculator {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
         
        double finalEarnings;
        double total = 0.0;
        double total1 = 0.0;
        double salaryPerWeek;
        int itemNumber = 0;
        int numItems = 0;
        
        while ( itemNumber != -1 ) {
        
            System.out.println("Enter the item sold: (-1 to exit) ");
            itemNumber = input.nextInt();
        
        if ( itemNumber != -1 )     {
        
            System.out.println("Enter the number of items sold: ");
            numItems = input.nextInt(); 
        

            if ( itemNumber == 1 ) {
                total = 0.0;            //SHOULD I GET RID OF THIS???
                total = 239.99 * numItems;
            }
            else    
                if ( itemNumber == 2 ) {
                    total = 0.0;
                    total = 129.75 * numItems;
                }
                   else    
                    if ( itemNumber == 3 ) {
                        total = 0.0;
                        total = 99.95 * numItems;
                    }
                    else    
                        if ( itemNumber == 4 ) {
                            total = 0.0;
                            total = 350.89 * numItems;
                        }
            
                    
            System.out.printf(
                "For item number %d the salesperson\n"
                + "has sold %d which gives them sales\n"
                + "of %.2f\n\n", itemNumber, numItems, total);
                total1 = total1 + total;
                
        salaryPerWeek = (total1 * 0.09) + 200;   
        System.out.printf(
                "The total salary that this\n"
              + "salesperson has earned is: %.2f\n"
              + "from total sales of: %.2f\n\n", salaryPerWeek, total1);
        }
        
                else  {
            System.out.print("");
    /*        System.out.println(
                "No valid value has been entered"); */
            }      
        }
    }
}
/*
- total = 0.0;    //SHOULD I GET RID OF THIS???


-For using a sentinel value when I need to separate two inputs, is
 using an if the way he would go about it?

- With----- System.out.println("No values have been entered");
  -> How can I correctly code a "No values entered" statement
     Line 73
                                  
           
        
   

  Determine a sales person's earnings per week
***********************************************************
    initialize variables:
    Input items sold
    Calculate and display salesperson's earnings
**********************************************************
    variables:
    finalEarnings
    Base salary per week
    Total sales per week

    while items != -1
    Prompt for the items sold per week
    Input item no.

    Prompt for the no. of each items sold/week
    Input no. of items

    -1 entered (sentinel) ends while loop 

    If item 1 is chosen multiply it by the no.
    of items inputted
    239.99 * no. of items =+ total
    num1++

    If item 2 is chosen multiply it by the no.
    of items inputted
    129.75 * no. of items =+ total
    num2++

    If item 3 is chosen multiply it by the no.
    of items inputted
    99.95 * no. of items =+ total
    num3++

    If item 4 is chosen multiply it by the no.
    of items inputted
    350.89 * no. of items +=total
    num4++

    Calculate earnings:
    Final earnings = 200 + total
    Print final earnings
    


*/
