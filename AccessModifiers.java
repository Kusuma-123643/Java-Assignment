// 1. Private Example
class BankAccount {
    private String accountHolder = "Harsha";
    private double balance = 5000;

    private void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println("Account Holder: " + acc.accountHolder);
        acc.showBalance();
    }
}

class TryPrivateAccess extends BankAccount {
    public void display() {
        // Cannot access private members here
    }
}


// 2. Default Example
class Student {
    String name = "Harsha";
    void study() {
        System.out.println(name + " is studying.");
    }
}

class TestDefault {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
    }
}


// 3. Protected Example
class Vehicle {
    protected String type = "Bike";

    protected void run() {
        System.out.println(type + " is running.");
    }
}

class SamePackageAccess {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
    }
}

class AnotherPackageChild extends Vehicle {
    public void display() {
        System.out.println("Accessing from another package subclass:");
        System.out.println(type);
        run();
    }
}

class AnotherPackageNonChild {
    public void test() {
        // Cannot access protected members directly
    }
}


// 4. Public Example
public class AccessModifiers {
    public String message = "Hello from public class!";

    public void showMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.showMessage();
    }
}
