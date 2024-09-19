package org.example;

import junit.framework.TestCase;

public class PalindromeNumberTest extends TestCase {
     private final PalindromeNumber testPalindromeNumberWithPositiveTesting=new PalindromeNumber();

    public void testIsPalindrome_case1() {
        assertTrue(testPalindromeNumberWithPositiveTesting.isPalindrome(121));
    }
    public void testIsPalindrome_case2() {
        assertFalse(testPalindromeNumberWithPositiveTesting.isPalindrome(-121));
    }
    public void testIsPalindrome_case3() {
       assertFalse(testPalindromeNumberWithPositiveTesting.isPalindrome(10));
    }
}