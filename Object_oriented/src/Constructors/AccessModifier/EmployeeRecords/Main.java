package Constructors.AccessModifier.EmployeeRecords;

public class Main{
	 public static void main(String[] args) {
	     // Creating an Employee object
	     Employee emp1 = new Employee(101, "IT", 50000.00);
	     emp1.displayEmployeeDetails();

	     // Modifying salary using setter
	     emp1.setSalary(55000.00);
	     System.out.println("Updated Salary: $" + emp1.getSalary());
	     System.out.println("----------------------");

	     // Creating a Manager object
	     Manager manager1 = new Manager(201, "HR", 75000.00, "Recruitment Team");
	     manager1.displayManagerDetails();
	 }
	}