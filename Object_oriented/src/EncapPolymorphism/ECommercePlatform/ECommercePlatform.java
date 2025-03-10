package EncapPolymorphism.ECommercePlatform;

import java.util.ArrayList;

//Abstract class Product
abstract class Product {
 private int productId;
 private String name;
 protected double price;
 
 public Product(int productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }
 
 public abstract double calculateDiscount();
 
 public void displayDetails() {
     System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
 }
 
 public double getPrice() {
     return price;
 }
}

//Interface Taxable
interface Taxable {
 double calculateTax();
 String getTaxDetails();
}

//Electronics class
class Electronics extends Product implements Taxable {
 public Electronics(int productId, String name, double price) {
     super(productId, name, price);
 }
 
 @Override
 public double calculateDiscount() {
     return price * 0.10; // 10% discount
 }
 
 @Override
 public double calculateTax() {
     return price * 0.18; // 18% GST
 }
 
 @Override
 public String getTaxDetails() {
     return "GST: 18%";
 }
}

//Clothing class
class Clothing extends Product implements Taxable {
 public Clothing(int productId, String name, double price) {
     super(productId, name, price);
 }
 
 @Override
 public double calculateDiscount() {
     return price * 0.15; // 15% discount
 }
 
 @Override
 public double calculateTax() {
     return price * 0.05; // 5% GST
 }
 
 @Override
 public String getTaxDetails() {
     return "GST: 5%";
 }
}

//Groceries class
class Groceries extends Product {
 public Groceries(int productId, String name, double price) {
     super(productId, name, price);
 }
 
 @Override
 public double calculateDiscount() {
     return price * 0.05; // 5% discount
 }
}

//Main class to test functionality
public class ECommercePlatform {
 public static void main(String[] args) {
     ArrayList<Product> products = new ArrayList<>();
     
     products.add(new Electronics(101, "Laptop", 60000));
     products.add(new Clothing(102, "Jacket", 3000));
     products.add(new Groceries(103, "Rice", 200));
     
     // Display product details and final price calculation using polymorphism
     for (Product product : products) {
         product.displayDetails();
         double discount = product.calculateDiscount();
         double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
         double finalPrice = product.getPrice() + tax - discount;
         System.out.println("Final Price: " + finalPrice);
         if (product instanceof Taxable) {
             System.out.println(((Taxable) product).getTaxDetails());
         }
         System.out.println("----------------------");
     }
 }
}

