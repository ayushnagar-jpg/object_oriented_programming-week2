package Keyword.EmployeeManagmentSystem;

class Employee {
    // Static variable shared across all employees
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    
    // Instance variables
    private String name;
    private final int id; // Unique identifier, cannot be changed
    private String designation;
    
    // Constructor using 'this' to resolve ambiguity
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employees count
    }
    
    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Using instanceof for safe type-checking
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ayush", 101, "Software Engineer");
        Employee emp2 = new Employee("Ashu", 102, "Project Manager");
        
        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        
        // Display total number of employees
        Employee.displayTotalEmployees();
    }
}
