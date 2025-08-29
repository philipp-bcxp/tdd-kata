package com.tdd;

public class RomanNumbersConverter {
    public String convert(int number) {
        if (number <= 3) {
            return number == 1 ? "I" : "I" + convert(number -1);
        }

        if (number == 4) {
            return "IV";
        }

        if (number <= 8) {
            return number == 5 ? "V" : "V" + convert(number - 5);
        }

        if (number == 9) {
            return "IX";
        }

        if (number <= 39) {
            return number == 10  ? "X" : "X" + convert(number -10);
        }

        if (number <= 49) {
            return number == 40 ? "XL" : "XL" + convert(number -40);
        }

        if (number == 50) {
            return "L";
        }
        return "";
    }
}
