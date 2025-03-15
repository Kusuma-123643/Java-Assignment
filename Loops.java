public class Loops {

    // 1. Write a program to print  “Bright IT Career”  ten times using for loop 
    void printCareer() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Bright IT Career");
        }
    }

    // 2. Write a java program to print 1 to 20 numbers using the while loop. 
    void printOneToTwenty() {
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // 3. Program to equal operator and not equal operators 
    void equalityCheck(int a, int b) {
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
    }

    // 4. Write a program to print the odd and even numbers. 
    void printOddEven(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }

    // 5. Write a program to print largest number among three numbers. 
    void largestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("Largest is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest is: " + b);
        } else {
            System.out.println("Largest is: " + c);
        }
    }

    // 6. Write a program to print even number between 10 and 100 using while 
    void evenFrom10To100() {
        int i = 10;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    // 7. Write a program to print 1 to 10 using the do-while loop statement. 
    void printOneToTen() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }

    // 8. Write a program to find Armstrong number or not 
    void isArmstrong(int number) {
        int original = number, sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }

    // 9. Write a program to find the prime or not. 
    void isPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not prime");
            return;
        }
        boolean prime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }

    // 10. Write a program to palindrome or not. 
    void isPalindrome(int num) {
        int original = num, reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if (reverse == original) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }

    // 11. Program to check whether a number is EVEN or ODD using switch 
    void evenOddSwitch(int num) {
        switch (num % 2) {
            case 0:
                System.out.println(num + " is Even");
                break;
            case 1:
                System.out.println(num + " is Odd");
                break;
        }
    }

    // 12. Print gender (Male/Female) program according to given M/F using switch 
    void printGender(char gender) {
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    // 13. Program for multiple if else statement(Largest number in 10,20 and 30)
    void largestInThreeFixed() {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("Largest is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest is " + b);
        } else {
            System.out.println("Largest is " + c);
        }
    }

    public static void main(String[] args) {
        Loops obj = new Loops();

        obj.printCareer();
        obj.printOneToTwenty();
        obj.equalityCheck(10, 20);
        obj.printOddEven(10);
        obj.largestOfThree(10, 25, 15);
        obj.evenFrom10To100();
        obj.printOneToTen();
        obj.isArmstrong(153);
        obj.isPrime(7);
        obj.isPalindrome(121);
        obj.evenOddSwitch(5);
        obj.printGender('F');
        obj.largestInThreeFixed();
    }
}

