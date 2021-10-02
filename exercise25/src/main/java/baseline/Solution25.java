/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;
import java.util.regex.*;

public class Solution25 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution25 solution = new Solution25();
        // Calls askPassword to get user password
        String password = solution.askPassword("Enter a password to determine it's strength: ");
        // Runs passwordValidator to get an integer value representing strength
        int pwStrength = solution.passwordValidator(password);
        // Compares integer value and prints out appropriate print statement based off strength
        solution.printOutput(password, pwStrength);
    }

    private String askPassword(String question){
        // Asks the user for a password (form of string) and returns it
        System.out.print(question);
        return in.nextLine();
    }

    public int passwordValidator(String password){
        // Compares password to different checks to determine strength
        if(Pattern.matches("\\d{1,7}", password)){
            // if password contains only numbers and less than 8 characters
            //      return 1 (very weak)
            return 1;
        }
        else if(Pattern.matches("[a-zA-Z]{1,7}", password)){
            // if password contains only letters and less than 8 characters
            //      return 2 (weak)
            return 2;
        }
        else if(Pattern.matches("\\w{8,}", password)){
            // if password contains letters and atleast one number and atleast 8 characters
            //      return 3 (strong)
            return 3;
        }
        else if(Pattern.matches("[a-zA-Z_0-9\\W]{8,}", password)){
            // if password contains letters and atleast one number and atleast 8 characters and atleast one special char
            //      return 4 (very strong)
            return 4;
        }
        // if password doesn't fill out any of these requirements
        //      return 0 (unknown strength)
        return 0;
    }

    private void printOutput(String password, int pwStrength){
        // Prints a statement depending on the password strength
        switch(pwStrength){
            case 1:
                // Case 1 will print very weak
                System.out.print("The password '" + password + "' is a very weak password.");
                break;
            case 2:
                // Case 2 will print weak
                System.out.print("The password '" + password + "' is a weak password.");
                break;
            case 3:
                // Case 3 will print strong
                System.out.print("The password '" + password + "' is a strong password.");
                break;
            case 4:
                // Case 4 will print very strong
                System.out.print("The password '" + password + "' is a very strong password.");
                break;
            default:
                // Default case will print unknown strength
                System.out.print("The password '" + password + "' is of unknown strength.");
                break;
        }
    }
}
