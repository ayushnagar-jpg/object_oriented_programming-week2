package ObjectRelationships.AssistedProblems.CompanyDepartmentComposition;

import java.util.ArrayList;

//Employee class
class Employee {
 private String name;
 private String position;
 
 public Employee(String name, String position) {
     this.name = name;
     this.position = position;
 }
 
 public void displayEmployeeDetails() {
     System.out.println("Employee: " + name + ", Position: " + position);
 }
}

//Department class (Composition with Employee)
class Department {
 String departmentName;
 private ArrayList<Employee> employees;
 
 public Department(String departmentName) {
     this.departmentName = departmentName;
     this.employees = new ArrayList<>();
 }
 
 public void addEmployee(String name, String position) {
     employees.add(new Employee(name, position));
 }
 
 public void displayDepartmentDetails() {
     System.out.println("Department: " + departmentName);
     for (Employee employee : employees) {
         employee.displayEmployeeDetails();
     }
 }
}

//Company class (Composition with Department)
class Company {
 private String companyName;
 private ArrayList<Department> departments;
 
 public Company(String companyName) {
     this.companyName = companyName;
     this.departments = new ArrayList<>();
 }
 
 public void addDepartment(String departmentName) {
     departments.add(new Department(departmentName));
 }
 
 public Department getDepartment(String departmentName) {
     for (Department dept : departments) {
         if (dept.departmentName.equals(departmentName)) {
             return dept;
         }
     }
     return null;
 }
 
 public void displayCompanyDetails() {
     System.out.println("Company: " + companyName);
     for (Department dept : departments) {
         dept.displayDepartmentDetails();
     }
 }
}
 public class Main {
 
 public static void main(String[] args) {
     // Creating company
     Company company = new Company("TechCorp");
     
     // Adding departments
     company.addDepartment("IT");
     company.addDepartment("HR");
     
     // Adding employees to departments
     Department itDepartment = company.getDepartment("IT");
     if (itDepartment != null) {
         itDepartment.addEmployee("Ayush", "Software Engineer");
         itDepartment.addEmployee("Ashu", "System Analyst");
     }
     
     Department hrDepartment = company.getDepartment("HR");
     if (hrDepartment != null) {
         hrDepartment.addEmployee("Aman", "HR Manager");
     }
     
     // Display company details
     company.displayCompanyDetails();
 }
}
