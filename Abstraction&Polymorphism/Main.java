// we make both class & method abstract

// We can't create an object of an abstract class


// Note : - if any child class does not define the abstract method of abstract class then those child class are not
//            the child class of the abstract class.

// Example of abstract class


// Abstract class
abstract class Animal {
    // Abstract method (no body)  or we can say this is the reponsibility of the child class to implement this method
    abstract void sound();

    // Concrete method (with body)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Dog says: Bark Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); ❌ Not allowed: Cannot instantiate abstract class

        Dog d = new Dog(); // ✅ Allowed
        d.sound();         // Output: Dog says: Bark Bark
        d.sleep();         // Output: Animal is sleeping...
    }
}
