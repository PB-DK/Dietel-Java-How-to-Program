/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

/**
 *
 * @author User
 */
public class Invoice {
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partNum, String partDescript, int quant, double priceItem) {
        partNumber = partNum; 
        partDescription = partDescript;
        quantity = quant;
        pricePerItem = priceItem;
    }
    
    public void setPartNumber(String partNum) {
        partNumber = partNum;        
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartDescription(String partDescript) {
        partDescription = partDescript;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setQuantity(int quant) {
        quantity = quant;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPricePerItem(double priceItem) {
        pricePerItem = priceItem;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    public double getInvoiceAmount() {
        double amountOne = 0;
        if (quantity < 0) {
            quantity = 0;
        }
        if (pricePerItem < 0) {
            pricePerItem = 0.0;
        }
        if ((quantity > 0) && (pricePerItem > 0)) {
            
        amountOne = quantity * pricePerItem; 
        }
        return amountOne;    
        }
    
    public void printInvoiceAmount(){   
        System.out.printf("The amount of the invoice is: %.2f\n", getInvoiceAmount());
    }

//      System.out.printf(
//            "The amount of the invoice 
//                   is: \n%.2f\n", amountOne); ***********   
    }
  
/*
    public double getBalance() {
        return amount1;
    } *
    }

    /*
    public void displayInfo() {
        System.out.printf("The part number you requested is: \n%s\n",
                "The part description is: \n%s\n",
                "The quantity of item requested is: \n%d\n",
                "The price per item bought is: \n%.2f\n",
        //        "Finally the coast of purchases is: \n&.2f\n",
                getPartNumber() ,getPartDescription() ,getQuantity() ,getPricePerItem());
     //         ,getInvoiceAmount());
    }
}
/*
     partNumber = partNum;
        partDescription = partDescript;
        quantity = quant;
        pricePerItem = priceItem;
   // private double amount1;
    
    /*
    public Invoice(String partNum, String partDescript, int quant, double priceItem ) {
        
        partNumber = partNum;
        partDescription = partDescript;
        quantity = quant;
        pricePerItem = priceItem;
*/