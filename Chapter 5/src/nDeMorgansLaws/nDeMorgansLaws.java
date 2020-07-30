/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nDeMorgansLaws;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class nDeMorgansLaws {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner( System.in );
        
        int y = 0,b = 0,g = 0,
                x = 0,i = 0,j = 0, z = 0, m = 0, a = 0;
        
        System.out.println( !(( z < 5 ) && ( y >= 7 )));
        System.out.println( !( m < 5 ) && !( y >= 7 ));
        
        System.out.println(!(( a == b ) || ( g != 5)));
        System.out.println(!( a == b ) || ( g != 5));

          
        System.out.println(!( x <= 8 ) && !( y > 4 ));
        System.out.println(!(( x <= 8 ) && ( y > 4 )));

        
        System.out.println(!( i > 4 ) || !( j <= 6 ));
        System.out.println(!(( i > 4 ) || ( j <= 6 )));


        
    }    
}
/*
5.23
a)  !(( x < 5 ) && ( y >= 7 ))
b)  !(( a == b ) || ( g != 5))
c)  !( x <= 8 ) && !( y > 4 )
d)  !( i > 4 ) || !( j <= 6 )



*/
