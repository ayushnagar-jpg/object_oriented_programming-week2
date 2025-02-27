package Constructors.AccessModifier.UniversityManagmentSytm;

public class Main{
	 public static void main(String[] args) {
	     // Creating a Student object
	     Student student1 = new Student(101, "Alice", 8.5);
	     student1.displayStudentDetails();

	     // Modifying CGPA using setter method
	     student1.setCGPA(9.2);
	     System.out.println("Updated CGPA: " + student1.getCGPA());
	     System.out.println("----------------------");

	     // Creating a PostgraduateStudent object
	     PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 8.9, "Machine Learning");
	     pgStudent.displayPostgraduateDetails();
	 }
}