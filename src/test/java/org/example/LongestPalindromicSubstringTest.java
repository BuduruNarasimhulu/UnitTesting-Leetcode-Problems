package org.example;

import junit.framework.TestCase;

public class LongestPalindromicSubstringTest extends TestCase {
    private final LongestPalindromicSubstring test=new LongestPalindromicSubstring();

    public void testPalindrome_case1() {
     assertEquals("bab",test.longestPalindrome("babad"));
    }
    public void testPalindrome_case2() {
        assertEquals("bb",test.longestPalindrome("cbbd"));
    }

}