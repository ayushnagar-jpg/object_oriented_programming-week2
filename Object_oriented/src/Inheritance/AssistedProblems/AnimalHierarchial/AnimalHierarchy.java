package Inheritance.AssistedProblems.AnimalHierarchial;

//Superclass: Animal
class Animal {
 protected String name;
 protected int age;

 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Subclass: Dog
class Dog extends Animal {
 public Dog(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " barks: Woof Woof!");
 }
}

//Subclass: Cat
class Cat extends Animal {
 public Cat(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " meows: Meow Meow!");
 }
}

//Subclass: Bird
class Bird extends Animal {
 public Bird(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " chirps: Tweet Tweet!");
 }
}

//Main class to test the hierarchy
public class AnimalHierarchy {
 public static void main(String[] args) {
     Animal myDog = new Dog("Buddy", 3);
     Animal myCat = new Cat("Whiskers", 2);
     Animal myBird = new Bird("Tweety", 1);
     
     myDog.makeSound();
     myCat.makeSound();
     myBird.makeSound();
 }
}

