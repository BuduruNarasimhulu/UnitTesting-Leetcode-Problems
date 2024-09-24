package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegularExpressionMatchingTest {

    private final RegularExpressionMatching regexMatcher = new RegularExpressionMatching();

    @Test
    public void returnsFalse_whenPatternDoesNotMatchSingleCharacter() {
        String s = "aa";
        String p = "a";
        assertFalse(regexMatcher.isMatch(s, p));
    }

    @Test
    public void returnsTrue_whenPatternContainsAsteriskForMultipleCharacterMatch() {
        String s = "aa";
        String p = "a*";
        assertTrue(regexMatcher.isMatch(s, p));
    }

    @Test
    public void returnsTrue_whenPatternIsDotAsteriskForAnyCharacterMatch() {
        String s = "ab";
        String p = ".*";
        assertTrue(regexMatcher.isMatch(s, p));
    }

    @Test
    public void returnsTrue_whenBothStringAndPatternAreEmpty() {
        String s = "";
        String p = "";
        assertTrue(regexMatcher.isMatch(s, p));
    }

    @Test
    public void returnsTrue_whenPatternContainsAsteriskAndStringIsEmpty() {
        String s = "";
        String p = "a*";
        assertTrue(regexMatcher.isMatch(s, p));
    }

    @Test
    public void returnsTrue_whenPatternMatchesComplexInput() {
        String s = "aab";
        String p = "c*a*b";
        assertTrue(regexMatcher.isMatch(s, p));
    }

    @Test
    public void returnsFalse_whenPatternDoesNotMatchComplexInput() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        assertFalse(regexMatcher.isMatch(s, p));
    }
    @Test
    void testIsMatch_NullInputString() {
        // Test that passing a null input string throws an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            regexMatcher.isMatch(null, "a*b");
        }, "Input string cannot be null");
    }

    @Test
    void testIsMatch_NullPattern() {
        // Test that passing a null pattern throws an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            regexMatcher.isMatch("abc", null);
        }, "Pattern cannot be null");
    }

    @Test
    void testIsMatch_NullBoth() {
        // Test that passing both null values throws an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            regexMatcher.isMatch(null, null);
        }, "Input string cannot be null");
    }

    @Test
    void testIsMatch_EmptyStringAndPattern() {
        // Check that both empty input and pattern return true
        assertTrue(regexMatcher.isMatch("", ""), "Both empty strings should match");
    }

    @Test
    void testIsMatch_EmptyPattern() {
        // Check that an empty pattern returns false for a non-empty string
        assertFalse(regexMatcher.isMatch("abc", ""), "Empty pattern should not match a non-empty string");
    }

    @Test
    void testIsMatch_EmptyString() {
        // Check that a non-empty pattern does not match an empty string
        assertFalse(regexMatcher.isMatch("", "a*b"), "Non-empty pattern should not match an empty string");
    }
}

