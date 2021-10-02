/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    public void testCalculateTotal1(){
        Solution28 app = new Solution28();
        int[] array = new int[]{1,2,3,4,5};

        int actual = app.calculateTotal(array);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotal2(){
        Solution28 app = new Solution28();
        int[] array = new int[]{1,3,5,7,9};

        int actual = app.calculateTotal(array);
        int expected = 25;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotal3(){
        Solution28 app = new Solution28();
        int[] array = new int[]{2,4,6,8,10};

        int actual = app.calculateTotal(array);
        int expected = 30;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotal4(){
        Solution28 app = new Solution28();
        int[] array = new int[]{-1,-2,-3,-4,-5};

        int actual = app.calculateTotal(array);
        int expected = -15;

        assertEquals(expected, actual);
    }
}