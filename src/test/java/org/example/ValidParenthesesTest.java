package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {

    private final ValidParentheses validParenthesesChecker = new ValidParentheses();

    @Test
    public void returnsTrue_whenInputIsSimpleValidParentheses() {
        String input = "()";
        boolean expectedOutput = true;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsTrue_whenInputContainsValidMultipleBrackets() {
        String input = "()[]{}";
        boolean expectedOutput = true;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsFalse_whenInputContainsInvalidParentheses() {
        String input = "(]";
        boolean expectedOutput = false;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsTrue_whenInputHasValidNestedParentheses() {
        String input = "([])";
        boolean expectedOutput = true;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsTrue_whenInputIsAnEmptyString() {
        String input = "";
        boolean expectedOutput = true;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsFalse_whenInputIsASingleOpeningBracket() {
        String input = "(";
        boolean expectedOutput = false;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsFalse_whenInputIsASingleClosingBracket() {
        String input = ")";
        boolean expectedOutput = false;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsFalse_whenInputContainsMismatchedBrackets() {
        String input = "{[}]";
        boolean expectedOutput = false;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsTrue_whenInputContainsNestedValidBrackets() {
        String input = "{{[[(())]]}}";
        boolean expectedOutput = true;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void returnsFalse_whenInputHasIncompleteBrackets() {
        String input = "([]";
        boolean expectedOutput = false;
        boolean actualOutput = validParenthesesChecker.isValid(input);

        assertEquals(expectedOutput, actualOutput);
    }
}

