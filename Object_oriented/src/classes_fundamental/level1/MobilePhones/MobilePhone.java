package classes_fundamental.level1.MobilePhones;

class MobilePhone {
    
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}