package Constructors.Level1.Person;

public class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a person object
        Person originalPerson = new Person("John Doe", 25);
        
        // Cloning using copy constructor
        Person clonedPerson = new Person(originalPerson);
        
        // Displaying details
        System.out.println("Original Person:");
        originalPerson.displayPersonDetails();
        
        System.out.println("\nCloned Person:");
        clonedPerson.displayPersonDetails();
    }
}

