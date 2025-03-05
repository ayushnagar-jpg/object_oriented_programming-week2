package Inheritance.HybridLevel.VehicleManagementSystem;

//Superclass: Vehicle
class Vehicle {
 String model;
 int maxSpeed;

 // Constructor
 public Vehicle(String model, int maxSpeed) {
     this.model = model;
     this.maxSpeed = maxSpeed;
 }

 // Method to display vehicle details
 public void displayInfo() {
     System.out.println("Model: " + model);
     System.out.println("Max Speed: " + maxSpeed + " km/h");
 }
}

//Interface: Refuelable
interface Refuelable {
 void refuel();
}

//Subclass: ElectricVehicle (inherits from Vehicle)
class ElectricVehicle extends Vehicle {
 int batteryCapacity;

 // Constructor
 public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
     super(model, maxSpeed);
     this.batteryCapacity = batteryCapacity;
 }

 // Method to charge the EV
 public void charge() {
     System.out.println(model + " is charging... Battery Capacity: " + batteryCapacity + " kWh");
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
 }
}

//Subclass: PetrolVehicle (inherits from Vehicle and implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
 int fuelCapacity;

 // Constructor
 public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
     super(model, maxSpeed);
     this.fuelCapacity = fuelCapacity;
 }

 // Overriding refuel method from Refuelable interface
 @Override
 public void refuel() {
     System.out.println(model + " is refueling... Fuel Capacity: " + fuelCapacity + " liters");
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
 }
}

//Main class to demonstrate hybrid inheritance
public class VehicleManagementSystem {
 public static void main(String[] args) {
     ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 200, 75);
     PetrolVehicle ford = new PetrolVehicle("Ford Mustang", 250, 50);

     System.out.println("Electric Vehicle Details:");
     tesla.displayInfo();
     tesla.charge();

     System.out.println("\nPetrol Vehicle Details:");
     ford.displayInfo();
     ford.refuel();
 }
}

