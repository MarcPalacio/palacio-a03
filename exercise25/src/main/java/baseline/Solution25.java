/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution25 {
    public static void main(String[] args){
        // Calls askPassword to get user password
        // Runs passwordValidator to get an integer value representing strength
        // Compares integer value and prints out appropriate print statement based off strength
    }

    public String askPassword(String question){
        // Asks the user for a password (form of string) and returns it
        return "";
    }

    public int passwordValidator(String password){
        // Compares password to different checks to determine strength
        // if password contains only numbers and less than 8 characters
        //      return 1 (very weak)
        // if password contains only letters and less than 8 characters
        //      return 2 (weak)
        // if password contains letters and atleast one number and atleast 8 characters
        //      return 3 (strong)
        // if password contains letters and atleast one number and atleast 8 characters and atleast one special char
        //      return 4 (very strong)
        // if password doesn't fill out any of these requirements
        //      return 0 (unknown strength)
        return 0;
    }
}
