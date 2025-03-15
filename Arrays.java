public class Arrays {

    // 1. Add integer values of an array
    int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // 2. Average value of array
    double averageArray(int[] arr) {
        int sum = sumArray(arr);
        return (double) sum / arr.length;
    }

    // 3. Find index of array element
    int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    // 4. Check if array contains specific value
    boolean contains(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) return true;
        }
        return false;
    }

    // 5. Remove specific element from array
    int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int i : arr) if (i == value) count++;
        int[] result = new int[arr.length - count];
        int j = 0;
        for (int i : arr) {
            if (i != value) result[j++] = i;
        }
        return result;
    }

    // 6. Copy array to another array
    int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) newArray[i] = arr[i];
        return newArray;
    }

    // 7. Insert element at specific position
    int[] insertAtPosition(int[] arr, int value, int pos) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) result[i] = arr[i];
        result[pos] = value;
        for (int i = pos; i < arr.length; i++) result[i + 1] = arr[i];
        return result;
    }

    // 8. Find minimum and maximum
    void minMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    // 9. Reverse array
    int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // 10. Find duplicate values
    void findDuplicates(int[] arr) {
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    // 11. Find common values between two arrays
    void findCommon(int[] a, int[] b) {
        System.out.print("Common Elements: ");
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    // 12. Remove duplicate elements from array
    int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (temp[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) temp[k++] = arr[i];
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }

    // 13. Second largest number
    int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                second = max;
                max = i;
            } else if (i > second && i != max) {
                second = i;
            }
        }
        return second;
    }

    // 14. (Repeated) Second largest number
    int secondLargestAgain(int[] arr) {
        return secondLargest(arr);
    }

    // 15. Count even and odd numbers
    void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int i : arr) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    // 16. Difference between largest and smallest
    int diffMaxMin(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return max - min;
    }

    // 17. Verify if array contains both 12 and 23
    boolean contains12and23(int[] arr) {
        boolean has12 = false, has23 = false;
        for (int i : arr) {
            if (i == 12) has12 = true;
            if (i == 23) has23 = true;
        }
        return has12 && has23;
    }

    // 18. Remove duplicates and return new array
    int[] removeDuplicatesNewArray(int[] arr) {
        return removeDuplicates(arr);
    }

    // 19. Find missing number in 1 to 100
    int findMissing(int[] arr) {
        int total = 100 * 101 / 2; // sum of 1 to 100
        int sum = 0;
        for (int i : arr) sum += i;
        return total - sum;
    }

    public static void main(String[] args) {
        Arrays obj = new Arrays();

        int[] array = {1, 5, 12, 23, 7, 12, 23};
        int[] array2 = {4, 12, 23, 88};

        System.out.println("Sum: " + obj.sumArray(array));
        System.out.println("Average: " + obj.averageArray(array));
        System.out.println("Index of 23: " + obj.findIndex(array, 23));
        System.out.println("Contains 7? " + obj.contains(array, 7));
        
        int[] removed = obj.removeElement(array, 12);
        System.out.print("After Removing 12: ");
        for (int i : removed) System.out.print(i + " ");
        System.out.println();

        int[] copied = obj.copyArray(array);
        System.out.print("Copied Array: ");
        for (int i : copied) System.out.print(i + " ");
        System.out.println();

        int[] inserted = obj.insertAtPosition(array, 99, 2);
        System.out.print("After Inserting 99 at pos 2: ");
        for (int i : inserted) System.out.print(i + " ");
        System.out.println();

        obj.minMax(array);
        
        int[] reversed = obj.reverseArray(array);
        System.out.print("Reversed Array: ");
        for (int i : reversed) System.out.print(i + " ");
        System.out.println();

        obj.findDuplicates(array);
        obj.findCommon(array, array2);

        int[] noDup = obj.removeDuplicates(array);
        System.out.print("No Duplicates: ");
        for (int i : noDup) System.out.print(i + " ");
        System.out.println();

        System.out.println("Second Largest: " + obj.secondLargest(array));
        System.out.println("Second Largest Again: " + obj.secondLargestAgain(array));

        obj.countEvenOdd(array);
        System.out.println("Difference (Max - Min): " + obj.diffMaxMin(array));
        System.out.println("Contains 12 and 23? " + obj.contains12and23(array));

        int[] newArray = obj.removeDuplicatesNewArray(array);
        System.out.print("New Array after removing duplicates: ");
        for (int i : newArray) System.out.print(i + " ");
        System.out.println();

        // Creating a test array from 1 to 100 with one number missing
        int[] missingArray = new int[99];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != 45) {
                missingArray[index++] = i;
            }
        }
        System.out.println("Missing number: " + obj.findMissing(missingArray));
    }
}
