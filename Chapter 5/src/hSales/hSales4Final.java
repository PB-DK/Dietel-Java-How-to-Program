/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hSales;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class hSales4Final {
   
    public static void main(String args[]) {
	
		double product1 = 0, product2 = 0, product3 = 0, product4 = 0, product5 = 0; 
	
		String input;
		
		int productId = 0;
		
		input = JOptionPane.showInputDialog("Enter product number (1-5) (0 to stop)");
		productId = Integer.parseInt(input);
		
		while (productId !=0) {
			
		
			if (productId >=1 && productId <=5) {
				input = JOptionPane.showInputDialog("Enter quantity sold");
				int quantity = Integer.parseInt(input);
				
				
				switch (productId) {
					
					case 1:
						product1 += quantity * 2.98;
						break;
					case 2:
						product2 += quantity * 4.50;
						break;
					case 3:
						product3 += quantity * 9.98;
						break;
					case 4:
						product4 += quantity * 4.49;
						break;
					case 5:
						product5 += quantity * 6.87;
						break;	
				}//END SWITCH
			}//END IF
			else if (productId !=0) {
				JOptionPane.showMessageDialog(null, "Product number must be between 1 and 5 or 0 to stop", "Input Error", JOptionPane.WARNING_MESSAGE);
			}//END ELSE IF
			
			input = JOptionPane.showInputDialog("Enter product number (1-5) (0 to stop)");
			productId = Integer.parseInt(input);
			
		}//END WHILE
	
		
		String output = "Product 1: " + "€" + product1 + "\n";
		      output += "Product 2: " + "€" + product2 + "\n";
			  output += "Product 3: " + "€" + product3 + "\n";
			  output += "Product 4: " + "€" + product4 + "\n";
			  output += "Product 5: " + "€" + product5 + "\n";
			  
		JOptionPane.showMessageDialog(null, output, "Totals", JOptionPane.INFORMATION_MESSAGE);
		

    
}
}