package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class GenerateParenthesesTest {
    private  final  GenerateParentheses generator=new GenerateParentheses();

    @Test
    public void testExample1() {
        int n = 3;
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = generator.generateParenthesis(n);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testExample2() {
        int n = 1;
        List<String> expected = List.of("()");
        List<String> result = generator.generateParenthesis(n);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testNZero() {
        int n = 0;
        List<String> expected = List.of(""); // A valid combination for 0 pairs is the empty string
        List<String> result = generator.generateParenthesis(n);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testNTwo() {
        int n = 2;
        List<String> expected = List.of("(())", "()()");
        List<String> result = generator.generateParenthesis(n);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testNLarge() {
        int n = 4;
        List<String> result = generator.generateParenthesis(n);

        // There should be 14 valid combinations for n = 4
        assertEquals(14, result.size());
    }
}
