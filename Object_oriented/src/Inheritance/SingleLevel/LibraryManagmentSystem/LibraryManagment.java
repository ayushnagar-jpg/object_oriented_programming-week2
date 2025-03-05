package Inheritance.SingleLevel.LibraryManagmentSystem;

//Superclass: Book
class Book {
 String title;
 int publicationYear;
 
 // Constructor
 public Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }
 
 // Method to display book info
 public void displayInfo() {
     System.out.println("Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}

//Subclass: Author (inherits from Book)
class Author extends Book {
 String name;
 String bio;
 
 // Constructor
 public Author(String title, int publicationYear, String name, String bio) {
     super(title, publicationYear);
     this.name = name;
     this.bio = bio;
 }
 
 // Overriding displayInfo method
 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Author: " + name);
     System.out.println("Bio: " + bio);
 }
}

//Main class to demonstrate inheritance
public class LibraryManagment {
 public static void main(String[] args) {
     Author author = new Author("Effective Java", 2018, "Joshua Bloch", "Expert in Java programming.");
     author.displayInfo();
 }
}

