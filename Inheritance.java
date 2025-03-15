class Person {
    String role = "Person";

    void walk() {
        System.out.println("Person walks.");
    }

    void introduce() {
        System.out.println("I am a person.");
    }
}

class Employee extends Person {
    String role = "Employee";

    void work() {
        System.out.println("Employee works.");
    }

    @Override
    void introduce() {
        System.out.println("I am an employee.");
    }
}

class Manager extends Employee {
    String role = "Manager";

    void manage() {
        System.out.println("Manager manages.");
    }

    @Override
    void introduce() {
        System.out.println("I am a manager.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();

        p.walk(); p.introduce();
        e.walk(); e.work(); e.introduce();
        m.walk(); m.work(); m.manage(); m.introduce();

        Person ref;

        ref = e;
        ref.introduce();

        ref = m;
        ref.introduce();

        System.out.println(ref.role);  
        System.out.println(m.role);
    }
}
