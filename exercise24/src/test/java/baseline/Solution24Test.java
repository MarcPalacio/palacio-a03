/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    public void testIsAnagram1(){
        Solution24 app = new Solution24();
        String s1 = "note";
        String s2 = "tone";

        boolean testAnagramCheck = app.isAnagram(s1, s2);

        assertTrue(testAnagramCheck);
    }

    @Test
    public void testIsAnagram2(){
        Solution24 app = new Solution24();
        String s1 = "I am Lord Voldemort";
        String s2 = "Tom Marvolo Riddle";

        boolean testAnagramCheck = app.isAnagram(s1, s2);

        assertTrue(testAnagramCheck);
    }

    @Test
    public void testIsAnagram3(){
        Solution24 app = new Solution24();
        String s1 = "Belli dura despicio";
        String s2 = "Belli dura despacito";

        boolean testAnagram1Check = app.isAnagram(s1, s2);

        assertFalse(testAnagram1Check);
    }

    @Test
    public void testFormatArrayList1() {
        Solution24 app = new Solution24();
        String s1 = "note";

        ArrayList<Character> expected = new ArrayList<>();
        expected.add('e');
        expected.add('n');
        expected.add('o');
        expected.add('t');
        ArrayList<Character> actual = app.formatArrayList(s1);

        assertEquals(expected, actual);
    }

    @Test
    public void testFormatArrayList2() {
        Solution24 app = new Solution24();
        String s1 = "Potato";

        ArrayList<Character> expected = new ArrayList<>();
        expected.add('a');
        expected.add('o');
        expected.add('o');
        expected.add('p');
        expected.add('t');
        expected.add('t');
        ArrayList<Character> actual = app.formatArrayList(s1);

        assertEquals(expected, actual);
    }


}