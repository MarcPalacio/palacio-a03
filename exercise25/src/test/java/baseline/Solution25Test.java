/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    public void testPasswordValidator1(){
        Solution25 app = new Solution25();
        String password = "12345";

        int strengthExpected = 1;
        int strengthActual = app.passwordValidator(password);

        assertEquals(strengthExpected, strengthActual);
    }

    @Test
    public void testPasswordValidator2(){
        Solution25 app = new Solution25();
        String password = "abcdef";

        int strengthExpected = 2;
        int strengthActual = app.passwordValidator(password);

        assertEquals(strengthExpected, strengthActual);
    }

    @Test
    public void testPasswordValidator3(){
        Solution25 app = new Solution25();
        String password = "abc123xyz";

        int strengthExpected = 3;
        int strengthActual = app.passwordValidator(password);

        assertEquals(strengthExpected, strengthActual);
    }

    @Test
    public void testPasswordValidator4(){
        Solution25 app = new Solution25();
        String password = "1337h@xor!";

        int strengthExpected = 4;
        int strengthActual = app.passwordValidator(password);

        assertEquals(strengthExpected, strengthActual);
    }

    @Test
    public void testPasswordValidator5(){
        Solution25 app = new Solution25();
        String password = "abc123!";

        int strengthExpected = 0;
        int strengthActual = app.passwordValidator(password);

        assertEquals(strengthExpected, strengthActual);
    }
}