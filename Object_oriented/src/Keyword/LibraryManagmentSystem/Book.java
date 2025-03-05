package Keyword.LibraryManagmentSystem;

class Book {
    // Static variable shared across all books
    private static String libraryName = "City Library";
    
    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Unique identifier, cannot be changed
    
    // Constructor using 'this' to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    
    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) { // Using instanceof for safe type-checking
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");
        
        // Display library name
        Book.displayLibraryName();
        
        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
