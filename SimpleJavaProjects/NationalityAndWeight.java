package SimpleJavaProjects;
//This program collects a user's nationality and weight, then calculates and displays what their weight would be if they were 20 pounds lighter or heavier.

import java.util.Scanner;
public class NationalityAndWeight {
public static void main(String[] args) 
   {
        //variables
        int weight,lighter,heavier;
        String nationality;
        
        Scanner in = new Scanner(System.in);
        
        //input nationality
        System.out.println("Please enter your nationality: ");
        nationality = in.nextLine();
        //input weight 
        System.out.println("Please enter your weight (in pounds): ");
        weight = in.nextInt();
        //math for if they were 20 pound heavier and lighter
        lighter = weight - 20;
        heavier = weight + 20;
        //output the results
        System.out.println("Your nationality is " + nationality);
        System.out.println("Your weight if you were lighter: " + lighter);
        System.out.println("Your weight if you were heavier: " + heavier);
        in.close();
    }
}

