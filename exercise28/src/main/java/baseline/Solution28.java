/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution28 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Solution28 solution = new Solution28();
        int[] array = new int[5];

        // Asks the user for 5 integers
        // calls the askNum method
        // Stores each of the numbers into the corresponding index
        // Increment the array index by 1
        for(int i = 0; i < array.length; i++)
            array[i] = solution.askNum("Enter a number: ");

        // calls the calculateTotal method
        // Print out the total based off the calculateTotal method
        int total = solution.calculateTotal(array);
        System.out.println("The total is " + total + ".");
    }

    private int askNum(String question){
        // Asks the user for a number (double)
        // Will use exception handling to catch if the user put in a string
        // Throw error and ask the user to input a number
        int output = 0;
        boolean invalidInput = true;
        do{
            invalidInput = false;
            try{
                do{
                    System.out.print(question);
                    output = in.nextInt();
                }while(output < 0);
            }catch(InputMismatchException e){ // Checks the input to see if it is valid or not
                invalidInput = true;
                in.nextLine();
                System.out.println("Invalid input. Please enter a valid input.");
            }
        }while(invalidInput); // Loop while the input is invalid
        return output;
    }

    public int calculateTotal(int[] array){
        int total = 0;

        // Takes in the array and loop through it, adding all elements in the array
        for(int i = 0; i < array.length; i++)
            total += array[i];
        return total;
    }
}