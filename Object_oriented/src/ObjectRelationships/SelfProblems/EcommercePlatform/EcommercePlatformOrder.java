package ObjectRelationships.SelfProblems.EcommercePlatform;

import java.util.ArrayList;

//Product class
class Product {
 private String name;
 private double price;

 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }
}

//Order class
class Order {
 private static int orderCounter = 0;
 private int orderId;
 private ArrayList<Product> products;
 private Customer customer;

 public Order(Customer customer) {
     this.customer = customer;
     this.products = new ArrayList<>();
     this.orderId = ++orderCounter;
 }

 public void addProduct(Product product) {
     products.add(product);
 }

 public void showOrderDetails() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Customer: " + customer.getName());
     System.out.println("Products:");
     for (Product product : products) {
         System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
     }
 }
}

//Customer class
class Customer {
 private String name;
 private ArrayList<Order> orders;

 public Customer(String name) {
     this.name = name;
     this.orders = new ArrayList<>();
 }

 public String getName() {
     return name;
 }

 public void placeOrder(Order order) {
     orders.add(order);
     System.out.println(name + " placed an order.");
 }

 public void showOrders() {
     System.out.println(name + "'s Orders:");
     for (Order order : orders) {
         order.showOrderDetails();
     }
 }
}

public class EcommercePlatformOrder {
 public static void main(String[] args) {
     // Creating products
     Product p1 = new Product("Laptop", 1200.50);
     Product p2 = new Product("Smartphone", 800.75);
     Product p3 = new Product("Headphones", 150.25);
     
     // Creating customers
     Customer customer1 = new Customer("Ayush Nagar");
     Customer customer2 = new Customer("Ashu Singh");
     
     // Creating and placing orders
     Order order1 = new Order(customer1);
     order1.addProduct(p1);
     order1.addProduct(p3);
     customer1.placeOrder(order1);
     
     Order order2 = new Order(customer2);
     order2.addProduct(p2);
     customer2.placeOrder(order2);
     
     // Display order details
     customer1.showOrders();
     customer2.showOrders();
 }
}

