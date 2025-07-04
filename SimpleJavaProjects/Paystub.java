package SimpleJavaProjects;
//this is a simple Java program that calculates a paystub based on user input for hourly wage and hours worked, including deductions for CPP, EI, federal and provincial taxes.
// It prompts the user for their name, calculates gross earnings, deductions, and net pay, and then displays a formatted paystub with all relevant information.
import java.util.Scanner;
public class Paystub {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double hourlyRate = 0;
        double hoursWorked = 0;
        double grossEarnings = 0;
        double yearlySalary = 0;
        double cpp = 0;
        double ei = 0;
        double federalTaxRate = 0;
        double federalTax = 0;
        double provincialTaxRate = 0;
        double provincialTax = 0;
        double totalDeductions = 0;
        double Total = 0;
        
        // Taking input from the user
        System.out.println("Please Enter your name:");
        String name = in.nextLine();

        System.out.println("Please Enter your hourly wage:");
        hourlyRate = in.nextDouble();

        System.out.println("Please Enter your hours worked:");
        hoursWorked = in.nextDouble();

        // Calculate gross earnings
        grossEarnings = hourlyRate * hoursWorked;
        yearlySalary = grossEarnings * 52; // Assuming 52 weeks in a year

        // Deductions
        cpp = grossEarnings * 0.0495; // Canada Pension Plan deduction (4.95%)
        ei = grossEarnings * 0.0188;  // Employment Insurance deduction (1.88%)

        // Federal Income Tax calculation based on yearly salary
        if (yearlySalary <= 45282) 
            federalTaxRate = 0.15;
        else if (yearlySalary <= 90563) 
            federalTaxRate = 0.205;
        else if (yearlySalary <= 140388) 
            federalTaxRate = 0.26;
        else if (yearlySalary <= 200000) 
            federalTaxRate = 0.29;
        else
            federalTaxRate = 0.33;
    
        federalTax = grossEarnings * federalTaxRate;

        // Provincial Income Tax calculation based on yearly salary
        if (yearlySalary <= 41536) 
            provincialTaxRate = 0.0505;
        else if (yearlySalary <= 83075) 
            provincialTaxRate = 0.0915;
        else if (yearlySalary <= 149000) 
            provincialTaxRate = 0.1116;
        else if (yearlySalary <= 220000) 
            provincialTaxRate = 0.1216;
        else 
            provincialTaxRate = 0.1316;
        
        provincialTax = grossEarnings * provincialTaxRate;

        // Total deductions and net pay
        totalDeductions = cpp + ei + federalTax + provincialTax;
        Total = grossEarnings - totalDeductions;

        // Output the paystub
        System.out.println("\nName: " + name);
        System.out.printf("Gross\tC.P.P\tE.I.\t\t\tFederal\t\tProvincial\tTotal");
        System.out.println("\n---------------------------------------------------------------");
        System.out.printf(grossEarnings + "\t" + cpp + "\t" + ei + "\t" + federalTax + "\t\t" + provincialTax + "\t\t" + Total);
        System.out.println("\n---------------------------------------------------------------");
        System.out.printf("Net Pay: %.2f", Total);
        in.close();
    }
}
