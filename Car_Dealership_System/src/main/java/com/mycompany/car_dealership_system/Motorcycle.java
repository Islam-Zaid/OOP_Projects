
package com.mycompany.car_dealership_system;


public class Motorcycle extends Vehicle{
   

   String motorcycleType;

    public Motorcycle(String motorcycleType, String modle, String tradeMark, double price) {
        super(modle, tradeMark, price);
        this.motorcycleType = motorcycleType;
    }

    @Override
    public String toString() {
        return super.toString()+"Motorcycle{" + "motorcycleType=" + motorcycleType + '}';
    }
    
   
    
}
