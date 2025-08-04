package Abstraction&Polymorphism;



// Method Overloading

/* 
   Method Overloading means having multiple methods with the same name but different 
   parameters (type, number, or order) in the same class.
*/

//Example of Method Overloading


class Calculator {

    // Method 1: adds two integers
    void add(int a, int b) {
        System.out.println("Sum of ints: " + (a + b));
    }

    // Method 2: adds two doubles
    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    // Method 3: adds three integers
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 ints: " + (a + b + c));
    }
}


// Super Keyword

/*
   The super keyword refers to the parent (super) class of the current object.
   It is used inside a child class to access things from the parent class.
*/

// Uses of super


/*
   1. Access parent class variables

   2. Call parent class methods

   3. Call parent class constructor
*/   

// Example of super keyword

// Parent class
class Animal {
    String color = "Brown";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}


// Child class
class Dog extends Animal {
    String color = "Black";

    Dog() {
        super(); // Calls Animal's constructor
        System.out.println("Dog constructor called");
    }

    void printColor() {
        System.out.println("Dog color: " + color);        // Black (child)
        System.out.println("Animal color: " + super.color); // Brown (parent)
    }

    void eat() {
        super.eat(); // Call the eat() method from Animal
        System.out.println("Dog eats bones");
    }
}
