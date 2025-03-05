package Inheritance.HierarchicalLevel.SchoolingSystem;

//Superclass: Person
class Person {
 String name;
 int age;
 
 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
 
 // Method to display person details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Subclass: Teacher (inherits from Person)
class Teacher extends Person {
 String subject;
 
 // Constructor
 public Teacher(String name, int age, String subject) {
     super(name, age);
     this.subject = subject;
 }
 
 // Overriding displayDetails method
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Role: Teacher");
     System.out.println("Subject: " + subject);
 }
}

//Subclass: Student (inherits from Person)
class Student extends Person {
 int grade;
 
 // Constructor
 public Student(String name, int age, int grade) {
     super(name, age);
     this.grade = grade;
 }
 
 // Overriding displayDetails method
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Role: Student");
     System.out.println("Grade: " + grade);
 }
}

//Subclass: Staff (inherits from Person)
class Staff extends Person {
 String department;
 
 // Constructor
 public Staff(String name, int age, String department) {
     super(name, age);
     this.department = department;
 }
 
 // Overriding displayDetails method
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Role: Staff");
     System.out.println("Department: " + department);
 }
}

//Main class to demonstrate hierarchical inheritance
public class SchoolSystem {
 public static void main(String[] args) {
     Teacher teacher = new Teacher("Ayush", 35, "Mathematics");
     Student student = new Student("Aman", 16, 10);
     Staff staff = new Staff("Ashu ", 40, "Administration");
     
     teacher.displayDetails();
     System.out.println();
     student.displayDetails();
     System.out.println();
     staff.displayDetails();
 }
}

