package classes_fundamental.level2.Movie;


class MovieTicket {
 String movieName;
 int seatNumber;
 double price;
 boolean isBooked;

 
 MovieTicket(String movieName, double price) {
     this.movieName = movieName;
     this.price = price;
     this.isBooked = false; 
 }

 
 void bookTicket(int seatNumber) {
     if (!isBooked) {
         this.seatNumber = seatNumber;
         this.isBooked = true;
         System.out.println("Ticket booked successfully!");
     } else {
         System.out.println("Sorry, this ticket is already booked.");
     }
 }


 void displayTicket() {
     if (isBooked) {
         System.out.println("\nMovie Ticket Details:");
         System.out.println("Movie Name: " + movieName);
         System.out.println("Seat Number: " + seatNumber);
         System.out.println("Price: $" + price);
     } else {
         System.out.println("No ticket booked yet.");
     }
 }
}




