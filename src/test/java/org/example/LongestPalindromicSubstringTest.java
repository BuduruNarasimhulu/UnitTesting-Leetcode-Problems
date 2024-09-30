package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

    @Test
    void testLongestPalindrome_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            lps.longestPalindrome(null);
        });
    }

    @Test
    void testLongestPalindrome_EmptyString() {
        assertEquals("", lps.longestPalindrome(""));
    }

    @Test
    void testLongestPalindrome_SingleCharacter() {
        assertEquals("a", lps.longestPalindrome("a"));
        assertEquals("b", lps.longestPalindrome("b"));
    }

    @Test
    void testLongestPalindrome_TwoDifferentCharacters() {
        assertEquals("a", lps.longestPalindrome("ab"));
        assertEquals("b", lps.longestPalindrome("ba"));
    }

    @Test
    void testLongestPalindrome_TwoSameCharacters() {
        assertEquals("aa", lps.longestPalindrome("aa"));
    }

    @Test
    void testLongestPalindrome_MultipleSameCharacters() {
        assertEquals("aaa", lps.longestPalindrome("aaa"));
    }

    @Test
    void testLongestPalindrome_OddLengthPalindrome() {
        assertEquals("racecar", lps.longestPalindrome("racecar"));
        assertEquals("aba", lps.longestPalindrome("abacdfgdcaba"));
    }

    @Test
    void testLongestPalindrome_EvenLengthPalindrome() {
        assertEquals("abba", lps.longestPalindrome("abba"));
        assertEquals("aa", lps.longestPalindrome("aabb"));
    }

    @Test
    void testLongestPalindrome_NoPalindrome() {
        assertEquals("a", lps.longestPalindrome("abcde"));
    }

    @Test
    void testLongestPalindrome_MixedCharacters() {
        assertEquals("bcb", lps.longestPalindrome("abcbde"));

    }

    @Test
    void testLongestPalindrome_LongestPalindromeAtStart() {
        assertEquals("cbaabc", lps.longestPalindrome("abcbaabc"));
    }

    @Test
    void testLongestPalindrome_LongestPalindromeAtEnd() {
        assertEquals("abccba", lps.longestPalindrome("xyzabccba"));
    }

    @Test
    void testLongestPalindrome_LongestPalindromeInMiddle() {
        assertEquals("aibohphobia", lps.longestPalindrome("xyzxaibohphobiaabc"));
    }
}

