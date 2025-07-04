//this code is a simple implementation of a number finder that merges two arrays, removes duplicates, sorts the merged array, and allows the user to search for a number in the sorted array.

package AdvancedJavaProjects;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {
        // Arrays to merge
        int[] array1 = {1, 20, 1, 5, 6, 500};
        int[] array2 = {1, 3, 4, 5, 700};
        
        // Merging the two arrays
        int[] mergedArray = mergeArrays(array1, array2);
        
        // Sorting the merged array
        Arrays.sort(mergedArray);
        
        // Display the sorted merged array
        System.out.println("Final array (sorted without duplicates): " + Arrays.toString(mergedArray));
        
        // Prompting the user to search for a number
        searchInArray(mergedArray);
    }

    // Function to merge two arrays and remove duplicates
    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create a new array large enough to hold both arrays
        int[] tempArray = new int[array1.length + array2.length];
        int index = 0;

        // Add elements of the first array to the temporary array
        for (int num : array1) {
            if (!contains(tempArray, num, index)) { // Check if the number is already in the temp array
                tempArray[index++] = num;
            }
        }

        // Add elements of the second array to the temporary array
        for (int num : array2) {
            if (!contains(tempArray, num, index)) { // Check if the number is already in the temp array
                tempArray[index++] = num;
            }
        }

        // Resize the array to fit the unique numbers
        return Arrays.copyOf(tempArray, index);
    }

    // Function to check if a number is already in the array
    public static boolean contains(int[] array, int num, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] == num) {
                return true; // Found the number in the array
            }
        }
        return false; // Number is not in the array
    }

    // Function to prompt the user to search a number in the array
    public static void searchInArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search in the array (or -1 to exit):");
        
        while (true) {
            // Get user input
            int searchNumber;
            try {
                searchNumber = Integer.parseInt(scanner.nextLine()); // Parse the input to an integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                continue; // Skip the invalid input
            }
            
            // Exit the program if the user enters -1
            if (searchNumber == -1) {
                System.out.println("Exiting program.");
                break;
            }

            // Check if the number is in the array
            if (binarySearch(array, searchNumber)) {
                System.out.println(searchNumber + " is in the array.");
            } else {
                System.out.println(searchNumber + " is not in the array.");
            }
        }
        
        scanner.close();
    }

    // Function to perform binary search (array must be sorted)
    public static boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int middle = (left + right) / 2;
            
            if (array[middle] == target) {
                return true; // Found the target
            } else if (array[middle] < target) {
                left = middle + 1; // Search in the right half
            } else {
                right = middle - 1; // Search in the left half
            }
        }
        
        return false; // Target not found
    }
}
