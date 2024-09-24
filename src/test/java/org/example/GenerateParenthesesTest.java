package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GenerateParenthesesTest {

    private final GenerateParentheses generateParentheses = new GenerateParentheses();

    @Test
    public void testGenerateParenthesis_WithZeroPairs() {
        List<String> result = generateParentheses.generateParenthesis(0);
        assertEquals(List.of(""), result, "Expected one valid combination for zero pairs");
    }

    @Test
    public void testGenerateParenthesis_WithOnePair() {
        List<String> result = generateParentheses.generateParenthesis(1);
        assertEquals(List.of("()"), result, "Expected one valid combination for one pair");
    }

    @Test
    public void testGenerateParenthesis_WithTwoPairs() {
        List<String> result = generateParentheses.generateParenthesis(2);
        assertEquals(List.of("(())", "()()"), result, "Expected two valid combinations for two pairs");
    }



    @Test
    public void testGenerateParenthesis_WithFourPairs() {
        List<String> result = generateParentheses.generateParenthesis(4);
        assertEquals(14, result.size(), "Expected 14 valid combinations for four pairs");
    }

    @Test
    public void testGenerateParenthesis_WithNegativePairs() {
        List<String> result = generateParentheses.generateParenthesis(-1);
        assertEquals(List.of(), result, "Expected an empty list for negative input");
    }

    @Test
    public void testGenerateParenthesis_WithLargeInput() {
        List<String> result = generateParentheses.generateParenthesis(5);
        assertEquals(42, result.size(), "Expected 42 valid combinations for five pairs");
    }

    @Test
    public void testGenerateParenthesis_WithHighNumberOfPairs() {
        List<String> result = generateParentheses.generateParenthesis(6);
        assertEquals(132, result.size(), "Expected 132 valid combinations for six pairs");
    }

    @Test
    public void testGenerateParenthesis_WithIntegerMaxValue() {
        // This test may take a long time and consume a lot of memory
        assertThrows(StackOverflowError.class, () -> {
            generateParentheses.generateParenthesis(Integer.MAX_VALUE);
        }, "Expected IllegalArgumentException for extremely large input");
    }

    @Test
    public void testGenerateParenthesis_WithOddAndEvenNumbers() {
        List<String> evenResult = generateParentheses.generateParenthesis(2);
        List<String> oddResult = generateParentheses.generateParenthesis(3);

        assertFalse(evenResult.stream().anyMatch(s -> s.length() % 2 != 0), "Expected all combinations for even pairs to have even length");
        assertTrue(oddResult.stream().anyMatch(s -> s.length() % 2 != 1), "Expected all combinations for odd pairs to have odd length");
    }

    @Test
    public void testGenerateParenthesis_WithEmptyInput() {
        // This test is already covered by negative input, but explicitly checking for -1
        List<String> result = generateParentheses.generateParenthesis(-1);
        assertEquals(List.of(), result, "Expected an empty list for negative input");
    }
}

