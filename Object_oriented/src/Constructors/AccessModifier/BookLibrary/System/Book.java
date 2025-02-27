package Constructors.AccessModifier.BookLibrary.System;

//Parent class: Book
class Book {
 // Public variable (accessible everywhere)
 public String ISBN;

 // Protected variable (accessible in subclasses)
 protected String title;

 // Private variable (only accessible within this class)
 private String author;

 // Constructor
 public Book(String ISBN, String title, String author) {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }

 // Public getter for author
 public String getAuthor() {
     return author;
 }

 // Public setter for author
 public void setAuthor(String author) {
     this.author = author;
 }

 // Method to display book details
 public void displayBookDetails() {
     System.out.println("ISBN: " + ISBN);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("----------------------");
 }
}

//Subclass: EBook (inherits from Book)
class EBook extends Book {
 private double fileSize; // File size in MB

 // Constructor
 public EBook(String ISBN, String title, String author, double fileSize) {
     super(ISBN, title, author);
     this.fileSize = fileSize;
 }

 // Method to display EBook details
 public void displayEBookDetails() {
     System.out.println("E-Book Details:");
     System.out.println("ISBN: " + ISBN); // Public variable (accessible)
     System.out.println("Title: " + title); // Protected variable (accessible in subclass)
     System.out.println("Author: " + getAuthor()); // Accessing private author via public getter
     System.out.println("File Size: " + fileSize + " MB");
     System.out.println("----------------------");
 }
}


