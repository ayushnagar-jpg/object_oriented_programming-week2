package Constructors.AccessModifier.BookLibrary.System;

//Main class to test the implementation
public class Main {
public static void main(String[] args) {
   // Creating a Book object
   Book book1 = new Book("978-3-16-148410-0", "Java Programming", "James Gosling");
   book1.displayBookDetails();

   // Modifying author using setter
   book1.setAuthor("Joshua Bloch");
   System.out.println("Updated Author: " + book1.getAuthor());
   System.out.println("----------------------");

   // Creating an EBook object
   EBook ebook1 = new EBook("978-0-321-35668-0", "Effective Java", "Joshua Bloch", 2.5);
   ebook1.displayEBookDetails();
}
}