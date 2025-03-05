package Inheritance.MultiLevel.RetailOrderManagement;

//Base class: Order
class Order {
 int orderId;
 String orderDate;
 
 // Constructor
 public Order(int orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }
 
 // Method to get order status
 public String getOrderStatus() {
     return "Order placed on " + orderDate;
 }
 
 // Display order details
 public void displayOrderDetails() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Order Date: " + orderDate);
     System.out.println("Status: " + getOrderStatus());
 }
}

//Subclass: ShippedOrder (inherits from Order)
class ShippedOrder extends Order {
 String trackingNumber;
 
 // Constructor
 public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }
 
 // Overriding getOrderStatus method
 @Override
 public String getOrderStatus() {
     return "Order shipped with tracking number: " + trackingNumber;
 }
}

//Subclass: DeliveredOrder (inherits from ShippedOrder)
class DeliveredOrder extends ShippedOrder {
 String deliveryDate;
 
 // Constructor
 public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }
 
 // Overriding getOrderStatus method
 @Override
 public String getOrderStatus() {
     return "Order delivered on " + deliveryDate;
 }
}

//Main class to demonstrate multilevel inheritance
public class OrderManagementSystem {
 public static void main(String[] args) {
     // Creating objects of different order types
     Order order = new Order(101, "2025-03-05");
     ShippedOrder shippedOrder = new ShippedOrder(102, "2025-03-04", "TRK12345");
     DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-03-02", "TRK67890", "2025-03-06");
     
     // Displaying order details
     System.out.println("--- Order Details ---");
     order.displayOrderDetails();
     
     System.out.println("\n--- Shipped Order Details ---");
     shippedOrder.displayOrderDetails();
     
     System.out.println("\n--- Delivered Order Details ---");
     deliveredOrder.displayOrderDetails();
 }
}

