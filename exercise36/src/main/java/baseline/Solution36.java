/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution36 {
    public static void main(String[] args[]){
        // Initialize arraylist of doubles
        // do while the input isn't done
        //      Calls askNumber
        //      if askNumber does not equal done
        //          convert the string to a double (parseDouble)
        //          add the element to the arrayList
        //      else if askNumber does equal done
        //      end the loop
        //  calls average which will return the average between all the numbers in the arrayList
        //  calls max which will return the max value in the arrayList
        //  calls min which will return the lowest value in the arrayList
        //  calls std which will return the standard deviation of the arrayList
        //  calls the buildOutput which will print the results from each calculations
    }

    private String askNumber(String question){
        // Prompts the user with the question of asking for a number
        // if the string equals done
        //      return done
        // else
        //      convert the string to a double
        //      run exception handling and verify that the string
        //      loop through until the user inputs a valid input
        //      return the string
        return "";
    }

    private double average(ArrayList<Double> list){
        // calculates the average of the arrayList
        // Sum of all elements / number of elements
        return 0;
    }

    private double max(ArrayList<Double> list){
        // returns the highest value in the arrayList
        return 0;
    }

    private double min(ArrayList<Double> list){
        // returns the lowest value in the arrayList
        return 0;
    }

    private double std(ArrayList<Double> list){
        // returns the standard deviation of the arrayList
        // Standard Deviation equals
        // The square root of the sum of the difference of each element minus the average squared
        // divided by the number of elements minus 1
        return 0;
    }

    public String buildOutput(double average, double max, double min, double std){
        // Builds the output string
        return "";
    }
}
