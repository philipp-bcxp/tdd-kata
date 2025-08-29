package com.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersConverterTest {
    RomanNumbersConverter uut = new RomanNumbersConverter();

    @Test
    void convert1() {
        assertEquals("I", uut.convert(1));
    }

    @Test
    void convert3() {
        assertEquals("III", uut.convert(3));
    }

    @Test
    void convert4() {
       assertEquals("IV", uut.convert(4));
    }

    @Test
    void convert5() {
        assertEquals("V", uut.convert(5));
    }

    @Test
    void convert6() {
        assertEquals("VI", uut.convert(6));
    }

    @Test
    void convert8() {
        assertEquals("VIII", uut.convert(8));
    }

    @Test
    void convert9() {
        assertEquals("IX", uut.convert(9));
    }

    @Test
    void convert10() {
        assertEquals("X", uut.convert(10));
    }

    @Test
    void convert34() {
        assertEquals("XXXIV", uut.convert(34));
    }

    @Test
    void convert39() {
        assertEquals("XXXIX", uut.convert(39));
    }

    @Test
    void convert40() {
        assertEquals("XL", uut.convert(40));
    }

    @Test
    void convert49() {
        assertEquals("XLIX", uut.convert(49));
    }

    @Test
    void convert50() {
        assertEquals("L", uut.convert(50));
    }

    @Test
    void convert100() {
        assertEquals("C", uut.convert(100));
    }
}
