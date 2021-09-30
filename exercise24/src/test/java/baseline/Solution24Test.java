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
    public void testIsAnagram4(){
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

        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('o');
        list1.add('o');
        list1.add('p');
        list1.add('t');
        list1.add('t');
        list1.add('s');
        ArrayList<Character> list2 = app.formatArrayList(s1);

        assertFalse(list1.equals(list2));
    }


}