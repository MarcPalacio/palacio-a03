/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution29 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution29 solution = new Solution29();
        // calls the askNum method
        double rate = solution.askNum("What is the rate of return? ");
        // calls the calculateYears method
        int years = (int)solution.calculateYears(rate);
        // Prints out how many years it will take to double the investment
        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    private double askNum(String question){
        // Asks the user for a number (int)
        // if the user puts an invalid input
        //      program will throw an exception and continue to ask the user for input
        //      until the user enters a valid number
        double output = 0;
        boolean invalidInput = true;
        do{
            invalidInput = false;
            try{
                do{
                    System.out.print(question);
                    output = in.nextInt();
                    if(output == 0)
                        System.out.println("Sorry. That's not a valid input.");
                }while(output <= 0);
            }catch(InputMismatchException e){ // Checks the input to see if it is valid or not
                invalidInput = true;
                in.nextLine();
                System.out.println("Sorry. That's not a valid input.");
            }
        }while(invalidInput); // Loop while the input is invalid
        return output;
    }

    public double calculateYears(double rate){
        // return 72 divided by the rate to calculate the amount of years
        // Rounds the years up so it isn't 1.293 years
        return Math.ceil(72/rate);
    }
}
