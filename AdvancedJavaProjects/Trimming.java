//the purpose of this code is to trim an array to a specific size, both for integer and string arrays.
// It includes a main function to demonstrate the trimming functionality with sample arrays.

package AdvancedJavaProjects;

public class Trimming {
    // Function to trim an integer array to a specific size
    public static int[] trimIntArray(int[] array, int newSize) {
        if (newSize < 0 || newSize > array.length) {
            System.out.println("Invalid new size.");
            return array; // Return original array if the new size is invalid
        }
        int[] trimmedArray = new int[newSize];
        System.arraycopy(array, 0, trimmedArray, 0, newSize);
        return trimmedArray;
    }

    // Function to trim a string array to a specific size
    public static String[] trimStringArray(String[] array, int newSize) {
        if (newSize < 0 || newSize > array.length) {
            System.out.println("Invalid new size.");
            return array; // Return original array if the new size is invalid
        }
        String[] trimmedArray = new String[newSize];
        System.arraycopy(array, 0, trimmedArray, 0, newSize);
        return trimmedArray;
    }

    // Main driver function to test trimming functionality
    public static void main(String[] args) {
        // Create and initialize an integer array of size 10
        int[] intArray = new int[10];
        intArray[0] = 5;  // Set the first item
        intArray[1] = 10; // Set the second item
        System.out.println("Original Integer Array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Trim the integer array to size 5
        intArray = trimIntArray(intArray, 5);
        System.out.println("Integer Array After Trimming to Size 5:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Create and initialize a string array of size 10
        String[] stringArray = new String[10];
        stringArray[0] = "Apple";  // Set the first item
        stringArray[1] = "Banana"; // Set the second item
        System.out.println("Original String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Trim the string array to size 5
        stringArray = trimStringArray(stringArray, 5);
        System.out.println("String Array After Trimming to Size 5:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
