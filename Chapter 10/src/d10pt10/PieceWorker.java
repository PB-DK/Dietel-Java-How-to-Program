/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d10pt10;

/**
 *
 * @author User
 */
public class PieceWorker extends Employee {
    
    private double wagePerPiece;
    private double piecesProduced;
    private double earned;
    
    public PieceWorker( String first, String last, 
        String ssn, double wagePP, double piecesP) {
        
        super( first, last, ssn );
        setWagePerPiece( wagePP );
        setPiecesProduced( piecesP );   
    }
    
    public void setWagePerPiece( double wagePP ) {
        
        if ( wagePP >= 0.0 )
            wagePerPiece = wagePP;
        else
            throw new IllegalArgumentException(
                "Wage per piece must be >= 0.0" );
    }
    
    public double getWagePerPiece() {
        
        return wagePerPiece;
    }
    
    public void setPiecesProduced( double piecesP ) {
        
        if ( piecesP >= 0.0 )
            piecesProduced = piecesP;
        else
            throw new IllegalArgumentException(
                "Wage per piece must be >= 0.0" );
    }
    
    public double getPiecesProduced() {
        
        return piecesProduced;
    }
    
    public double earnings() {
        
        if ( earned >= 0.0)
            return earned = getWagePerPiece() * getPiecesProduced();
        else
            throw new IllegalArgumentException(
                "Earnings must be > = 0.0" );
    }
//*****************************************************************    
    public String toString() {
    
        return String.format( "Wages per piece: %.2f\n"
            + "Pieces Produced: %.2f\n"
            + "Earneings obtained: %.2f\n", 
            + getWagePerPiece(), 
            + getPiecesProduced(),
            + earnings() );
//*****************************************************************    
        /*
                if ( hourlyWage >= 0.0 )
            wage = hourlyWage;
        else
            throw new IllegalArgumentException(
                "Hourly wage must be >= 0.0" );
        */
        
        
        
        
        
    
        
        
    }
    
}
