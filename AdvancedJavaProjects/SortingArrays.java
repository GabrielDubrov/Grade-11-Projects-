//this codes purpose is to sort both integer and string arrays using built-in Java methods.
// It includes a main function to demonstrate the sorting functionality with sample arrays.

package AdvancedJavaProjects;

import java.util.Arrays;

public class SortingArrays {
    // Function to sort an integer array
    public static int[] sortIntegerArray(int[] intArray) {
        Arrays.sort(intArray);  // Sort the integer array in ascending order
        return intArray;        // Return the sorted integer array
    }

    // Function to sort a string array
    public static String[] sortStringArray(String[] stringArray) {
        Arrays.sort(stringArray);  // Sort the string array in ascending order
        return stringArray;        // Return the sorted string array
    }

    // Main driver function
    public static void main(String[] args) {
        // Declare and initialize an unsorted integer array
        int[] intArray = {42, 7, 13, 29, 3};
        
        // Declare and initialize an unsorted string array
        String[] stringArray = {"Banana", "Apple", "Cherry", "Mango", "Grapes"};

        // Display the unsorted integer array
        System.out.println("Unsorted Integer Array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display the unsorted string array
        System.out.println("Unsorted String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Sort the arrays using the sorting functions
        intArray = sortIntegerArray(intArray);  // Sort the integer array
        stringArray = sortStringArray(stringArray);  // Sort the string array

        // Display the sorted integer array
        System.out.println("\nSorted Integer Array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display the sorted string array
        System.out.println("Sorted String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
