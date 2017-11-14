/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

/**
 *
 * @author EvMit8495
 */
public class Truck extends Vehicle{
    private Boolean trailer;
    
    public Truck(String colour, String fuel, boolean hasTrailer){
        super (colour,fuel);
        trailer=hasTrailer;
    }
    public boolean hasTrailer(){
        return trailer;
    }
    public String toString(){
        String truckString;
        
        truckString = "The truck is the colour: " + super.getColour() + ". "
                + "The truck runs on: " + super.getFuel() + ". "
                + "The van has: " + trailer + ". ";
        
        return(truckString);
    }
    
}
