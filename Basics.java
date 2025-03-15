
class Basics {

    // 1. How to create a class, object, method and its signature 
    void greet() {
        System.out.println("Hello from the method inside the class!");
    }

    // 6. Write a function to print your name and call the function from main method
    void printName() {
        System.out.println("My name is Harsha");
    }

    public static void main(String[] args) {

        // Creating object
        Basics obj = new Basics();
        obj.greet(); // Calling method from question 1

        // 2. Write a program to print your name.
        System.out.println("Harsha");

        // 3. Write a program for a Single line comment, multi-line and documentation comments 
        // This is a single-line comment

        /* 
         This is a 
         multi-line comment 
        */

        /**
         * This is a documentation comment
         * It describes the class or method
         */

        // 4. Define variables for different Data Types int, Boolean, char, float, double and print on the Console 
        int myInt = 25;
        boolean myBool = true;
        char myChar = 'A';
        float myFloat = 3.14f;
        double myDouble = 99.99;

        System.out.println("Integer: " + myInt);
        System.out.println("Boolean: " + myBool);
        System.out.println("Char: " + myChar);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

        // 5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables 
        int value = 100; // local variable
        System.out.println("Local variable value: " + value);
        System.out.println("Global variable value: " + obj.value); // accessing global variable

        // 6. Write a function to print your name and call the function from main method
        obj.printName();
    }

    int value = 200; // global variable
}
