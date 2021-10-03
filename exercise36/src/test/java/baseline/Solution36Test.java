/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Solution36Test {
    @Test
    public void testAverage1(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 100.0, 200.0, 1000.0, 300.0);

        double expected = 400.0;
        double actual = app.average(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testMinimum1(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 100.0, 200.0, 1000.0, 300.0);

        double expected = 100.0;
        double actual = app.min(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testMaximum1(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 100.0, 200.0, 1000.0, 300.0);

        double expected = 1000.0;
        double actual = app.max(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testStandardDeviation1(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 100.0, 200.0, 1000.0, 300.0);

        double expected = 353.5533905932738;
        double actual = app.std(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testBuildOutput1(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 100.0, 200.0, 1000.0, 300.0);

        double average = 400.0;
        double minimum = 100.0;
        double maximum = 1000.0;
        double std = 353.5533905932738;

        String actual = app.buildOutput(list, average, maximum, minimum, std);
        // Since I am taking in doubles instead of ints, all the decimal places will be printed out
        String expected =
                "Numbers: 100.0, 200.0, 1000.0, 300.0\n" +
                        "The average is 400.0\n" +
                        "The minimum is 100.0\n" +
                        "The maximum is 1000.0\n" +
                        "The standard deviation is 353.5533905932738";

        assertEquals(expected, actual);
    }

    @Test
    public void testAverage2(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 24.2, 38.8, 12.0);

        double expected = 25.0;
        double actual = app.average(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testMinimum2(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 24.2, 38.8, 12.0);

        double expected = 12.0;
        double actual = app.min(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testMaximum2(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 24.2, 38.8, 12.0);

        double expected = 38.8;
        double actual = app.max(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testStandardDeviation2(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 24.2, 38.8, 12.0);

        double expected = 10.955668243729665;
        double actual = app.std(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testBuildOutput2(){
        Solution36 app = new Solution36();

        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 24.2, 38.8, 12.0);

        double average = 25.0;
        double minimum = 12.0;
        double maximum = 38.8;
        double std = 10.955668243729665;

        String actual = app.buildOutput(list, average, maximum, minimum, std);
        // Since I am taking in doubles instead of ints, all the decimal places will be printed out
        String expected =
                "Numbers: 24.2, 38.8, 12.0\n" +
                        "The average is 25.0\n" +
                        "The minimum is 12.0\n" +
                        "The maximum is 38.8\n" +
                        "The standard deviation is 10.955668243729665";

        assertEquals(expected, actual);
    }
}