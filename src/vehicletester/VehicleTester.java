/* vehicleTsster
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

/**
 *
 * @author EvMit8495
 */
public class VehicleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car c = new Car("blue","electricity",5);
       Truck t = new Truck("black","diesel",true);
       Minivan m = new Minivan("Green","gas","Mercedes");
       
       System.out.println(c);
       System.out.println(t);
       System.out.println(m);
    }
    
}
