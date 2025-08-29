package com.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersConverterTest {
    RomanNumbersConverter uut = new RomanNumbersConverter();

    @Test
    void convert1() {
        assertEquals("I", uut.convert(1));
    }
}
