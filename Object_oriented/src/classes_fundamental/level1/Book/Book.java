package classes_fundamental.level1.Book;

public class Book {
   String title;
   String author;
   double price;


 Book(String title,String author,double price){
	this.title = title;
	this.author = author;
	this.price = price;
}
 
 void display() {
	 System.out.println(title);
	 System.out.println(author);
	 System.out.println(price);
 }

}