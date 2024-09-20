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
}

