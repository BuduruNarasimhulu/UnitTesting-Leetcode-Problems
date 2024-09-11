package org.example;

import junit.framework.TestCase;

public class PalindromeNumberTest extends TestCase {
     private final PalindromeNumber test=new PalindromeNumber();

    public void testIsPalindrome_case1() {
        assertTrue(test.isPalindrome(121));
    }
    public void testIsPalindrome_case2() {
        assertFalse(test.isPalindrome(-121));
    }
    public void testIsPalindrome_case3() {
       assertFalse(test.isPalindrome(10));
    }
}