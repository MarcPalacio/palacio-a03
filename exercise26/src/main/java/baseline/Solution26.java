/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution26 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        // Calls askNumber to ask the user for various things to calculate number of months to pay credit card such as
        // APR, balance, and how much can be paid per month
        // Creates an instance of the PaymentCalculator class
        // Calls the calculateMonthsUntilPaidOff method from the PaymentCalculator class
        Solution26 solution = new Solution26();
        double balance = solution.askNumber("What is your balance? ");
        double roundedBalance = Math.ceil(balance * 100.0) / 100.0; // Rounds up to the nearest cent
        double APR = solution.askNumber("What is the APR on the card (as a percent)? ");
        double monthlyPayment = solution.askNumber("What is the monthly payment you can make? ");
        double roundedMonthlyPayment = Math.ceil(monthlyPayment * 100.0) / 100.0; // Rounds up to the nearest cent

        PaymentCalculator calculator = new PaymentCalculator(roundedBalance, APR, roundedMonthlyPayment);
        int numMonths = calculator.calculateMonthsUntilPaidOff();
        System.out.println("It will take you " + numMonths + " months to pay off this card.");
    }

    private double askNumber(String question){
        // Asks the user for a number (double)
        // Will use exception handling to catch if the user put in a string
        // Throw error and ask the user to input a number
        double output = 0;
        boolean invalidInput = true;
        do{
            invalidInput = false;
            try{
                do{
                    System.out.print(question);
                    output = in.nextDouble();
                }while(output < 0);
            }catch(InputMismatchException e){ // Checks the input to see if it is valid or not
                invalidInput = true;
                in.nextLine();
                System.out.println("Invalid input. Please enter a valid input.");
            }
        }while(invalidInput); // Loop while the input is invalid
        return output;
    }
}
