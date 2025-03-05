package ObjectRelationships.SelfProblems.StudentCourses;

import java.util.ArrayList;

//Course class
class Course {
 private String courseName;
 private ArrayList<Student> enrolledStudents;

 public Course(String courseName) {
     this.courseName = courseName;
     this.enrolledStudents = new ArrayList<>();
 }

 public String getCourseName() {
     return courseName;
 }

 public void enrollStudent(Student student) {
     enrolledStudents.add(student);
 }

 public void displayEnrolledStudents() {
     System.out.println("Course: " + courseName + " | Enrolled Students:");
     for (Student student : enrolledStudents) {
         System.out.println("- " + student.getName());
     }
 }
}

//Student class
class Student {
 private String name;
 private ArrayList<Course> courses;

 public Student(String name) {
     this.name = name;
     this.courses = new ArrayList<>();
 }

 public String getName() {
     return name;
 }

 public void enrollInCourse(Course course) {
     courses.add(course);
     course.enrollStudent(this);
 }

 public void displayEnrolledCourses() {
     System.out.println("Student: " + name + " | Enrolled Courses:");
     for (Course course : courses) {
         System.out.println("- " + course.getCourseName());
     }
 }
}

//School class (Aggregation with Students)
class School {
 private String schoolName;
 private ArrayList<Student> students;

 public School(String schoolName) {
     this.schoolName = schoolName;
     this.students = new ArrayList<>();
 }

 public void addStudent(Student student) {
     students.add(student);
 }

 public void displayStudents() {
     System.out.println("School: " + schoolName + " | Students:");
     for (Student student : students) {
         System.out.println("- " + student.getName());
     }
 }
}

public class SchoolManagementSystem {
 public static void main(String[] args) {
     // Creating a school
     School school = new School("Greenwood High");

     // Creating students
     Student student1 = new Student("Ayush");
     Student student2 = new Student("harshit");

     // Adding students to school
     school.addStudent(student1);
     school.addStudent(student2);

     // Creating courses
     Course math = new Course("Mathematics");
     Course science = new Course("Science");

     // Enrolling students in courses
     student1.enrollInCourse(math);
     student1.enrollInCourse(science);
     student2.enrollInCourse(math);

     // Display school students
     school.displayStudents();

     // Display student courses
     student1.displayEnrolledCourses();
     student2.displayEnrolledCourses();

     // Display enrolled students in courses
     math.displayEnrolledStudents();
     science.displayEnrolledStudents();
 }
}

