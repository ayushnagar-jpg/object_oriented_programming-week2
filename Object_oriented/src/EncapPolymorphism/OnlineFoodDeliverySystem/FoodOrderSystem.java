package EncapPolymorphism.OnlineFoodDeliverySystem;

abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("10% discount applied on Veg items.");
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private final double additionalCharge = 20.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (price * quantity) + additionalCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("5% discount applied on Non-Veg items.");
    }
}

public class FoodOrderSystem {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price before discount: " + item.calculateTotalPrice());
        
        if (item instanceof Discountable) {
            Discountable discountItem = (Discountable) item;
            discountItem.getDiscountDetails();
            double discount = discountItem.applyDiscount();
            System.out.println("Discount Amount: " + discount);
            System.out.println("Final Price: " + (item.calculateTotalPrice() - discount));
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Tikka", 150, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 250, 1);
        
        processOrder(vegItem);
        processOrder(nonVegItem);
    }
}

