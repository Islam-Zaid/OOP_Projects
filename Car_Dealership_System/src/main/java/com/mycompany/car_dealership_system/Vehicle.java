package com.mycompany.car_dealership_system;

public class Vehicle {

        String modle;
    String tradeMark;
    double price;

    public Vehicle(String modle, String tradeMark, double price) {
        this.modle = modle;
        this.tradeMark = tradeMark;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "modle=" + modle + ", tradeMark=" + tradeMark + ", price=" + price + '}';
    }

    public void addVehicle(Vehicle[] vehicles, Vehicle newVehicle, int index) {
        if (index < vehicles.length) {
            vehicles[index] = newVehicle;
            System.out.println(newVehicle + "  Has been added to the Vehicles");
        } else {
            System.out.println("No Place Available");
        }
    }

    public boolean serchVehicle(Vehicle[] vehicles, Vehicle newVehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == newVehicle) {
                System.out.println(newVehicle + " Is Available");
                return true;
            }
        }
        System.out.println(newVehicle + " Is Not Available");
        return false;

    }

    public boolean sellVehicles(Vehicle[] vehicles, Vehicle newVehicle, Car[] cars) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == newVehicle) {
                System.out.println(newVehicle + " Is Sold");

                if (newVehicle == cars[i]) {
                    cars[i] = null;
                }

                vehicles[i] = null;
                return true;
            }

        }

        System.out.println(newVehicle + " Is Not Available");
        return false;
    }

   
}
