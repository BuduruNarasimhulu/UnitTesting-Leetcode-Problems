package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstMissingPositiveTest {

    // Rename to something more concise and descriptive
    private final FirstMissingPositive testFirstMissingPositiveTest = new FirstMissingPositive();

    // Method to provide test cases
    private static Stream<Arguments> testProvideTestCasesForFirstMissingPositive() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 0}, 3),
                Arguments.of(new int[]{3, 4, -1, 1}, 2),
                Arguments.of(new int[]{7, 8, 9, 11, 12}, 1),
                Arguments.of(new int[]{1}, 2),
                Arguments.of(new int[]{2}, 1),
                Arguments.of(new int[]{}, 1),
                Arguments.of(new int[]{-1, -2, -3}, 1),
                Arguments.of(new int[]{0}, 1)
        );
    }


    @ParameterizedTest
    @MethodSource("testProvideTestCasesForFirstMissingPositive")
    void testFirstMissingPositiveWithVariousCases(int[] input, int expected) {
        assertEquals(expected, testFirstMissingPositiveTest.firstMissingPositive(input));
    }

}
