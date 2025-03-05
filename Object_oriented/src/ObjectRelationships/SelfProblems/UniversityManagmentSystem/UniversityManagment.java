package ObjectRelationships.SelfProblems.UniversityManagmentSystem;

import java.util.ArrayList;

//Course class
class Course {
 String courseName;
 private Professor professor;
 private ArrayList<Student> students;

 public Course(String courseName) {
     this.courseName = courseName;
     this.students = new ArrayList<>();
 }

 public void assignProfessor(Professor professor) {
     this.professor = professor;
     System.out.println(professor.getName() + " is assigned to " + courseName);
 }

 public void enrollStudent(Student student) {
     students.add(student);
     System.out.println(student.getName() + " enrolled in " + courseName);
 }

 public void showCourseDetails() {
     System.out.println("Course: " + courseName);
     System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
     System.out.println("Enrolled Students:");
     for (Student student : students) {
         System.out.println("- " + student.getName());
     }
 }
}

//Professor class
class Professor {
 private String name;

 public Professor(String name) {
     this.name = name;
 }

 public String getName() {
     return name;
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

 public void enrollCourse(Course course) {
     courses.add(course);
     course.enrollStudent(this);
 }

 public void showEnrolledCourses() {
     System.out.println(name + " is enrolled in:");
     for (Course course : courses) {
         System.out.println("- " + course.courseName);
     }
 }
}

public class UniversityManagment {
 public static void main(String[] args) {
     // Creating courses
     Course math = new Course("Mathematics");
     Course cs = new Course("Computer Science");
     
     // Creating professors
     Professor profJohn = new Professor("Dr. John");
     Professor profEmma = new Professor("Dr. Emma");
     
     // Assigning professors to courses
     math.assignProfessor(profJohn);
     cs.assignProfessor(profEmma);
     
     // Creating students
     Student alice = new Student("Ayush");
     Student bob = new Student("manan");
     
     // Enrolling students in courses
     alice.enrollCourse(math);
     bob.enrollCourse(cs);
     bob.enrollCourse(math);
     
     // Displaying details
     math.showCourseDetails();
     cs.showCourseDetails();
     alice.showEnrolledCourses();
     bob.showEnrolledCourses();
 }
}

