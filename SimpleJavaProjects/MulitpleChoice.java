package SimpleJavaProjects;
// This program is a simple multiple-choice quiz that asks the user five questions about the author's preferences and interests.
// It keeps track of the user's score and displays the total number of correct answers and the percentage of correct responses at the end.
import java.util.Scanner;

public class MulitpleChoice {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       //variables 
        int answerOne = 0;
        int answerTwo = 0;
        int answerThree = 0;
        int answerFour = 0;
        int answerFive = 0;
        int total = 0;	
       
        //question one  	
        System.out.println("What's my favourite colour:\n1. Red\n2. Blue\n3. Green\n4. Yellow");
        answerOne = in.nextInt();
        
        if (answerOne == 3)
        {
            System.out.println("Correct");
            total = total + 1;
        }
        else 
            System.out.println("Incorrect");
         //question Two 	
        System.out.println("How many siblings do I have:\n1. 1\n2. 2\n3. 3\n4. 4");
        answerTwo = in.nextInt();
        
        if (answerTwo == 4)
        {
            System.out.println("Correct");
            total = total + 1;
        }
        else 
            System.out.println("Incorrect");
          //question Three 	
        System.out.println("What game did play the most:\n1. wizard 101\n2. Halo\n3. Wii sports\n4. Minecraft");
        answerThree = in.nextInt();
        
        if (answerThree == 1)
        {
            System.out.println("Correct");
            total = total + 1;
        }
        else 
            System.out.println("Incorrect");
        
         //question Four
        System.out.println("What carrer am I trying to get into:\n1. Family Doctor\n2. Software Engineering\n3. Data Science\n4. Dentist");
        answerFour = in.nextInt();
        
        if (answerFour == 2)
        {
            System.out.println("Correct");
            total = total + 1;
        }
        else 
            System.out.println("Incorrect");
       
       //question Five 	
        System.out.println("Lastly, how many pets do i have and what type:\n1. 1 Dog\n2. 1 Cat\n3. 2 Dogs\n4. 2 Cats");
        answerFive = in.nextInt();
        
        if (answerFive == 4)
        {
            System.out.println("Correct");
            total = total + 1;
        }
        else 
            System.out.println("Incorrect");
            
       //prints the percentage and how much you got out of 5
        double percent = ((double)total / 5) * 100;
        System.out.println(total + " out of 5\nThat is " + percent + "%");
    in.close();
    }	
}
