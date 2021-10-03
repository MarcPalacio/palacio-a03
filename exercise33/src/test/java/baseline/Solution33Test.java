/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution33Test {
    // Basically tests if the random number generator is generating results within the range
    // However if it returns a number that isn't one of the 4 numbers in the range (0,3)
    // Then it will print false.
    @Test
    public void testRandomNum(){
        Solution33 app = new Solution33();

        boolean actual = true;
        for(int i = 0; i < 100; i++){
            int num = app.randomNum();
            if(!(num == 0 || num == 1 || num == 2 || num == 3)){
                actual = false;
            }
        }
        assertTrue(actual);
    }
}