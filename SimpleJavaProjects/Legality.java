package SimpleJavaProjects;
//this is a simple Java program that determines what legal activities a user can engage in based on their age.
// It prompts the user for their name and age, then checks the age against various legal age thresholds for driving, voting, and renting a car, and outputs the appropriate messages.

import java.util.Scanner;

public class Legality {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
       //variables
        int age = 0;
        String name;
       
       //assigns the varible	
        System.out.println("What's your name:");
        name = in.nextLine();
        System.out.println("Ok, " + name + ", how old are you");
        age = in.nextInt();

        // these if statements run telling what you can’t or can do
        if (age < 16)
		    System.out.println("You can't drive");
        if (age < 18)
		    System.out.println("You can't vote");
        if (age < 25)
		    System.out.println("You can't rent a car");	
        if (age >= 25)
            System.out.println("You can do anything that's legal");
        in.close();
    }	

}
