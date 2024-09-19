package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

class IntegerToRomanConverterTest {

    private final IntegerToRomanConverter converter = new IntegerToRomanConverter();

    static Stream<Arguments> validNumbers() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(40, "XL"),
                Arguments.of(50, "L"),
                Arguments.of(90, "XC"),
                Arguments.of(100, "C"),
                Arguments.of(400, "CD"),
                Arguments.of(500, "D"),
                Arguments.of(900, "CM"),
                Arguments.of(1000, "M"),
                Arguments.of(2023, "MMXXIII"),
                Arguments.of(3999, "MMMCMXCIX")
        );
    }

    @ParameterizedTest
    @MethodSource("validNumbers")
    void testTransformIntegerToRomanNumeral_ValidNumbers(int input, String expected) {
        assertEquals(expected, converter.transformIntegerToRomanNumeral(input));
    }

    static Stream<Arguments> boundaryConditions() {
        return Stream.of(
                Arguments.of(0, ""),
                Arguments.of(-1, "")
        );
    }

    @ParameterizedTest
    @MethodSource("boundaryConditions")
    void testTransformIntegerToRomanNumeral_BoundaryConditions(int input, String expected) {
        assertEquals(expected, converter.transformIntegerToRomanNumeral(input));
    }
}
