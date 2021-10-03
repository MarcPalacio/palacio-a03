/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Solution34Test {
    @Test
    public void testRemoveName1(){
        Solution34 app = new Solution34();

        ArrayList<String> listEmployees = new ArrayList<>();
        listEmployees.add("John Smith");
        listEmployees.add("Jackie Johnson");
        listEmployees.add("Chris Jones");
        listEmployees.add("Amanda Cullen");
        listEmployees.add("Jeremy Goodwin");

        ArrayList<String> actual = app.removeName(listEmployees, "John Smith");
        ArrayList<String> expected = listEmployees;
        expected.remove("John Smith");

        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveName2(){
        Solution34 app = new Solution34();

        ArrayList<String> listEmployees = new ArrayList<>();
        listEmployees.add("John Smith");
        listEmployees.add("Jackie Johnson");
        listEmployees.add("Chris Jones");
        listEmployees.add("Amanda Cullen");
        listEmployees.add("Jeremy Goodwin");

        ArrayList<String> actual = app.removeName(listEmployees, "Marc Palacio");
        ArrayList<String> expected = listEmployees;

        assertEquals(expected, actual);
    }
}