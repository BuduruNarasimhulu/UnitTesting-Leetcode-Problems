package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    private final LargestNumber largestNumberUnderTest = new LargestNumber();

    // Method to provide test cases
    private static Stream<Arguments> testProvideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{10, 2}, "210"),
                Arguments.of(new int[]{3, 30, 34, 5, 9}, "9534330"),
                Arguments.of(new int[]{0, 0}, "0"),
                Arguments.of(new int[]{1}, "1"),
                Arguments.of(new int[]{10, 0, 2}, "2100"),
                Arguments.of(new int[]{12, 121}, "12121"),
                Arguments.of(new int[]{20, 21}, "2120")

        );
    }

    @ParameterizedTest
    @MethodSource("testProvideTestCases")
    void testLargestNumber(int[] inputArray, String expectedOutput) {
        assertEquals(expectedOutput, largestNumberUnderTest.largestNumber(inputArray));
    }
}

