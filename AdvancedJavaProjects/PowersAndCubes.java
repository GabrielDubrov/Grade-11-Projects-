//this code is a simple implementation of a program that calculates the square and cube of integers from 1 to 10.
// It uses a loop to iterate through the numbers, calculates their square and cube, and prints the results.

package AdvancedJavaProjects;

public class PowersAndCubes {
    public static void main(String[] args) {
        // Loop through integers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Calculate and print the square (i^2) and cube (i^3) of the integer
            int square = i * i;
            int cube = i * i * i;
            
            // Print the results for each number
            System.out.println("Number: " + i + ", Square: " + square + ", Cube: " + cube);
        }
    }

}
