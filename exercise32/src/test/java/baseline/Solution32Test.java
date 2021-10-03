/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */
package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Solution32Test {
    @Test
    public void testGetRange1(){
        Solution32 app = new Solution32();

        int expected = 10;
        int actual = app.getRange(1);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetRange2(){
        Solution32 app = new Solution32();

        int expected = 100;
        int actual = app.getRange(2);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetRange3(){
        Solution32 app = new Solution32();

        int expected = 1000;
        int actual = app.getRange(3);

        assertEquals(expected, actual);
    }
}