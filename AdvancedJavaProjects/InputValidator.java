// This code is part of the AdvancedProjects package
// It contains a class that validates user input to ensure it is an integer.

package AdvancedJavaProjects;
import java.util.Scanner;

public class InputValidator {

    // Function to check if the user input is an integer
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isValid = false;
        
        // Keep asking for input until the user enters an integer
        while (!isValid) {
            System.out.println("Please enter a number: ");
            
            // Try to parse the input as an integer
            try {
                num = Integer.parseInt(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid integer. Please try again.");
            }
        }
        scanner.close();
        // Return the valid integer input
        return num;
    }

    // Driver function to test the getInput function
    public static void main(String[] args) {
        int userInput = getInput();
        System.out.println("You entered the integer: " + userInput);
    }
}
