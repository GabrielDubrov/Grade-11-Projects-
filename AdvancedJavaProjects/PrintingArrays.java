//this codes purpose is to print the elements of an array, both string and integer arrays, in a formatted manner.
// It includes a main function to test the printing functions with sample arrays.

package AdvancedJavaProjects;

public class PrintingArrays {
    public static void printStringArray(String[] stringArray) {
        System.out.println("String Array Elements:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element " + i + ": " + stringArray[i]);
        }
    }


    public static void printIntArray(int[] intArray) {
        System.out.println("Integer Array Elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + ": " + intArray[i]);
        }
    }

    public static void main(String[] args) {
        // Declare and initialize an unsorted integer array
        int[] intArray = {42, 7, 13, 29, 3};

        // Declare and initialize an unsorted string array
        String[] stringArray = {"Banana", "Apple", "Cherry", "Mango", "Grapes"};

        // Test the functions
        System.out.println("Testing String Array Function:");
        printStringArray(stringArray); // Call the function to print string array

        System.out.println("\nTesting Integer Array Function:");
        printIntArray(intArray); // Call the function to print integer array
    }
}
