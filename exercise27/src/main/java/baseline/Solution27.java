/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;
import java.util.regex.*;

public class Solution27 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        // Ask the user for 5 inputs
        // First name, last name, employee ID, and zipcode
        // Passes those variables to the validateInput function
        // Prints out the output from the validateInput function
        Solution27 solution = new Solution27();
        String firstName = solution.askString("Enter the first name: ");
        String lastName = solution.askString("Enter the last name: ");
        String zipcode = solution.askString("Enter the ZIP code: ");
        String employeeID = solution.askString("Enter the employee ID: ");
        String validate = solution.validateInput(firstName, lastName, zipcode, employeeID);
        System.out.println(validate);
    }

    private String askString(String question){
        // Asks the user for a password (form of string) and returns it
        System.out.print(question);
        return in.nextLine();
    }

    private String validateFirstName(String name){
        // Takes in the first name as a parameter
        StringBuilder string = new StringBuilder();
        // if length of the name is less than two characters
        //      add the output statement must be at least 2 characters
        //      if the length of the name equals zero
        //          add the output statement that the name must be filled it
        if(name.length() < 2){
            string.append("The first name must be at least 2 characters long.\n");
            if(name.length() == 0){
                string.append("The first name must be filled in.\n");
            }
        }
        // return output statement
        return string.toString();
    }

    private String validateLastName(String name){
        // Takes in the last name as a parameter
        StringBuilder string = new StringBuilder();
        // if length of the name is less than two characters
        //      add the output statement must be at least 2 characters
        //      if the length of the name equals zero
        //          add the output statement that the name must be filled it
        if(name.length() < 2){
            string.append("The last name must be at least 2 characters long.\n");
            if(name.length() == 0){
                string.append("The last name must be filled in.\n");
            }
        }
        // return output statement
        return string.toString();
    }

    private String validateZipcode(String zipcode){
        // Takes in the zipcode as a parameter
        StringBuilder string = new StringBuilder();
        // if the zipcode's length is less than or greater than five
        //      add the output statement that the zipcode must be a 5 digit numbers
        if(!(Pattern.matches("\\d{5}", zipcode))){
            string.append("The zipcode must be a 5 digit number.\n");
        }
        // return output statement
        return string.toString();
    }

    private String validateID(String ID){
        // Takes in the ID as a parameter
        StringBuilder string = new StringBuilder();
        // if the ID doesn't follow the format (2 leters, a hyphen, followed by 4 numbers)
        //      add the output statement that the employee ID must be in a specific format
        String regex = "\\w{2}[-]{1}\\d{4}";
        if(!(Pattern.matches(regex, ID))){
            string.append("The employee ID must be in the format of AA-1234.\n");
        }
        // return output statement
        return string.toString();
    }

    public String validateInput(String firstName, String lastName, String zipcode, String ID){
        StringBuilder string = new StringBuilder();
        // Calls validateFirstName function and adds it to the output string (regardless of adding something or not)
        string.append(validateFirstName(firstName));
        // Calls validateLastName function and adds it to the output string (regardless of adding something or not)
        string.append(validateLastName(lastName));
        // Calls validateID function and adds it to the output string (regardless of adding something or not)
        string.append(validateID(ID));
        // Calls validateZipcode function and adds it to the output string (regardless of adding something or not)
        string.append(validateZipcode(zipcode));
        // if the output string contains nothing in it
        //      set the output to that no errors were present
        if(string.length() == 0){
            string.append("There were no errors found.");
        }
        // Returns the output statement;
        return string.toString();
    }

}
