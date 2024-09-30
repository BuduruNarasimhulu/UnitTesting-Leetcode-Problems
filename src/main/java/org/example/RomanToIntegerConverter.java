package org.example;

import java.util.*;

// Parent InvalidInputException class
class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}

// Invalid character (Non-Roman Values) for custom Exception
class InvalidRomanCharacterException extends InvalidInputException {
    public InvalidRomanCharacterException(char character) {
        super("Invalid character encountered in Roman numeral: " + character);
    }
}

// Empty or null characters for custom exception
 class EmptyRomanNumeralException extends InvalidInputException {
    public EmptyRomanNumeralException() {
        super("Roman numeral cannot be null or empty.");
    }
}

// Values provider class
class RomanValueProvider {
    private static final Map<Character, Integer> ROMAN_VALUE_MAP = new HashMap<>();

    static {
        ROMAN_VALUE_MAP.put('I', 1);
        ROMAN_VALUE_MAP.put('V', 5);
        ROMAN_VALUE_MAP.put('X', 10);
        ROMAN_VALUE_MAP.put('L', 50);
        ROMAN_VALUE_MAP.put('C', 100);
        ROMAN_VALUE_MAP.put('D', 500);
        ROMAN_VALUE_MAP.put('M', 1000);
    }

    // Retrieve value for a given Roman character
    public static int getValue(char romanCharacter) {
        if (!ROMAN_VALUE_MAP.containsKey(romanCharacter)) {
            throw new InvalidRomanCharacterException(romanCharacter);
        }
        return ROMAN_VALUE_MAP.get(romanCharacter);
    }
}

// Main class (conversion logic)
 class RomanToIntegerConverter {

    private final RomanValueProvider valueProvider;

    public RomanToIntegerConverter() {
        this.valueProvider = new RomanValueProvider();
    }

    public int convertRomanToInteger(String romanNumeral) {

        if (romanNumeral == null || romanNumeral.isEmpty()) {
            throw new EmptyRomanNumeralException();
        }

        if (romanNumeral.matches(".*IIII.*") || romanNumeral.matches(".*VV.*") ||
                romanNumeral.matches(".*XXXX.*") || romanNumeral.matches(".*LL.*") ||
                romanNumeral.matches(".*CCCC.*") || romanNumeral.matches(".*DD.*") ||
                romanNumeral.matches(".*MMMM.*")) {
            throw new InvalidRomanCharacterException(' '); // You can modify the exception message to specify the issue
        }
        // Check if input contains any lowercase letters
        if (!romanNumeral.equals(romanNumeral.toUpperCase())) {
            throw new InvalidInputException("Lowercase Roman numerals are not allowed.");
        }

        int integerResult = 0;
        int length = romanNumeral.length();

        for (int index = 0; index < length; index++) {
            char currentChar = romanNumeral.charAt(index);
            int currentValue = valueProvider.getValue(currentChar);

            if (index < length - 1) {
                char nextChar = romanNumeral.charAt(index + 1);
                int nextValue = valueProvider.getValue(nextChar);

                if (currentValue < nextValue) {
                    integerResult -= currentValue;
                } else {
                    integerResult += currentValue;
                }
            } else {
                integerResult += currentValue;
            }
        }

        return integerResult;
    }

}
