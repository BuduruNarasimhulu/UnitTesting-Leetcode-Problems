package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class GenerateParenthesesTest {

    private final GenerateParentheses generateParentheses = new GenerateParentheses();

    @Test
    public void testGenerateParenthesesWithThreePairs() {
        int n = 3;
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = generateParentheses.generateParenthesis(n);

        assertEquals(expected.size(), result.size(), "Expected size should match the result size for n=3");
        assertTrue(result.containsAll(expected), "The result should contain all expected values for n=3");
    }

    @Test
    public void testGenerateParenthesesWithOnePair() {
        int n = 1;
        List<String> expected = List.of("()");
        List<String> result = generateParentheses.generateParenthesis(n);

        assertEquals(expected.size(), result.size(), "Expected size should match the result size for n=1");
        assertTrue(result.containsAll(expected), "The result should contain all expected values for n=1");
    }

    @Test
    public void testGenerateParenthesesWithZeroPairs() {
        int n = 0;
        List<String> expected = List.of(""); // A valid combination for 0 pairs is the empty string
        List<String> result = generateParentheses.generateParenthesis(n);

        assertEquals(expected.size(), result.size(), "Expected size should match the result size for n=0");
        assertTrue(result.containsAll(expected), "The result should contain all expected values for n=0");
    }

    @Test
    public void testGenerateParenthesesWithTwoPairs() {
        int n = 2;
        List<String> expected = List.of("(())", "()()");
        List<String> result = generateParentheses.generateParenthesis(n);

        assertEquals(expected.size(), result.size(), "Expected size should match the result size for n=2");
        assertTrue(result.containsAll(expected), "The result should contain all expected values for n=2");
    }

    @Test
    public void testGenerateParenthesesWithFourPairs() {
        int n = 4;
        List<String> result = generateParentheses.generateParenthesis(n);

        // There should be 14 valid combinations for n = 4
        assertEquals(14, result.size(), "The result size should be 14 for n=4");
    }
}

