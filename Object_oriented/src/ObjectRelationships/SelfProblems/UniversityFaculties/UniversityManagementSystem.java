package ObjectRelationships.SelfProblems.UniversityFaculties;

import java.util.ArrayList;

//Faculty class (Aggregation: Faculty can exist independently of any department)
class Faculty {
 private String name;

 public Faculty(String name) {
     this.name = name;
 }

 public String getName() {
     return name;
 }
}

//Department class (Composition: Departments exist within a University)
class Department {
 private String departmentName;

 public Department(String departmentName) {
     this.departmentName = departmentName;
 }

 public String getDepartmentName() {
     return departmentName;
 }
}

//University class (Composition: University owns Departments)
class University {
 private String universityName;
 private ArrayList<Department> departments;
 private ArrayList<Faculty> faculties;

 public University(String universityName) {
     this.universityName = universityName;
     this.departments = new ArrayList<>();
     this.faculties = new ArrayList<>();
 }

 public void addDepartment(String departmentName) {
     departments.add(new Department(departmentName));
 }

 public void addFaculty(Faculty faculty) {
     faculties.add(faculty);
 }

 public void displayDetails() {
     System.out.println("University: " + universityName);
     System.out.println("Departments:");
     for (Department dept : departments) {
         System.out.println("- " + dept.getDepartmentName());
     }
     System.out.println("Faculty Members:");
     for (Faculty faculty : faculties) {
         System.out.println("- " + faculty.getName());
     }
 }

 public void closeUniversity() {
     System.out.println("Closing University: " + universityName);
     departments.clear(); // Deleting all departments (Composition)
     faculties.clear(); // Faculties exist independently (Aggregation, but removed for cleanup)
 }
}

public class UniversityManagementSystem {
 public static void main(String[] args) {
     // Creating a university
     University university = new University("Chitkara University");

     // Adding departments (Composition)
     university.addDepartment("Computer Science");
     university.addDepartment("Mechanical Engineering");

     // Creating faculty members (Aggregation: Can exist independently)
     Faculty faculty1 = new Faculty("Dr. Darpan");
     Faculty faculty2 = new Faculty("Dr. Madhu");
     
     // Adding faculty members to the university
     university.addFaculty(faculty1);
     university.addFaculty(faculty2);

     // Display university details
     university.displayDetails();

     // Closing university (Composition: Removes all departments)
     university.closeUniversity();
 }
}

