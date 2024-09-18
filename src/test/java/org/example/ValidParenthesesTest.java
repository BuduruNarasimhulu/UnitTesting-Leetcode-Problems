package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
   private  final  ValidParentheses validator=new ValidParentheses();
    @Test
    public void testExample1() {
        String s = "()";
        boolean expected = true;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        String s = "()[]{}";
        boolean expected = true;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        String s = "(]";
        boolean expected = false;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testExample4() {
        String s = "([])";
        boolean expected = true;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        String s = "";
        boolean expected = true;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testSingleOpeningBracket() {
        String s = "(";
        boolean expected = false;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testSingleClosingBracket() {
        String s = ")";
        boolean expected = false;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testMismatchedBrackets() {
        String s = "{[}]";
        boolean expected = false;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testNestedValidBrackets() {
        String s = "{{[[(())]]}}";
        boolean expected = true;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }

    @Test
    public void testIncompleteBrackets() {
        String s = "([]";
        boolean expected = false;
        boolean result = validator.isValid(s);

        assertEquals(expected, result);
    }
}
