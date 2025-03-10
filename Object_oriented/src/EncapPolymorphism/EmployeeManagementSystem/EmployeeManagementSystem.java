package EncapPolymorphism.EmployeeManagementSystem;

import java.util.ArrayList;

//Abstract class Employee
abstract class Employee {
 private int employeeId;
 private String name;
 protected double baseSalary;

 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }
 
 public abstract double calculateSalary();
 
 public void displayDetails() {
     System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
 }
}

//Interface Department
interface Department {
 void assignDepartment(String department);
 String getDepartmentDetails();
}

//FullTimeEmployee subclass
class FullTimeEmployee extends Employee implements Department {
 private String department;
 
 public FullTimeEmployee(int employeeId, String name, double baseSalary) {
     super(employeeId, name, baseSalary);
 }
 
 @Override
 public double calculateSalary() {
     return baseSalary; // Fixed salary for full-time employees
 }
 
 @Override
 public void assignDepartment(String department) {
     this.department = department;
 }
 
 @Override
 public String getDepartmentDetails() {
     return "Department: " + department;
 }
}

//PartTimeEmployee subclass
class PartTimeEmployee extends Employee implements Department {
 private int workHours;
 private double hourlyRate;
 private String department;
 
 public PartTimeEmployee(int employeeId, String name, double hourlyRate, int workHours) {
     super(employeeId, name, 0); // Base salary is 0 for part-time employees
     this.hourlyRate = hourlyRate;
     this.workHours = workHours;
 }
 
 @Override
 public double calculateSalary() {
     return workHours * hourlyRate;
 }
 
 @Override
 public void assignDepartment(String department) {
     this.department = department;
 }
 
 @Override
 public String getDepartmentDetails() {
     return "Department: " + department;
 }
}

//Main class to test functionality
public class EmployeeManagementSystem {
 public static void main(String[] args) {
     ArrayList<Employee> employees = new ArrayList<>();
     
     FullTimeEmployee fte = new FullTimeEmployee(101, "AYUSH", 50000);
     fte.assignDepartment("IT");
     
     PartTimeEmployee pte = new PartTimeEmployee(102, "ARYAN", 500, 40);
     pte.assignDepartment("Support");
     
     employees.add(fte);
     employees.add(pte);
     
     // Display employee details using polymorphism
     for (Employee emp : employees) {
         emp.displayDetails();
         if (emp instanceof Department) {
             System.out.println(((Department) emp).getDepartmentDetails());
         }
     }
 }
}

