package classes_fundamental.level2.StudentReport;


class Student {
 String name;
 int rollNumber;
 double marks;


 Student(String name, int rollNumber, double marks) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.marks = marks;
 }


 String calculateGrade() {
     if (marks >= 90) {
         return "A";
     } else if (marks >= 80) {
         return "B";
     } else if (marks >= 70) {
         return "C";
     } else if (marks >= 60) {
         return "D";
     } else {
         return "F";
     }
 }


 void displayDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Marks: " + marks);
     System.out.println("Grade: " + calculateGrade());
 }
}




