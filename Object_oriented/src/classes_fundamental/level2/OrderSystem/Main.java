package classes_fundamental.level2.OrderSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();

        while (true) {
            System.out.println("\n Order Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Order Summary");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter unit price: ");
                    double unitPrice = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantityOrdered = scanner.nextInt();
                    orderManager.addProduct(productName, unitPrice, quantityOrdered);
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeProductName = scanner.nextLine();
                    orderManager.removeProduct(removeProductName);
                    break;

                case 3:
                    orderManager.displayTotalOrderCost();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using Order Manager!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

