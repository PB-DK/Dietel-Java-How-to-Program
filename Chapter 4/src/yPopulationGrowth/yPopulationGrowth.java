/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yPopulationGrowth;

/**
 *
 * @author User
 */
public class yPopulationGrowth {
    /*
    Pop 7.53
    Grow 1.2
    */
    public static void main(String args[]) {
        
        double newPop = 7.53;
      double population = 7.53;
        double growth = 0.012;
        double populationIncrease;
        int counter = 1;
        int years = 2019;
        
        System.out.println("Year\tPopulation\t\tPopulation Increase");
//        System.out.printf("%d\t%f\t%f", years, population, );
        
        while ( counter <= 75 )  {
            
            
            populationIncrease = newPop * growth;   //  7.53 * 0.012 = 0.090360
            newPop = newPop + populationIncrease;   //  7.53 + 0.090360
                        
            System.out.printf("%d\t%f Billion\t%f Billion\n", years, newPop, populationIncrease);
            
            counter++;
            years++;
            
            if ( newPop == 2 * population ) {
                System.out.printf("This year %d the world's population "
                        + "of %f has doubled since 2019", years , newPop );
            }
        }
        
        
    }
    
    
    
    
    
        //      populationIncrease = newPop - population;


    
}
