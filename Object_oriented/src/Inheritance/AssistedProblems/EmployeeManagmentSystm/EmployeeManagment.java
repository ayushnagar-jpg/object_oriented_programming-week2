package Inheritance.AssistedProblems.EmployeeManagmentSystm;

//Superclass: Employee
class Employee {
 protected String name;
 protected int id;
 protected double salary;

 public Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 public void displayDetails() {
     System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
 }
}

//Subclass: Manager
class Manager extends Employee {
 private int teamSize;

 public Manager(String name, int id, double salary, int teamSize) {
     super(name, id, salary);
     this.teamSize = teamSize;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Team Size: " + teamSize);
 }
}

//Subclass: Developer
class Developer extends Employee {
 private String programmingLanguage;

 public Developer(String name, int id, double salary, String programmingLanguage) {
     super(name, id, salary);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}

//Subclass: Intern
class Intern extends Employee {
 private int duration;

 public Intern(String name, int id, double salary, int duration) {
     super(name, id, salary);
     this.duration = duration;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Internship Duration: " + duration + " months");
 }
}

//Main class to test the Employee hierarchy
public class EmployeeManagment {
 public static void main(String[] args) {
     Employee manager = new Manager("Ayush", 101, 75000, 5);
     Employee developer = new Developer("Ashu", 102, 65000, "Java");
     Employee intern = new Intern("Aman", 103, 20000, 6);
     
     manager.displayDetails();
     System.out.println();
     developer.displayDetails();
     System.out.println();
     intern.displayDetails();
 }
}
