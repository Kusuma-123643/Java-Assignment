public class Static {

    // Static variables
    static int collegeCode = 1234;
    static String collegeName = "Aditya";

    // Instance variables
    int studentId = 1;
    String studentName = "Harsha";

    // Static method 1
    static void staticMethod1() {
        System.out.println("Inside staticMethod1");

        // Access static variables
        System.out.println("College Code: " + collegeCode);
        System.out.println("College Name: " + collegeName);

        // Create object to access instance variables
        Static obj = new Static();
        System.out.println("Student ID: " + obj.studentId);
        System.out.println("Student Name: " + obj.studentName);
    }

    // Instance method 1
    void instanceMethod1() {
        System.out.println("Inside instanceMethod1");

        // Access static variables
        System.out.println("College Code: " + collegeCode);
        System.out.println("College Name: " + collegeName);

        // Access instance variables
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
    }

    // Main method
    public static void main(String[] args) {
        // Call static method
        staticMethod1();

        // Create object
        Static obj = new Static();

        // Call instance method
        obj.instanceMethod1();
    }
}
