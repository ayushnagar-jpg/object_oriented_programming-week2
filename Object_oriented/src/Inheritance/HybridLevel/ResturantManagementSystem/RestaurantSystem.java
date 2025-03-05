package Inheritance.HybridLevel.ResturantManagementSystem;

//Superclass: Person
class Person {
 String name;
 int id;

 // Constructor
 public Person(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Method to display person details
 public void displayDetails() {
     System.out.println("ID: " + id + ", Name: " + name);
 }
}

//Interface: Worker
interface Worker {
 void performDuties();
}

//Subclass: Chef (inherits from Person and implements Worker)
class Chef extends Person implements Worker {
 String specialty;

 // Constructor
 public Chef(String name, int id, String specialty) {
     super(name, id);
     this.specialty = specialty;
 }

 // Implement performDuties method
 @Override
 public void performDuties() {
     System.out.println(name + " is cooking " + specialty + " dishes.");
 }
}

//Subclass: Waiter (inherits from Person and implements Worker)
class Waiter extends Person implements Worker {
 int tablesAssigned;

 // Constructor
 public Waiter(String name, int id, int tablesAssigned) {
     super(name, id);
     this.tablesAssigned = tablesAssigned;
 }

 // Implement performDuties method
 @Override
 public void performDuties() {
     System.out.println(name + " is serving " + tablesAssigned + " tables.");
 }
}

//Main class to demonstrate hybrid inheritance
public class RestaurantSystem {
 public static void main(String[] args) {
     Chef chef = new Chef("AShu", 101, "Italian");
     Waiter waiter = new Waiter("Aman", 202, 5);
     
     chef.displayDetails();
     chef.performDuties();
     
     System.out.println();
     
     waiter.displayDetails();
     waiter.performDuties();
 }
}

