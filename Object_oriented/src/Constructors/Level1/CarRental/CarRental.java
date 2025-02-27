package Constructors.Level1.CarRental;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 50.0; // Default daily rental rate
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Creating rental objects
        CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5, 60.0);
        CarRental rental2 = new CarRental();
        CarRental rental3 = new CarRental(rental1);
        
        // Displaying rental details
        System.out.println("Rental 1 Details:");
        rental1.displayRentalDetails();
        
        System.out.println("\nRental 2 Details:");
        rental2.displayRentalDetails();
        
        System.out.println("\nRental 3 (Copy of Rental 1) Details:");
        rental3.displayRentalDetails();
    }
}
