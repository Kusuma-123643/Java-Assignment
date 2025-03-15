public class MethodOverloading {

    // 1. Same name, different number of parameters (same type)
    void greet(String name) {
        System.out.println("Hello, " + name);
    }

    void greet(String name, String message) {
        System.out.println(message + ", " + name);
    }

    // 2. Same name, different number of parameters (different data types)
    void display(int num) {
        System.out.println("Integer value: " + num);
    }

    void display(double num, String label) {
        System.out.println(label + ": " + num);
    }

    // 3. Same name, same number of parameters (same type)
    void show(String msg1, String msg2) {
        System.out.println("Two messages: " + msg1 + ", " + msg2);
    }

    // 4. Same name, same number of parameters (different types)
    void show(int a, double b) {
        System.out.println("Int and Double: " + a + ", " + b);
    }

    // 5. Same name, same parameters and data type but different return type (❌ Not allowed in Java)
    // This will cause compile-time error if uncommented.
    // int result(int a) {
    //     return a;
    // }

    // String result(int a) {
    //     return "Value: " + a;
    // }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // 1
        obj.greet("Harsha");
        obj.greet("Harsha", "Good Morning");

        // 2
        obj.display(10);
        obj.display(99.5, "Temperature");

        // 3
        obj.show("Hi", "Welcome");

        // 4
        obj.show(5, 4.5);

        // 5
        // Not possible - method overloading cannot be done with return type alone
    }
}

