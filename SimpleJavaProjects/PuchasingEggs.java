package SimpleJavaProjects;
//this is a simple Java program that calculates the cost of purchasing eggs based on the number of eggs needed. It determines the cost per dozen and for any extra eggs, then outputs the total cost.
// It prompts the user to enter the number of eggs they need, calculates the cost based on predefined price ranges for dozens and extra eggs, and then displays the total cost in dollars.

import java.util.Scanner;

public class PuchasingEggs {
    public static void main(String[] args) {
		
		//variables 
		Scanner in = new Scanner(System.in);
		int eggs = 0;
		double cost = 0;
		double Total = 0;

		//find out how many dozen and eggs left
		System.out.println("How many eggs do you need?");
		eggs = in.nextInt();
		int eggsLeft = eggs % 12;
		
		//this if statement will find out how much dozens 
		if (eggs - eggsLeft <= 36)
			cost = 0.5 * (eggs - eggsLeft);
		else if (eggs - eggsLeft >= 45 && eggs - eggsLeft <= 60)
			cost = 0.45 * (eggs - eggsLeft);
		else if (eggs - eggsLeft >= 72 && eggs - eggsLeft <= 120)
			cost = 0.35 * (eggs - eggsLeft);
		else if (eggs - eggsLeft > 121)
			cost = 0.25 * (eggs - eggsLeft);
				
        //this if statement will find out how much extra
		if (eggsLeft <= 3)
			Total = (0.5 * eggsLeft) + cost;
		else if (eggsLeft >= 4 && eggsLeft <= 5)
			Total = (0.45 * eggsLeft) + cost;
		else if (eggsLeft >= 6 && eggsLeft <= 10)
			Total = (0.35 * eggsLeft) + cost;
		else if (eggsLeft > 11)
			Total = (0.25 * eggsLeft) + cost;		
		//prints total
		System.out.println("Total cost is: $ "+ Total / 12);
        in.close();
	}	

}
