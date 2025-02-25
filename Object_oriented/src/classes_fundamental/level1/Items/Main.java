package classes_fundamental.level1.Items;

public class Main {
	
	public static void main(String[]args) {
    
		  Item item = new Item(101, "Wireless Mouse", 25.50);

	      
	        item.displayDetail();

	        int quantity = 3;
	        System.out.println("Total Cost for " + quantity + " items: $" + item.calculateTotalCost(quantity));
}
}