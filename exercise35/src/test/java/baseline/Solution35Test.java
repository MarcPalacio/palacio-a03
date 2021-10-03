/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Solution35Test {
    @Test
    public void testRandomNum1(){
        Solution35 app = new Solution35();
        ArrayList<String> names = new ArrayList<>();
        names.add("Homer");
        names.add("Bart");
        names.add("Maggie");
        names.add("Lisa");
        names.add("Moe");

        // Tests to see if the random number generator will generate values within the range
        // If it doesn't, it will turn false and fail the case
        boolean actual = true;
        for(int i = 0; i < 100; i++){
            int num = app.randomNum(names);
            if(num > names.size()){
                actual = false;
            }
        }
        assertTrue(actual);
    }

    @Test
    public void testRandomNum2(){
        Solution35 app = new Solution35();
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Sol", "Ky", "May", "Axl", "Chipp", "Potemkin", "Faust",
                "Millia", "Zato", "Ramlethal", "Leo", "Nagoriyuki", "Giovanna", "Anji", "I-No",
                "Goldlewis", "Jack-O'");

        // A bigger list is used, so more cases to ensure that the values are within the range
        boolean actual = true;
        for(int i = 0; i < 1000; i++){
            int num = app.randomNum(names);
            if(num > names.size()){
                actual = false;
            }
        }
        assertTrue(actual);
    }
}