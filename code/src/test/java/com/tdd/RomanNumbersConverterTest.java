package com.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersConverterTest {
    RomanNumbersConverter uut = new RomanNumbersConverter();

    @Test
    void convert_withInput_0_shouldReturn_emptyString() {
        assertNotNull(uut.convert(0));
        assertEquals("", uut.convert(0));
    }
}
