package classes_fundamental.level2.OrderSystem;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Product> productList; // List to store products

    // Constructor
    public OrderManager() {
        productList = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(String productName, double unitPrice, int quantityOrdered) {
        productList.add(new Product(productName, unitPrice, quantityOrdered));
        System.out.println(quantityOrdered + " x " + productName + " added to the order.");
    }

    // Method to remove a product from the order
    public void removeProduct(String productName) {
        boolean removed = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).productName.equalsIgnoreCase(productName)) {
                productList.remove(i);
                removed = true;
                System.out.println(productName + " removed from the order.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Product not found in the order.");
        }
    }

    // Method to display total cost
    public void displayTotalOrderCost() {
        double totalCost = 0;
        System.out.println("\nOrder Summary:");
        for (Product product : productList) {
            System.out.println(product.quantityOrdered + " x " + product.productName + " = $" + product.calculateTotalPrice());
            totalCost += product.calculateTotalPrice();
        }
        System.out.println("Total Order Cost: $" + totalCost);
    }
}
