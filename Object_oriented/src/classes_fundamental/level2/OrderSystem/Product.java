package classes_fundamental.level2.OrderSystem;

public class Product {
    String productName;
    double unitPrice;
    int quantityOrdered;

    // Constructor
    public Product(String productName, double unitPrice, int quantityOrdered) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantityOrdered = quantityOrdered;
    }

    // Method to calculate total price for this product
    public double calculateTotalPrice() {
        return unitPrice * quantityOrdered;
    }
}
