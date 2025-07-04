//this code is a simple implementation of a program that calculates the average of marks entered by the user.
// It allows the user to enter marks for a test, calculates the total and average, and displays the results.
// The program also includes error handling for invalid inputs and allows the user to exit by entering -1 or 0 as the total marks.
package PersonalJavaProjects;

import java.util.Scanner;

public class TestMarkCalculation {

    // Function to validate integer input using a shared Scanner
    public static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // clear invalid input
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create ONE scanner for all input
        int[] marks = new int[35]; // Array to store marks (size 35)
        int totalMarks = 0; // Variable to store the total marks entered
        int numMarks = 0;   // Number of marks entered
        double TotalAverage = 0;

        // Step 1: Get test total (number of marks in the test)
        System.out.print("Enter the total marks for the test: ");
        int testTotal = getIntInput(scanner);

        // Error check: If the user enters 0 or -1, exit the program
        if (testTotal == 0 || testTotal == -1) {
            System.out.println("Exiting program...");
            scanner.close(); // Close scanner before exiting
            return;
        }

        // Step 2: Collect marks from the user
        while (numMarks < 35) {
            System.out.print("Enter mark " + (numMarks + 1) + " (or -1 to exit): ");
            int mark = getIntInput(scanner);

            // If user enters -1, stop collecting marks
            if (mark == -1) {
                break;
            }

            // Error check: If the mark is greater than the total marks, ask again
            if (mark > testTotal || mark < 0) {
                System.out.println("Invalid mark. Please enter a mark between 0 and " + testTotal + ".");
                continue;
            }

            marks[numMarks] = mark; // Store the mark in the array
            totalMarks += mark;     // Add to the total marks
            numMarks++;             // Increment the number of marks entered
        }

        // Step 3: Calculate and display class average if marks were entered
        if (numMarks > 0) {
            TotalAverage = (double) totalMarks / numMarks;
            System.out.println("Average: " + TotalAverage + "%");
        } else {
            System.out.println("No marks entered. No average to display.");
        }

        scanner.close(); //Close scanner properly at the end
    }
}