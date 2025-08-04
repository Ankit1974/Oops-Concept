package Encapsulation;
// Properties of Encapsulation

/* 
   Data Hiding: Encapsulation  hides internal data , allowing access only through methods.
   Acess Modifiers: Encapsulation uses access modifiers (private, public, protected) to control visibility.
   Getter and Setter Methods: Encapsulation provides getter and setter methods to access and modify private data.  
   Maintains the intericgity of data

 */

/* 
    import java.util.Scanner;
    Here java, util is a package and Scanner is a class in that package.
*/


// Example of encapsulation in Java

class Person {
    private String name; // hidden data
    private int age;

    // public method to access private data
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge( int newAge){
        age = newAge;
    }

    public int getAge(){
        return age;
    }
}

