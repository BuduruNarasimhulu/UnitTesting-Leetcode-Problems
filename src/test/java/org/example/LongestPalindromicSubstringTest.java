package org.example;

import junit.framework.TestCase;

public class LongestPalindromicSubstringTest extends TestCase {
    private final LongestPalindromicSubstring testLongestPalindromicSubstringWithPositiveTesting=new LongestPalindromicSubstring();

    public void testPalindrome_case1() {
     assertEquals("bab",testLongestPalindromicSubstringWithPositiveTesting.longestPalindrome("babad"));
    }
    public void testPalindrome_case2() {
        assertEquals("bb",testLongestPalindromicSubstringWithPositiveTesting.longestPalindrome("cbbd"));
    }

}