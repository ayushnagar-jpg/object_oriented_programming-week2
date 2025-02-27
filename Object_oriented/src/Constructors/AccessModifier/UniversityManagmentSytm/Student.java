package Constructors.AccessModifier.UniversityManagmentSytm;

//Parent class: Student
class Student {
 // Public variable
 public int rollNumber;

 // Protected variable (accessible in subclasses)
 protected String name;

 // Private variable (can only be accessed via methods)
 private double CGPA;

 // Constructor
 public Student(int rollNumber, String name, double CGPA) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.CGPA = CGPA;
 }

 // Public getter method for CGPA
 public double getCGPA() {
     return CGPA;
 }

 // Public setter method for CGPA
 public void setCGPA(double CGPA) {
     if (CGPA >= 0.0 && CGPA <= 10.0) {
         this.CGPA = CGPA;
     } else {
         System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
     }
 }

 // Method to display student details
 public void displayStudentDetails() {
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Name: " + name);
     System.out.println("CGPA: " + CGPA);
     System.out.println("----------------------");
 }
}

//Subclass: PostgraduateStudent (inherits from Student)
class PostgraduateStudent extends Student {
 private String specialization;

 // Constructor
 public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
     super(rollNumber, name, CGPA);
     this.specialization = specialization;
 }

 // Method to display Postgraduate student details
 public void displayPostgraduateDetails() {
     System.out.println("Postgraduate Student Details:");
     System.out.println("Roll Number: " + rollNumber); // Public variable (accessible)
     System.out.println("Name: " + name); // Protected variable (accessible in subclass)
     System.out.println("CGPA: " + getCGPA()); // Accessed via public getter method
     System.out.println("Specialization: " + specialization);
     System.out.println("----------------------");
 }
}



