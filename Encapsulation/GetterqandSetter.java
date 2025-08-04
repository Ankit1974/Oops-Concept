package Encapsulation;
/*
🧑‍🏫 Getters and Setters
In object-oriented programming, getters and setters are special methods used to access and modify 
the values of private fields of a class.

🔑 Getter:
A method that returns the value of a private variable.
The naming convention is usually get<VariableName>().

🔑 Setter:
A method that sets (or modifies) the value of a private variable.
The naming convention is usually set<VariableName>(value).

💡 Why Use Them?
Encapsulation: Keep the data hidden (private), but provide controlled access via getter and setter methods.

Data Validation: A setter can be used to add validation or logic when setting values.

Read-Only or Write-Only: You can make variables read-only by providing only a getter or write-only by providing only a setter.
 */

 // Example of getters and setters in Java

public class Person {
    private String name;  // private field
    private int age;      // private field

    // Getter for name
    public String getName() {
        return name;  // Returns the value of name
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;  // Sets the value of name
    }

    // Getter for age
    public int getAge() {
        return age;  // Returns the value of age
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {   // You can add validation in setters
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

// How to use getters and setters in Java

public class Main {
    public static void main(String[] args) {
        // Creating an object of Person class
        Person person = new Person();

        // Using setter to set the name and age
        person.setName("Alice");
        person.setAge(25);

        // Using getter to access the name and age
        System.out.println("Name: " + person.getName());  // Alice
        System.out.println("Age: " + person.getAge());    // 25
    }
}
