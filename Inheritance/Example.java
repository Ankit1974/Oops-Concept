package Inheritance;

// Single Inheritance Example

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}


// Multilevel Inheritance Example

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}


// Hierarchical Inheritance Example

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}
