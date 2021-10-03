/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */
package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Solution27Test {
    // This is so I don't have to copy and paste which validations are needed for which test case
    // Also made sure they are final so they cannot be modified
    private static final String validateFName1 = "The first name must be at least 2 characters long.\n";
    private static final String validateFName2 = "The first name must be filled in.\n";
    private static final String validateLName1 = "The last name must be at least 2 characters long.\n";
    private static final String validateLName2 = "The last name must be filled in.\n";
    private static final String validateEID = "The employee ID must be in the format of AA-1234.\n";
    private static final String validateZipcode = "The zipcode must be a 5 digit number.\n";
    private static final String validInput = "There were no errors found.";

    @Test
    public void testValidateInput1(){
        Solution27 app = new Solution27();
        Solution27Test solution = new Solution27Test();
        String actual = app.validateInput("J", "", "ABCDE", "A12-1234");

        StringBuilder string = new StringBuilder();
        string.append(solution.validateFName1);
        string.append(solution.validateLName1);
        string.append(solution.validateLName2);
        string.append(solution.validateEID);
        string.append(solution.validateZipcode);
        String expected = string.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testValidateInput2(){
        Solution27 app = new Solution27();
        Solution27Test solution = new Solution27Test();
        String actual = app.validateInput("Marc", "Palacio", "12345", "DB-0316");

        String expected = solution.validInput;

        assertEquals(expected, actual);
    }

    @Test
    public void testValidateInput3(){
        Solution27 app = new Solution27();
        Solution27Test solution = new Solution27Test();
        String actual = app.validateInput("", "", "ABCDE", "A12-1234");

        StringBuilder string = new StringBuilder();
        string.append(solution.validateFName1);
        string.append(solution.validateFName2);
        string.append(solution.validateLName1);
        string.append(solution.validateLName2);
        string.append(solution.validateEID);
        string.append(solution.validateZipcode);
        String expected = string.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testValidateInput4(){
        Solution27 app = new Solution27();
        Solution27Test solution = new Solution27Test();
        String actual = app.validateInput("Marc", "Palacio", "ABCDE", "A12-1234");

        StringBuilder string = new StringBuilder();
        string.append(solution.validateEID);
        string.append(solution.validateZipcode);
        String expected = string.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testValidateInput5(){
        Solution27 app = new Solution27();
        Solution27Test solution = new Solution27Test();
        String actual = app.validateInput("", "", "12345", "DB-0316");

        StringBuilder string = new StringBuilder();
        string.append(solution.validateFName1);
        string.append(solution.validateFName2);
        string.append(solution.validateLName1);
        string.append(solution.validateLName2);
        String expected = string.toString();

        assertEquals(expected, actual);
    }
}
