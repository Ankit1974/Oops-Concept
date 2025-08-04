package Abstraction&Polymorphism;

// Interface helps to communicate between different classes.


/* 
   HoW?

   1. It provides a common structure (set of methods) that different classes agree to follow.
   2. So, even if the classes are totally unrelated, they can be used in the same way if they implement the 
   same interface.

*/ 


/*  Note :- 1. interface is always public 
            2. In interface we use implement keyword to implement the interface in the child class. 
            3. java does not support multiple inheritance but it supports multiple inheritance through interface.
            4. Interface methods are by default public and abstract.
*/           


// Example of interface

   // Interface (contract)
    interface Vehicle {
     void start();
   }

   class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
  }

  class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}
    
    public class Main {
        public static void main(String[] args) {
            Vehicle myCar = new Car(); // Upcasting
            Vehicle myBike = new Bike(); // Upcasting
    
            myCar.start(); // Output: Car is starting...
            myBike.start(); // Output: Bike is starting...
        }
    }
