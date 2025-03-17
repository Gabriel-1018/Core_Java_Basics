// Class representing an example of encapsulation
class Person {
    // Private variables, not directly accessible from outside the class
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        // Adding validation inside the setter to ensure valid values
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Method to display Person's details
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

public class Encapsulationexample
{
    public static void main(String[] args) {
        // Create an object of Person class
        Person person = new Person("John Doe", 25);

        // Accessing private variables via getter methods
        person.displayInfo();

        // Using setter methods to modify the object's state
        person.setName("Jane Doe");
        person.setAge(30);

        // Display updated information
        person.displayInfo();

        // Trying to set invalid age
        person.setAge(-5);  // Will print "Age must be positive!"

        System.out.println(person.getName());
    }
}
