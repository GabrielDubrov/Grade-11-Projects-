package SimpleJavaProjects;
//this is a simple Java program that calculates the cost of a pizza based on its diameter.
// It prompts the user to enter the diameter in inches and then calculates the total cost using a formula that includes a base cost and a variable cost based on the area of the pizza.
// The total cost is then displayed to the user.

import java.util.Scanner;
public class PizzaCalculation {
    public static void main(String[] args) {
        //variables
        Double diameter,cost;

        Scanner in = new Scanner(System.in);
        
        //enters diameter
        System.out.println("Please enter your diameter in inches: ");
        diameter = in.nextDouble();
        //finds total cost
        cost = diameter * diameter * 0.05 + 1.75;
        //print total cost 
        System.out.println("Total Cost: $" + cost);
        in.close();
    }

}
