public class Strings {
    public static void main(String[] args) {

        // 1. Different ways of creating a string
        String str1 = "Hello";
        String str2 = new String("World");

        // 2. Concatenating two strings using + operator
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated: " + str3);

        // 3. Finding the length of the string
        System.out.println("Length: " + str3.length());

        // 4. Extract a string using substring
        String sub = str3.substring(0, 5); // "Hello"
        System.out.println("Substring: " + sub);

        // 5. Searching in strings using indexOf()
        int index = str3.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // 6. Matching a string against regex using matches()
        boolean match = str1.matches("[A-Z][a-z]+"); // starts with capital followed by smalls
        System.out.println("Matches pattern: " + match);

        // 7. Comparing strings using equals()
        System.out.println("Equals 'Hello': " + str1.equals("Hello"));

        // 8. equalsIgnoreCase(), startsWith(), endsWith(), compareTo()
        System.out.println("EqualsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));
        System.out.println("Starts with 'He': " + str1.startsWith("He"));
        System.out.println("Ends with 'lo': " + str1.endsWith("lo"));
        System.out.println("CompareTo 'Hello': " + str1.compareTo("Hello")); // 0 means equal

        // 9. Trimming strings with trim()
        String messy = "  Java is fun  ";
        System.out.println("Before trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // 10. Replacing characters in strings with replace()
        String replaced = str3.replace("World", "Java");
        System.out.println("Replaced: " + replaced);

        // 11. Splitting strings with split()
        String data = "apple,banana,grape";
        String[] fruits = data.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 12. Converting numbers to strings with valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("Number as String: " + numStr);

        // 13. Converting Integer object to String
        Integer obj = 200;
        String objStr = obj.toString();
        System.out.println("Integer object to String: " + objStr);

        // 14. Converting to uppercase and lowercase
        String mixed = "Java";
        System.out.println("Uppercase: " + mixed.toUpperCase());
        System.out.println("Lowercase: " + mixed.toLowerCase());
    }
}
