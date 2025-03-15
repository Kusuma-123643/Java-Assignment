public class Operators {

    // 1. Write a function for arithmetic operators(+,-,*,/) 
    void arithmeticOperations(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    // 2. Write a method for increment and decrement operators(++, --) 
    void incrementDecrement(int x) {
        System.out.println("Before Increment: " + x);
        x++;
        System.out.println("After Increment: " + x);
        x--;
        System.out.println("After Decrement: " + x);
    }

    // 3. Program to equal operator and not equal operators 
    void equalityOperators(int a, int b) {
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
    }

    // 4. Write a program to find the two numbers equal or not.
    void checkEqual(int a, int b) {
        if (a == b) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }

    // 5. Programs on Logical AND, OR operator and Logical NOT 
    void logicalOperators(boolean a, boolean b) {
        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean notResult = !a;
        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Logical NOT of a: " + notResult);
    }

    // 6. Program for relational operators (<,<==, >, >==) 
    void relationalOperators(int a, int b) {
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
    }

    // 7. Print the smaller and larger number
    void printSmallerLarger(int a, int b) {
        if (a > b) {
            System.out.println("Larger number: " + a);
            System.out.println("Smaller number: " + b);
        } else if (b > a) {
            System.out.println("Larger number: " + b);
            System.out.println("Smaller number: " + a);
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    public static void main(String[] args) {
        Operators obj = new Operators();

        int a = 15;
        int b = 10;

        obj.arithmeticOperations(a, b);
        obj.incrementDecrement(a);
        obj.equalityOperators(a, b);
        obj.checkEqual(a, b);
        obj.logicalOperators(true, false);
        obj.relationalOperators(a, b);
        obj.printSmallerLarger(a, b);
    }
}
