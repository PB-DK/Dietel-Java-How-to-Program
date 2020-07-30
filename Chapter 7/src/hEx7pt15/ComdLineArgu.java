/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hEx7pt15;

/**
 *
 * @author User
 */
public class ComdLineArgu {
    
    public static void main( String[] args) {
        
        int arrayLength = 11;
        int[] array = new int[ arrayLength ];
        int increment = 3;
        int initialValue = 0;
        
        if ( args.length != 3 )
            System.out.println(
                "Error: Please re-enter the entire "
                    + "command, including\nan array "
                        + "size, initial value and "
                            + "increment." );
        else {
            
            if ( arrayLength == 0 ) {
                arrayLength = Integer.parseInt( args[ 0 ]);
                array = new int[ 10 ];
            }
            else {
                arrayLength = Integer.parseInt( args[ 0 ] );
                array = new int[ arrayLength ];
            }
            initialValue = Integer.parseInt( args[ 1 ]);
     //     int increment = Integer.parseInt( args[ 2 ]);
            increment = Integer.parseInt( args[ 2 ]);
           
            for ( int counter = 0; counter < array.length; counter++) {
                array[ counter ] = initialValue + increment * counter;
            }
                System.out.printf("%s%8s\n", "Index", "Value" );
                       
            for ( int counter = 0; counter < array.length; counter++) {
                System.out.printf( "%5d%8d\n", counter, array[ counter ]);
            }
        }
    }
}
