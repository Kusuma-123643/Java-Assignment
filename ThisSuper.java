class Parent {
    int age = 50;

    Parent() {
        System.out.println("Parent class constructor");
    }

    void showParent() {
        System.out.println("Parent age: " + age);
    }
}

class Child extends Parent {
    int age = 20;

    Child() {
        this("Harsha"); // 3. Call argument constructor using this()
        System.out.println("Child class default constructor");
    }

    Child(String name) {
        super(); // 5. Call constructor of parent class using super()
        System.out.println("Child class parameterized constructor. Name: " + name);
    }

    void display() {
        System.out.println("Child age using this: " + this.age); // 1. Print current class field using this
        System.out.println("Parent age using super: " + super.age); // 2. Print parent class field using super
    }

    void callMethods() {
        this.showChild(); // 6. Call method using this
        super.showParent(); // 6. Call method using super
    }

    void showChild() {
        System.out.println("Child's method called using this");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.callMethods();
    }
}
