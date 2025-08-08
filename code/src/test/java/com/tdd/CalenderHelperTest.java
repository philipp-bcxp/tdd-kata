package com.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalenderHelperTest {
 /*
  * A leap year is defined as one that is divisible by 4,
     but is not otherwise divisible by 100 unless it is also divisible by 400.
For example, 2001 is a typical common year and 1996 is a typical leap year, whereas 1900 is an atypical common year and 2000 is an atypical leap year.
  */

    CalenderHelper uut = new CalenderHelper();

    @Test
    void typicalCommonYear() {
        assertFalse(uut.isLeapYear(2001));
    }

    @Test
    void typicalLeapYear() {
        assertTrue(uut.isLeapYear(1996));
    }

    @Test
    void atypicalCommonYear() {
        assertFalse(uut.isLeapYear(1900));
    }

    @Test
    void atypicalLeapYear() {
        assertTrue(uut.isLeapYear(2000));
    }
    @Test
    void threeShouldNotBeLeapYear() {
        assertFalse(uut.isLeapYear(3));
    }

    @Test
    void fourShouldBeLeapYear() {
        assertTrue(uut.isLeapYear(4));
    }

    @Test
    void divisibleBy100NotLeapYear() {
       assertFalse(uut.isLeapYear(100));
    }

    @Test
    void divisibleBy100And400LeapYear() {
        assertTrue(uut.isLeapYear(400));
    }

}
