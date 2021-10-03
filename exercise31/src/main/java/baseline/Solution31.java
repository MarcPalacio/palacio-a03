/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution31 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution31 solution = new Solution31();
        // asks the user for two integers (resting heart rate and age)
        int restingHeartRate = solution.askNum("What is the resting heart rate? ");
        int age = solution.askNum("What is the age? ");
        // passes two integers to buildTable which returns a string
        String table = solution.buildTable(restingHeartRate, age);
        // print out the string that buildTable returns
        System.out.println(table);
    }

    private int askNum(String question){
        // Asks the user for an int
        // if the input is not an int
        //      Tell the user the input is invalid and allow them to insert another input
        int output = 0;
        boolean invalidInput = true;
        do{
            invalidInput = false;
            try{
                do{
                    System.out.print(question);
                    output = in.nextInt();
                    if(output <= 0)
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

    private int calculateTargetHeartRate(int restingHR, int age, int intensity){
        // converts intensity to a decimal
        double intensityDeci = (double)intensity/100;
        // calculates and return the target heart rate
        // Formula: TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        // *Calculate as a double, then round it accordingly
        return (int)Math.round((((220 - age) - restingHR) * intensityDeci) + restingHR);
    }

    public String buildTable(int restingHR, int age){
        // Create StringBuilder
        StringBuilder string = new StringBuilder();
        // add header of table
        string.append("Resting Pulse: " + restingHR);
        string.append("        Age: " + age + "\n\n");
        string.append("Intensity    | Rate\n");
        string.append("-------------|--------\n");
        // every 5% increments of intensity (starting from 55% ending at 95% inclusive)
        for(int i = 55; i <= 95; i += 5){
            // call calulateTargetHeartRate to print the line of data with the corresponding intensity
            int bpm = calculateTargetHeartRate(restingHR, age, i);
            string.append(i + "%          | " + bpm + " bpm");
            if(i != 95){
                string.append("\n");
            }
        }

        // return the string
        return string.toString();
    }
}