// Super class
class Person {
    // Default (package-private) constructor
    Person(String name, int age) {
        System.out.println("Default Constructor - Person: " + name + ", Age: " + age);
    }

    // Public constructor
    public Person(String name) {
        System.out.println("Public Constructor - Person: " + name);
    }

    // Protected constructor
    protected Person(int age) {
        System.out.println("Protected Constructor - Person Age: " + age);
    }
}

// Sub class
class Student extends Person {

    // Default constructor
    Student() {
        super("Harsha");  // Public constructor
        System.out.println("Student Default Constructor");
    }

    // One-arg constructor
    Student(String name) {
        super(20);  // Protected constructor
        System.out.println("Student One-Arg Constructor: " + name);
    }

    // Two-arg constructor
    Student(String name, int roll) {
        super(name, roll);  // Default/package-private constructor
        System.out.println("Student Two-Arg Constructor: " + name + ", Roll: " + roll);
    }

    // Just regular methods (not constructors)
    int showInt() {
        System.out.println("This is a method, not a constructor - int return");
        return 1;
    }

    String showMessage(String msg) {
        System.out.println("This is a method, not a constructor - String return");
        return msg;
    }
}

// Main class
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();                // Calls public constructor in super
        Student s2 = new Student("Harsha");        // Calls protected constructor in super
        Student s3 = new Student("Harsha", 101);   // Calls default constructor in super

        s1.showInt();
        s1.showMessage("Hi from Harsha!");
    }
}
