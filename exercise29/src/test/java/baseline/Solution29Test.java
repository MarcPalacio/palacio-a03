/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    public void testCalculateYears1(){
        Solution29 app = new Solution29();
        double rate = 4;

        int actual = (int)app.calculateYears(rate);
        int expected = 18;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateYears2(){
        Solution29 app = new Solution29();
        double rate = 5;

        int actual = (int)app.calculateYears(rate);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateYears3(){
        Solution29 app = new Solution29();
        double rate = 4.2;

        int actual = (int)app.calculateYears(rate);
        int expected = 18;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateYears4(){
        Solution29 app = new Solution29();
        double rate = 7.25;

        int actual = (int)app.calculateYears(rate);
        int expected = 10;

        assertEquals(expected, actual);
    }
}