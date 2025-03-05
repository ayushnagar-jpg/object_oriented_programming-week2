package Inheritance.MultiLevel.EducationalCourseHierarchy;

//Superclass: Course
class Course {
 String courseName;
 int duration; // in weeks
 
 // Constructor
 public Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }
 
 // Method to display course details
 public void displayDetails() {
     System.out.println("Course Name: " + courseName);
     System.out.println("Duration: " + duration + " weeks");
 }
}

//Subclass: OnlineCourse (inherits from Course)
class OnlineCourse extends Course {
 String platform;
 boolean isRecorded;
 
 // Constructor
 public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }
 
 // Overriding displayDetails method
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Platform: " + platform);
     System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
 }
}

//Subclass: PaidOnlineCourse (inherits from OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
 double fee;
 double discount;
 
 // Constructor
 public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }
 
 // Overriding displayDetails method
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Fee: $" + fee);
     System.out.println("Discount: " + discount + "%");
 }
}

//Main class to demonstrate multilevel inheritance
public class EducationalCourseSystem {
 public static void main(String[] args) {
     PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 6, "Udemy", true, 100.0, 20.0);
     paidCourse.displayDetails();
 }
}

