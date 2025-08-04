package Abstraction&Polymorph

/* 
   When a child class provides its own implementation of a method that is already defined in its parent class,
   it’s called method overriding.
*/   

//  Why Override?

// To change the behavior of a method inherited from the parent class.


/*  Rules for Overriding:

  1. Method must have the same name

  2. Must have same parameters

  3. Must be in child class

  4. There must be inheritance

  5. Access modifier should be same or more visible

*/

//  Example of Method Overriding


  // Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


// Child class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
