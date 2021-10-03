/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    @Test
    public void testBuildTable1(){
        Solution31 app = new Solution31();

        String actual = app.buildTable(65, 22);
        String expected =
                "Resting Pulse: 65        Age: 22\n" +
                "\n" +
                "Intensity    | Rate\n" +
                "-------------|--------\n" +
                "55%          | 138 bpm\n" +
                "60%          | 145 bpm\n" +
                "65%          | 151 bpm\n" +
                "70%          | 158 bpm\n" +
                "75%          | 165 bpm\n" +
                "80%          | 171 bpm\n" +
                "85%          | 178 bpm\n" +
                "90%          | 185 bpm\n" +
                "95%          | 191 bpm";

        assertEquals(expected, actual);
    }

    @Test
    public void testBuildTable2(){
        Solution31 app = new Solution31();

        String actual = app.buildTable(57, 21);
        String expected =
                "Resting Pulse: 57        Age: 21\n" +
                        "\n" +
                        "Intensity    | Rate\n" +
                        "-------------|--------\n" +
                        "55%          | 135 bpm\n" +
                        "60%          | 142 bpm\n" +
                        "65%          | 149 bpm\n" +
                        "70%          | 156 bpm\n" +
                        "75%          | 164 bpm\n" +
                        "80%          | 171 bpm\n" +
                        "85%          | 178 bpm\n" +
                        "90%          | 185 bpm\n" +
                        "95%          | 192 bpm";

        assertEquals(expected, actual);
    }
}