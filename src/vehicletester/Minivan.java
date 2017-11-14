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
public class Minivan extends Vehicle{
    private String make;
    
    public Minivan(String colour, String fuel, String brand){
        super (colour,fuel);
        make = brand;
    }
    public String toString(){
        String vanString;
        
        vanString = "The minivan is the colour: " + super.getColour() + ". "
                + "The minivan runs on: " + super.getFuel() + ". "
                + "The minivan is a: " + make + ". ";
        
        return(vanString);
    }
}
