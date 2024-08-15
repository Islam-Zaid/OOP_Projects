
package com.mycompany.car_dealership_system;


public class Car extends Vehicle {
    int numberOfDoors;
    String fuelType;

    public Car(int numberOfDoors, String fuelType, String modle, String tradeMark, double price) {
        super(modle, tradeMark, price);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" + "numberOfDoors=" + numberOfDoors + ", fuelType=" + fuelType + '}';
    }
    
    public void addCar(Car[] cars, Car newCar, int index) {
        if (index < cars.length) {
            cars[index] = newCar;
            
        }
    }
    public void showCars(Car[] cars){
        for(int i=0;i<cars.length;i++){
            if(cars[i]!=null){
            System.out.println(cars[i]);
            }
        }
        
    }
}
