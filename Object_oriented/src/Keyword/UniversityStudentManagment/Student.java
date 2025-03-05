package Keyword.UniversityStudentManagment;

class Student {
    // Static variable shared across all students
    private static String universityName = "Chitkara University";
    private static int totalStudents = 0;
    
    // Instance variables
    private String name;
    private final int rollNumber; // Unique identifier, cannot be changed
    private char grade;
    
    // Constructor using 'this' to resolve ambiguity
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students count
    }
    
    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    
    // Method to update grade
    public void updateGrade(char newGrade) {
        if (this instanceof Student) { // Using instanceof for safe type-checking
            this.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Invalid student object.");
        }
    }
    
    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) { // Using instanceof for safe type-checking
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }
    
    public static void main(String[] args) {
        Student student1 = new Student("Ayush", 101, 'A');
        Student student2 = new Student("Ashu", 102, 'B');
        
        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        
        // Update grade
        student2.updateGrade('A');
        
        // Display updated details
        student2.displayStudentDetails();
        
        // Display total students
        Student.displayTotalStudents();
    }
}
