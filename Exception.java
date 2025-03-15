import java.io.*;
import java.sql.*;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Exception {
    public static void arithmeticExceptionWithoutHandling() {
        int x = 10 / 0;
    }

    public static void handleArithmeticException() {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        }
    }

    public static void throwsException() throws ArithmeticException {
        int x = 10 / 0;
    }

    public static void multipleCatchBlocks() {
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Other Exception");
        }
    }

    public static void throwOwnMessage() {
        try {
            throw new ArithmeticException("Custom Message: Divide by zero error");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createOwnException() {
        try {
            throw new MyException("This is my custom exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void finallyBlockExample() {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void generateArithmeticException() {
        int a = 1 / 0;
    }

    public static void generateArrayIndexOutOfBounds() {
        int[] arr = new int[3];
        System.out.println(arr[10]);
    }

    public static void generateClassNotFoundException() {
        try {
            Class.forName("com.unknown.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught");
        }
    }

    public static void generateFileNotFoundException() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("unknown.txt");
    }

    public static void generateIOException() throws IOException {
        throw new IOException("This is IO Exception");
    }

    public static void generateNoSuchFieldException() throws NoSuchFieldException {
        Class<String> c = String.class;
        c.getDeclaredField("unknownField");
    }

    public static void generateNoSuchMethodException() throws NoSuchMethodException {
        String.class.getDeclaredMethod("unknownMethod");
    }

    public static void generateNullPointerException() {
        String s = null;
        System.out.println(s.length());
    }

    public static void generateNumberFormatException() {
        int num = Integer.parseInt("abc");
    }

    public static void generateStringIndexOutOfBounds() {
        String str = "Hi";
        System.out.println(str.charAt(5));
    }

    public static void generateSQLException() throws SQLException {
        throw new SQLException("Database error");
    }

    public static void main(String[] args) {
        // Uncomment to test each case individually
    }
}
