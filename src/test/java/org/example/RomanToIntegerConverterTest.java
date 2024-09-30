package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerConverterTest {

    RomanToIntegerConverter converter = new RomanToIntegerConverter();

    // Test valid Roman numerals (simple cases)
    @Test
    void test_ValidSimpleRomanNumerals_returnValidIntegerValues() {
        assertEquals(1, converter.convertRomanToInteger("I"));
        assertEquals(4, converter.convertRomanToInteger("IV"));
        assertEquals(5, converter.convertRomanToInteger("V"));
        assertEquals(9, converter.convertRomanToInteger("IX"));
        assertEquals(10, converter.convertRomanToInteger("X"));
        assertEquals(49, converter.convertRomanToInteger("XLIX"));
        assertEquals(50, converter.convertRomanToInteger("L"));
        assertEquals(99, converter.convertRomanToInteger("XCIX"));
        assertEquals(100, converter.convertRomanToInteger("C"));
        assertEquals(499, converter.convertRomanToInteger("CDXCIX"));
        assertEquals(500, converter.convertRomanToInteger("D"));
        assertEquals(999, converter.convertRomanToInteger("CMXCIX"));
        assertEquals(1000, converter.convertRomanToInteger("M"));
    }

    // Test valid complex Roman numerals
    @Test
    void test_ValidComplexRomanNumerals_returnIntegerValues() {
        assertEquals(1994, converter.convertRomanToInteger("MCMXCIV"));  // 1000+900+90+4
        assertEquals(58, converter.convertRomanToInteger("LVIII"));  // 50+5+3
        assertEquals(3999, converter.convertRomanToInteger("MMMCMXCIX"));  // Highest possible valid Roman numeral
    }

    // Test invalid Roman numeral - empty string or null
    @Test
    void test_EmptyOrNullRomanNumeral_throwsEmptyRomanNumeralException() {
        assertThrows(EmptyRomanNumeralException.class, () -> {
            converter.convertRomanToInteger("");
        });

        assertThrows(EmptyRomanNumeralException.class, () -> {
            converter.convertRomanToInteger(null);
        });

    }

    // Test invalid characters
    @Test
    void test_InvalidRomanCharacter_throwsInvalidRomanCharacterException() {
        assertThrows(InvalidRomanCharacterException.class,()->{
           converter.convertRomanToInteger("RAMA");
        });
        assertThrows(InvalidRomanCharacterException.class, () -> {
            converter.convertRomanToInteger("ABC");
        });
        assertThrows(InvalidRomanCharacterException.class, () -> {
            converter.convertRomanToInteger("IIIA");
        });
        assertThrows(InvalidRomanCharacterException.class, () -> {
            converter.convertRomanToInteger("MXD2");
        });
    }

    // Test invalid repetition of Roman numerals (e.g., "IIII", "VV", etc.)
    @Test
    void test_InvalidRepetitionOfNumerals_throwsInvalidRomanCharacterException() {
        assertThrows(InvalidRomanCharacterException.class, () -> {
            converter.convertRomanToInteger("IIII");
        });
        assertThrows(InvalidRomanCharacterException.class, () -> {
            converter.convertRomanToInteger("VV");
        });
        assertThrows(InvalidRomanCharacterException.class, () -> {
            converter.convertRomanToInteger("XXXX");
        });
    }


    // Test lower-case Roman numerals (e.g., "mcmxciv") and integer values (e.g.,"1234556")
    @Test
    void Test_LowerCaseRomanNumerals_throwsInvalidInputExceptions() {
        assertThrows(InvalidInputException.class, () -> {
            converter.convertRomanToInteger("mcmxciv");
        }, "Lowercase Roman numerals should throw InvalidInputException");

        assertThrows(InvalidInputException.class, () -> {
            converter.convertRomanToInteger("lviii");
        }, "Lowercase Roman numerals should throw InvalidInputException");

        assertThrows(InvalidInputException.class, () -> {
            converter.convertRomanToInteger("-12345678901");
        }, " Negative integers values should throw InvalidInputException");

        assertThrows(InvalidInputException.class, () -> {
            converter.convertRomanToInteger("12345678901");
        }, "Positive integer values should throw InvalidInputException");


    }

    // Test mixed valid and invalid characters
    @Test
    void test_MixedValidAndInvalidCharacters_throwsInvalidRomanCharacterException() {
        assertThrows(InvalidRomanCharacterException.class, () -> {
            converter.convertRomanToInteger("MCMLXIV!");  // Invalid character '!'
        });
        assertThrows(InvalidRomanCharacterException.class, () -> {
            converter.convertRomanToInteger("X1X");  // Invalid character '1'
        });
    }

    // Test boundary case: smallest valid Roman numeral
    @Test
    void test_SmallestValidRomanNumeral_returnSmallestIntegerValue() {
        assertEquals(1, converter.convertRomanToInteger("I"));

    }

    // Test boundary case: largest valid Roman numeral
    @Test
    void test_LargestValidRomanNumeral_returnLargestIntegerValue() {
        assertEquals(4000, converter.convertRomanToInteger("MMMCMXCX"));// 3999 is the largest standard Roman numeral

    }
}


