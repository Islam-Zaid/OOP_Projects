

package com.mycompany.car_dealership_system;


public class Car_Dealership_System {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];

        Car[] cars = new Car[6];

        Car car1 = new Car(4, "Banzen", "MK5", "BMW", 200000);
        Car car2 = new Car(4, "SOLAR", "Golf", "Volkswagen", 150000);
        Car car4 = new Car(4, "Diesel", "Cady", "Volkswagen", 80000);
        Car car5 = new Car(4, "Diesel", "Camaro ZL1", "Chevrolet", 250000);
        Truck truck1 = new Truck(2000, "volvo", "Volkswagen", 50000);
        Motorcycle motorcycle1 = new Motorcycle("26", "BX5", "Losefer", 1500);

        Truck truck2 = new Truck(4000, "volvo", "Volkswagen", 50000);

        Car car3 = new Car(4, "Gaz", "I30", "Hondy", 40000);

        System.out.println(" Adding Vehicles ");
        System.out.println("");
        car1.addVehicle(vehicles, car1, 0);
        car2.addVehicle(vehicles, car2, 1);

        truck1.addVehicle(vehicles, truck1, 2);
        motorcycle1.addVehicle(vehicles, motorcycle1, 3);
        System.out.println("----------------------------------");

        car1.addCar(cars, car1, 0);
        car2.addCar(cars, car2, 1);
        car4.addCar(cars, car4, 2);
        car5.addCar(cars, car5, 3);

        System.out.println("Serching for Vehicles");
        System.out.println("");
        truck1.serchVehicle(vehicles, truck1);
        car3.serchVehicle(vehicles, car3);
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Available Cars befor selling:");
        System.out.println("");
        car1.showCars(cars);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Selling  Vehicles");
        System.out.println("");
        car1.sellVehicles(vehicles, car1, cars);
        truck2.sellVehicles(vehicles, truck2, cars);
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("Available Cars after selling:");
        System.out.println("");

        car1.showCars(cars);

        
        
        
        
    }
    
    
}
