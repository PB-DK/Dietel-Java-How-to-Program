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
public class ThreeDimensionalShape extends Shape {
    
    private int area;
    private int volume;  
    private int height;
}

    public ThreeDimensionalShape( int len, int wid, 
        int aREA, int vol  ) {

        super( len, wid );
        setArea( len, wid );
        setVolume( heit );

    }

    public void setArea( int len, int wid ) {
        
        area = len * wid;
    }
    
    public int getArea() {       

        return area;
    }

    public void setHeight( int heit ) {

        height = heit;       
    }

    public int getHeight() {

        return height;
    }

    public void getVolume( int len, int wid, int heit ) {

        volume = len * wid * heit;
    }

    
