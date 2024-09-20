package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring palindromeFinder = new LongestPalindromicSubstring();

    @Test
    public void returnsLongestPalindrome_whenInputContainsMultiplePalindromes() {
        assertEquals("bab", palindromeFinder.longestPalindrome("babad"));
    }

    @Test
    public void returnsLongestPalindrome_whenInputContainsEvenLengthPalindrome() {
        assertEquals("bb", palindromeFinder.longestPalindrome("cbbd"));
    }
}
