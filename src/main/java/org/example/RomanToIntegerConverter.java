package org.example;

import java.util.*;

// Parent InvalidInputException class
class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}

// invalid character(Non-Roman Values) for custom Exception
class InvalidRomanCharacterException extends InvalidInputException {
    public InvalidRomanCharacterException(char character) {
        super("Invalid character encountered in Roman numeral: " + character);
    }
}

// empty or null characters for custom exception
class EmptyRomanNumeralException extends InvalidInputException {
    public EmptyRomanNumeralException() {
        super("Roman numeral cannot be null or empty.");
    }
}
//values provider class
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
//Main class(conversion Logic)
public class RomanToIntegerConverter {

    private final RomanValueProvider valueProvider;

    public RomanToIntegerConverter() {
        this.valueProvider = new RomanValueProvider();
    }

    public int convertRomanToInteger(String romanNumeral) {

        if (romanNumeral == null || romanNumeral.isEmpty()) {
            throw new EmptyRomanNumeralException();
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

    // Main method
    public static void main(String[] args) {
        RomanToIntegerConverter converter = new RomanToIntegerConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Roman Numeral Converter!");


        while (true) {
            System.out.print("Roman Numeral: ");
            String input = scanner.nextLine().trim();
            try {

                int result = converter.convertRomanToInteger(input);
                System.out.println("The integer value of " + input + " is: " + result);
            } catch (EmptyRomanNumeralException e) {

                System.err.println("Error: " + e.getMessage());
            } catch (InvalidRomanCharacterException e) {

                System.err.println("Error: " + e.getMessage());
            } catch (InvalidInputException e) {

                System.err.println("Conversion error: " + e.getMessage());
            }
        }


    }

}