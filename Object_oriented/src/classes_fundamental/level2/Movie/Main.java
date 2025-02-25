package classes_fundamental.level2.Movie;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	 
	        MovieTicket ticket = new MovieTicket("Inception", 12.50);

	 
	        System.out.print("Enter seat number to book: ");
	        int seatNumber = scanner.nextInt();
	        ticket.bookTicket(seatNumber);

	        
	        ticket.displayTicket();

	        scanner.close();
	    }
}
