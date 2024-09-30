package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeNumberTest {

    private final PalindromeNumber palindromeChecker = new PalindromeNumber();

    @Test
    public void returnsTrue_whenNumberIsPalindrome() {

        assertTrue(palindromeChecker.isPalindrome(121));
    }

    @Test
    public void returnsFalse_whenNumberIsNegative() {
        assertFalse(palindromeChecker.isPalindrome(-121));
    }

    @Test
    public void returnsFalse_whenNumberIsNotPalindrome() {
        assertFalse(palindromeChecker.isPalindrome(10));
    }
}
