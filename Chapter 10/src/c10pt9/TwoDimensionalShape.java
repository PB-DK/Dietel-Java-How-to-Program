/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10pt9;

/**
 *
 * @author User
 */
public class TwoDimensionalShape extends Shape {
    
    private int area;
    
    public TwoDimensionalShape( int len, int wid, int aREA ) {
        
        super( len, wid );
        setArea( len, wid );        
    }
    
    public void setArea( int len, int wid ) {
        
        area = len * wid;
    }
    
    public int getArea() {       

        return area;
    }
    
    @Override
    public int area() {
        
        return getLength * getWidth;
    }
    
    public String toStrng() {
        
        return String.format( "The area is: "
            + "%d", super.toString());
    }
    
    
    
    
}
