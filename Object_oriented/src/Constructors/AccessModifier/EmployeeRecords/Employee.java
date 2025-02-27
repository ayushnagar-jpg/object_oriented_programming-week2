package Constructors.AccessModifier.EmployeeRecords;

//Parent class: Employee
class Employee {
 // Public variable (accessible everywhere)
 public int employeeID;

 // Protected variable (accessible in subclasses)
 protected String department;

 // Private variable (only accessible via methods)
 private double salary;

 // Constructor
 public Employee(int employeeID, String department, double salary) {
     this.employeeID = employeeID;
     this.department = department;
     this.salary = salary;
 }

 // Public method to get the salary
 public double getSalary() {
     return salary;
 }

 // Public method to modify the salary
 public void setSalary(double salary) {
     if (salary > 0) {
         this.salary = salary;
         System.out.println("Salary updated to: $" + salary);
     } else {
         System.out.println("Invalid salary amount.");
     }
 }

 // Method to display employee details
 public void displayEmployeeDetails() {
     System.out.println("Employee ID: " + employeeID);
     System.out.println("Department: " + department);
     System.out.println("Salary: $" + salary);
     System.out.println("----------------------");
 }
}

//Subclass: Manager (inherits from Employee)
class Manager extends Employee {
 private String teamName; // Additional attribute for managers

 // Constructor
 public Manager(int employeeID, String department, double salary, String teamName) {
     super(employeeID, department, salary);
     this.teamName = teamName;
 }

 // Method to display Manager details
 public void displayManagerDetails() {
     System.out.println("Manager Details:");
     System.out.println("Employee ID: " + employeeID); // Public variable (accessible)
     System.out.println("Department: " + department); // Protected variable (accessible in subclass)
     System.out.println("Salary: $" + getSalary()); // Accessing private salary via public getter
     System.out.println("Team Name: " + teamName);
     System.out.println("----------------------");
 }
}


