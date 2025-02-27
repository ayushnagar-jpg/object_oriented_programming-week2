package Constructors.Level1.Circle;

public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Creating circle objects
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);
        
        // Displaying circle details
        System.out.println("Default Circle Radius: " + defaultCircle.getRadius());
        System.out.println("Default Circle Area: " + defaultCircle.getArea());
        System.out.println("Default Circle Circumference: " + defaultCircle.getCircumference());

        System.out.println("\nCustom Circle Radius: " + customCircle.getRadius());
        System.out.println("Custom Circle Area: " + customCircle.getArea());
        System.out.println("Custom Circle Circumference: " + customCircle.getCircumference());
    }
}

