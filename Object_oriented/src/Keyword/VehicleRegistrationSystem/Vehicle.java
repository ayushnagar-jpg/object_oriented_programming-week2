package Keyword.VehicleRegistrationSystem;

class Vehicle {
    // Static variable shared across all vehicles
    private static double registrationFee = 5000.0; // Default registration fee
    
    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Unique identifier, cannot be changed
    
    // Constructor using 'this' to resolve ambiguity
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    
    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    // Method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Using instanceof for safe type-checking
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
    
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Ayush", "Car", "ABC1234");
        Vehicle vehicle2 = new Vehicle("Ashu", "Motorcycle", "XYZ5678");
        
        // Display vehicle details before updating registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        
        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(5500.0);
        
        System.out.println("\nAfter updating registration fee:");
        
        // Display vehicle details after updating registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

