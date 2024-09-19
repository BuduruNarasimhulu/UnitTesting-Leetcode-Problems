package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerConverter {

    private static final Map<Character, Integer> ROMAN_VALUE_MAP;

    // Static block to initialize the Roman numeral mappings
    static {
        ROMAN_VALUE_MAP = new HashMap<>();
        ROMAN_VALUE_MAP.put('I', 1);
        ROMAN_VALUE_MAP.put('V', 5);
        ROMAN_VALUE_MAP.put('X', 10);
        ROMAN_VALUE_MAP.put('L', 50);
        ROMAN_VALUE_MAP.put('C', 100);
        ROMAN_VALUE_MAP.put('D', 500);
        ROMAN_VALUE_MAP.put('M', 1000);
    }

    public int convertRomanToInteger(String romanNumeral) {
        // Handle edge cases: if the input string is null or empty, return 0
        if (isInvalidRomanNumeral(romanNumeral)) {
            return 0;
        }

        int integerResult = 0;
        int length = romanNumeral.length();

        // Loop through each character in the string
        for (int index = 0; index < length; index++) {
            int currentValue = ROMAN_VALUE_MAP.get(romanNumeral.charAt(index));

            // If the current character is not the last one, compare it with the next character
            if (index < length - 1) {
                int nextValue = ROMAN_VALUE_MAP.get(romanNumeral.charAt(index + 1));

                // If the current value is less than the next value, subtract it from the result
                // This handles cases like IV (4) and IX (9)
                if (currentValue < nextValue) {
                    integerResult -= currentValue;
                } else {
                    integerResult += currentValue;
                }
            } else {
                // If the current character is the last one, simply add its value to the result
                integerResult += currentValue;
            }
        }

        // Return the final result, which is the integer representation of the Roman numeral
        return integerResult;
    }

    private boolean isInvalidRomanNumeral(String romanNumeral) {
        return romanNumeral == null || romanNumeral.isEmpty();
    }
}


