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
public class Vehicle {
   
    private String vehicleColour;
    private String vehicleFuel;
    
public Vehicle(String colour,String fuel){
    vehicleColour = colour;
    vehicleFuel = fuel;
}
public String getColour(){
    return vehicleColour;
}
public String getFuel(){
    return vehicleFuel;
}
}