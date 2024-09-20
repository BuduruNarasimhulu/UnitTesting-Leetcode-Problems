package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
   private  final  ValidParentheses testValidParenthesesWithPositiveTesting=new ValidParentheses();
    @Test
    public void shouldReturnTrueForSimpleParentheses() {
        String s = "()";
        boolean expected = true;
        boolean result = testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueForValidMultipleBrackets() {
        String s = "()[]{}";
        boolean expected = true;
        boolean result =testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForInvalidParentheses() {
        String s = "(]";
        boolean expected = false;
        boolean result = testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testShouldReturnValidParantheses() {
        String s = "([])";
        boolean expected = true;
        boolean result = testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        String s = "";
        boolean expected = true;
        boolean result =testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testSingleOpeningBracket() {
        String s = "(";
        boolean expected = false;
        boolean result = testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testSingleClosingBracket() {
        String s = ")";
        boolean expected = false;
        boolean result = testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testMismatchedBrackets() {
        String s = "{[}]";
        boolean expected = false;
        boolean result = testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testNestedValidBrackets() {
        String s = "{{[[(())]]}}";
        boolean expected = true;
        boolean result = testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testIncompleteBrackets() {
        String s = "([]";
        boolean expected = false;
        boolean result = testValidParenthesesWithPositiveTesting.isValid(s);

        assertEquals(expected, result);
    }
}
