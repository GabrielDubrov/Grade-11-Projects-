package SimpleJavaProjects;
//this program calculates the Body Mass Index (BMI) based on user input for weight and height, and categorizes the BMI into different health categories.
// It prompts the user to enter their weight in kilograms and height in meters, calculates the BMI, and then determines the BMI category (underweight, normal weight, overweight, or obese) based on the calculated value.
// It then displays the BMI value and the corresponding category to the user.
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        
        //variables + scanner
        Scanner in = new Scanner(System.in);
        int weight = 0;
        double height = 0;
        double BMI = 0;

        // assigns those variables 	
        System.out.println("How much do you weight in kilograms: ");
        weight = in.nextInt();
        System.out.println("How tall are you in meters: ");
        height = in.nextDouble();
	
        //finds what your BMI is
        BMI = weight / (height * height);
        System.out.println("Your BMI: " + BMI);

        //finds what category you are based on your BMI
        if (BMI <18)
		    System.out.println("BMI Category: underweight");
        else if (BMI >= 18 && BMI <= 25)
		    System.out.println("BMI Category: normal weight");
        else if (BMI >= 26 && BMI <= 30)
		    System.out.println("BMI Category: overweight");	
        else if (BMI > 31)
            System.out.println("BMI Category: obese");
        in.close();
    }
}
