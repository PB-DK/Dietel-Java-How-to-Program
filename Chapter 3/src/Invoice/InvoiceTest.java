/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class InvoiceTest {
    
    public static void main(String args[]) {   

        Invoice myInvoice = 
                new Invoice("Two","old oak", 5, 5.67);
        
        System.out.printf("The part number you requested is: \n%s\n",
                myInvoice.getPartNumber()); 
        System.out.printf("The part description is: \n%s\n", 
                myInvoice.getPartDescription());
        System.out.printf("The quantity of item requested is: \n%d\n", 
                myInvoice.getQuantity());
        System.out.printf("The price per item bought is: \n%.2f\n", 
                myInvoice.getPricePerItem());
        
        //System.out.printf("The amount of the invoice is: %.2f\n", myInvoice.getInvoiceAmount());
        myInvoice.printInvoiceAmount();
                
        //myInvoice.getInvoiceAmount(); *******************  
        
    }
}

/*  NOTES:
    -What is the correct way to call the method getInvoiceAmount() here in InvoiceTest?
     I havent done it correctly because I used System.out.printf in the getInvoiceAmount()
     method. Ok I am after getting it now but I'm still not sure I have done it the 
     correct way, should I be using a return statement in the Invoice class?
    -Is it ok to declare instance variables at the top of the Invoice Class but not make
     them attributes or create get and set methods for them.



*/

   //     System.out.println("Finally the cost of purchases is: \n%.2f\n", myInvoice.getInvoiceAmount());        

    /*            "The part description is: \n%s\n",
                "The quantity of item requested is: \n%d\n",
                "The price per item bought is: \n%.2f\n",
        //        "Finally the coast of purchases is: \n&.2f\n",
                myInvoice.getPartNumber() ,myInvoice.getPartDescription() 
                ,myInvoice.getQuantity() ,myInvoice.getPricePerItem());
     //         ,getInvoiceAmount());
    }
    
}
/*
     partNumber = partNum;
        partDescription = partDescript;
        quantity = quant;
        pricePerItem = priceItem;
*/
  //      double amount;
//  amount = myInvoice.getBalance();
   //     double amountOne= 0.0;    
   //     myInvoice.getInvoiceAmount(amountOne) = 0.0;
    
        
      //  Invoice myInvoice = new Invoice("Two","old oak",5,5.60);
        
    //    Scanner input = new Scanner( System.in );