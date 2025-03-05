package Keyword.ShoppingCartSystem;

class Product {
    // Static variable shared across all products
    private static double discount = 10.0; // Default discount in percentage
    
    // Instance variables
    private String productName;
    private final int productID; // Unique identifier, cannot be changed
    private double price;
    private int quantity;
    
    // Constructor using 'this' to resolve ambiguity
    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    
    // Method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) { // Using instanceof for safe type-checking
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }
    
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 101, 1200.0, 2);
        Product prod2 = new Product("Smartphone", 102, 800.0, 3);
        
        // Display product details before updating discount
        prod1.displayProductDetails();
        prod2.displayProductDetails();
        
        // Update discount for all products
        Product.updateDiscount(15.0);
        
        System.out.println("\nAfter updating discount:");
        
        // Display product details after updating discount
        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}
