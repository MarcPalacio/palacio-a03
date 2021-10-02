/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {
    @Test
    public void testCalculateMonthsUntilPaidOff1(){
        PaymentCalculator payment = new PaymentCalculator(5000, 12, 100);
        int actual = payment.calculateMonthsUntilPaidOff();
        int expected = 70;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMonthsUntilPaidOff2(){
        PaymentCalculator payment = new PaymentCalculator(6900, 24, 420);
        int actual = payment.calculateMonthsUntilPaidOff();
        int expected = 21;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMonthsUntilPaidOff3(){
        PaymentCalculator payment = new PaymentCalculator(5113.927, 15, 175);
        int actual = payment.calculateMonthsUntilPaidOff();
        int expected = 37;

        assertEquals(expected, actual);
    }
}