/* 
this codes purpose is to sort an array using bubble sort and search for an item in the sorted array
this code is a simple implementation of bubble sort and search functionality in Java.
It generates a random array of integers, sorts it using bubble sort, and then searches for
a specific item in the sorted array. The code demonstrates basic array manipulation, sorting, and searching techniques.
*/
package AdvancedJavaProjects;

import java.util.Random;

public class BubbleSorting {
    // Bubble sort function for sorting integer arrays
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if the element is greater than the next one
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Search function to find if an item exists in the array
    public static boolean search(int[] array, int item) {
        for (int num : array) {
            if (num == item) {
                return true;  // Item found
            }
        }
        return false;  // Item not found
    }

    // Main driver function
    public static void main(String[] args) {
        // Generate a random dummy array with 10 elements
        Random rand = new Random();
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(100);  // Random numbers between 0 and 99
        }

        // Print the unsorted array
        System.out.println("Unsorted Array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        // Sort the array using bubble sort
        bubbleSort(randomArray);

        // Print the sorted array
        System.out.println("\nSorted Array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        // Search for a number in the sorted array
        int searchItem = 50;  // Example item to search for
        System.out.println("\n\nSearching for " + searchItem + " in the array...");
        if (search(randomArray, searchItem)) {
            System.out.println(searchItem + " was found in the array.");
        } else {
            System.out.println(searchItem + " was not found in the array.");
        }
    }
}
