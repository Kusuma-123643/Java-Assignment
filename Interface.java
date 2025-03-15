interface OneMethod {
    void greet();
}

class Greeting implements OneMethod {
    public void greet() {
        System.out.println("Hello from Harsha!");
    }
}

// 2. Interface with 2 methods, implementing only one
interface Partial {
    void show();
    void hide();
}

class PartialImpl implements Partial {
    public void show() {
        System.out.println("Showing something...");
    }
    public void hide() {
        // Left empty intentionally
    }
}

// 3. Interface instance calling implemented class
interface Speak {
    void say();
}

class Person implements Speak {
    public void say() {
        System.out.println("Harsha is speaking...");
    }
}

// 4. Two interfaces, one method each
interface Walk {
    void walk();
}

interface Run {
    void run();
}

class Human implements Walk, Run {
    public void walk() {
        System.out.println("Walking...");
    }
    public void run() {
        System.out.println("Running...");
    }
}

// 5. Two interfaces with same method name
interface A {
    void info();
}

interface B {
    void info();
}

class Combined implements A, B {
    public void info() {
        System.out.println("Same method from both interfaces implemented once.");
    }
}

// 6. Interface with default method
interface DefaultEx {
    default void show() {
        System.out.println("Default method called.");
    }
}

class DefaultImpl implements DefaultEx {
    // No need to override show()
}

// 7. Interface inheriting another
interface Base {
    void baseMethod();
}

interface Derived extends Base {
    void derivedMethod();
}

class Child implements Derived {
    public void baseMethod() {
        System.out.println("Base method");
    }
    public void derivedMethod() {
        System.out.println("Derived method");
    }
}

// 8. Public interface with fields and methods
 interface PublicData {
    int age = 21;
    String name = "Harsha";

    void showAge();
}

class Student implements PublicData {
    public void showAge() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// 11. Interface with static final variable
interface Constants {
    static final int MAX = 100;
}

public class Interface {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.greet();

        PartialImpl p = new PartialImpl();
        p.show();

        Speak s = new Person();
        s.say();

        Human h = new Human();
        h.walk();
        h.run();

        Combined c = new Combined();
        c.info();

        DefaultImpl d = new DefaultImpl();
        d.show();

        Child ch = new Child();
        ch.baseMethod();
        ch.derivedMethod();

        Student stu = new Student();
        stu.showAge();

        System.out.println("Constant value from interface: " + Constants.MAX);
    }
}
