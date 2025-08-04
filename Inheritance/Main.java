package Inheritance;

// Question link - https://chatgpt.com/share/6812b62c-f8d4-8004-a8ed-f91b0add1513
// descussion link - https://chatgpt.com/share/6812b667-a268-8004-9e69-c15e3c9261ee

// we have to check if the RelationShip between the classes is "is-a" then we can use inheritance
// and if the relation is "has-a" then we can use encapsulation or we have to create object


// Example of Inheritance

// Superclass (Parent class)
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass (Child class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Defined in Dog
    }
}


/*  
    if we use private access modifier then we can not access the method of parent class in child class. 
    we can access using the getter and setter method(if Provided).
*/


/*
   Type of Inheritance:

    1. Single Inheritance: A class inherits from one superclass or we can say that each child class has only 1 parent class.
    2. Multiple Inheritance: A class inherits from multiple superclasses. (Not supported in Java)
       or we can say that each child class has multiple parent classes.
    3. Multilevel Inheritance: A class inherits from a superclass, which in turn inherits from another superclass.
         or we can say that each child class has only 1 parent class but the parent class has multiple child classes.
    4. Hierarchical Inheritance: Multiple classes inherit from a single superclass.
            or we can say that a parent class has multiple child classes.
    5. Hybrid Inheritance: A combination of two or more types of inheritance. (Not supported in Java)
 */


 // Note: we can use multiple inheritance during interfacce in java right.

// Note: If their is no parent class defined then object is the parent class of all classes in java.
//       it provide default methods like toString(), hashCode(), equals() etc.