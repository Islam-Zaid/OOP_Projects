
package com.mycompany.car_dealership_system;


public class Truck extends Vehicle{
     double payloadCapacity;

    public Truck(double payloadCapacity, String modle, String tradeMark, double price) {
        super(modle, tradeMark, price);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+"Truck{" + "payloadCapacity=" + payloadCapacity + '}';
    }

    
    
}
