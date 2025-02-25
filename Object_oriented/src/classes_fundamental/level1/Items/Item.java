package classes_fundamental.level1.Items;

public class Item {
	int ItemCode;
	String ItemName;
	double price;
	
	Item(int ItemCode,String ItemName,double price){
		this.ItemCode = ItemCode;
		this.ItemName = ItemName;
		this.price = price;
	}
	
	void displayDetail() {
		System.out.println(ItemCode);
		System.out.println(ItemName);
		System.out.println(price);
	}
	
	double calculateTotalCost(int quantity) {
		return quantity * price;
	}
	

}
