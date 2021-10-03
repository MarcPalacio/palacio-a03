/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution31 {
    public static void main(String[] args){
        // asks the user for two integers (resting heart rate and age)
        // passes two integers to buildTable which returns a string
        // print out the string that buildTable returns
    }

    public int askNum(String question){
        // Asks the user for an int
        // if the input is not an int
        //      Tell the user the input is invalid and allow them to insert another input
        return 0;
    }

    public int calculateTargetHeartRate(int restingHR, int age, int intenseity){
        // converts intensity to a decimal
        // calculates and return the target heart rate
        // Formula: TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        // *Calculate as a double, then round it accordingly
        return 0;
    }

    public String buildTable(int restingHR, int age){
        // Create StringBuilder
        // add header of table
        // every 5% increments of intensity (starting from 55% ending at 95% inclusive)
        // call calulateTargetHeartRate to print the line of data with the corresponding intensity
        // return the string
        return "";
    }
}