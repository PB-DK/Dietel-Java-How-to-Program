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
public class Shape {
    
    private int length;
    private int width;
    
    public Shape( int len, int wid ) {
        
        length = len;
        width = wid;        
    }
    public void setLength( int len ) {
        
        length = len;
    }
    public int getLength() {
        
        return length;
    }
    public void setWidth( int wid ) {
        
        width = wid;
    }
    public int getWidth() {
        
        return width;
    }
    @Override
    public String toString() {
        
        return String.format( "The length of the "
            + "shape is: %d\nThe width of the "
            + "shape is: %d\n", getLength() ,getWidth() );       
    }
    
   /*
    
    public abstract int length; //maybe
    public abstract int width; //maybe    
    
    */
    
    
}
