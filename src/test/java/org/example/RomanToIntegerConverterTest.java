package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

class RomanToIntegerConverterTest {

    private final RomanToIntegerConverter converter = new RomanToIntegerConverter();

    static Stream<Arguments> validRomanNumerals() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("IV", 4),
                Arguments.of("V", 5),
                Arguments.of("IX", 9),
                Arguments.of("X", 10),
                Arguments.of("XL", 40),
                Arguments.of("L", 50),
                Arguments.of("XC", 90),
                Arguments.of("C", 100),
                Arguments.of("CD", 400),
                Arguments.of("D", 500),
                Arguments.of("M", 1000),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }

    @ParameterizedTest
    @MethodSource("validRomanNumerals")
    void testConvertRomanToInteger_ValidRomanNumerals(String input, int expected) {
        assertEquals(expected, converter.convertRomanToInteger(input));
    }

    static Stream<Arguments> invalidInputs() {
        return Stream.of(
                Arguments.of(null, 0),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidInputs")
    void testConvertRomanToInteger_InvalidInputs(String input, int expected) {
        assertEquals(expected, converter.convertRomanToInteger(input));
    }

    static Stream<Arguments> continuousNumerals() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("VII", 7),
                Arguments.of("VIII", 8),
                Arguments.of("XI", 11),
                Arguments.of("XII", 12)
        );
    }

    @ParameterizedTest
    @MethodSource("continuousNumerals")
    void testConvertRomanToInteger_ContinuousNumerals(String input, int expected) {
        assertEquals(expected, converter.convertRomanToInteger(input));
    }
}

