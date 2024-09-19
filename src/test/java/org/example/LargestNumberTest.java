package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    private final LargestNumber testToLargestNumberWithPositiveCaseOfTesting= new LargestNumber();

    // Method to provide test cases
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{10, 2}, "210"),
                Arguments.of(new int[]{3, 30, 34, 5, 9}, "9534330"),
                Arguments.of(new int[]{0, 0}, "0"),
                Arguments.of(new int[]{1}, "1"),
                Arguments.of(new int[]{10, 0, 2}, "2100"),
                Arguments.of(new int[]{12, 121}, "12121"),
                Arguments.of(new int[]{20, 21}, "2120"),
                Arguments.of(new int[]{-1},"-1")

        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLargestNumber(int[] input, String expected) {
        assertEquals(expected, testToLargestNumberWithPositiveCaseOfTesting.largestNumber(input));
    }
}
