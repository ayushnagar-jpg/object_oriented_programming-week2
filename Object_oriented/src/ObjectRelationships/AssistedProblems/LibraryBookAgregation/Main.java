package ObjectRelationships.AssistedProblems.LibraryBookAgregation;

import java.util.ArrayList;

//Book class
class Book {
 private String title;
 private String author;
 
 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }
 
 public String getTitle() {
     return title;
 }
 
 public String getAuthor() {
     return author;
 }
 
 public void displayBookDetails() {
     System.out.println("Title: " + title + ", Author: " + author);
 }
}

//Library class (Aggregation with Book)
class Library {
 private String name;
 private ArrayList<Book> books;
 
 public Library(String name) {
     this.name = name;
     this.books = new ArrayList<>();
 }
 
 public void addBook(Book book) {
     books.add(book);
 }
 
 public void displayLibraryBooks() {
     System.out.println("Library: " + name);
     for (Book book : books) {
         book.displayBookDetails();
     }
 }
}
 public class Main{
 public static void main(String[] args) {
     // Creating books
     Book book1 = new Book("T", "F. Scott Fitzgerald");
     Book book2 = new Book("1984", "George Orwell");
     Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
     
     // Creating libraries
     Library library1 = new Library("City Library");
     Library library2 = new Library("University Library");
     
     // Adding books to libraries
     library1.addBook(book1);
     library1.addBook(book2);
     
     library2.addBook(book2);
     library2.addBook(book3);
     
     // Displaying books in each library
     library1.displayLibraryBooks();
     library2.displayLibraryBooks();
 }
}

