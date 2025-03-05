package Inheritance.SingleLevel.SmartHomeDevices;

//Superclass: Device
class Device {
 String deviceId;
 String status;
 
 // Constructor
 public Device(String deviceId, String status) {
     this.deviceId = deviceId;
     this.status = status;
 }
 
 // Method to display device status
 public void displayStatus() {
     System.out.println("Device ID: " + deviceId);
     System.out.println("Status: " + status);
 }
}

//Subclass: Thermostat (inherits from Device)
class Thermostat extends Device {
 int temperatureSetting;
 
 // Constructor
 public Thermostat(String deviceId, String status, int temperatureSetting) {
     super(deviceId, status);
     this.temperatureSetting = temperatureSetting;
 }
 
 // Overriding displayStatus method
 @Override
 public void displayStatus() {
     super.displayStatus();
     System.out.println("Temperature Setting: " + temperatureSetting + "°C");
 }
}

//Main class to demonstrate inheritance
public class SmartHomeSystem {
 public static void main(String[] args) {
     Thermostat thermostat = new Thermostat("TH123", "Active", 22);
     thermostat.displayStatus();
 }
}

