package org.example;

public class PalindromeNumber {
    public boolean isPalindrome(int inputNumber) {
        // Edge case: Negative numbers and numbers ending with 0 (but not 0 itself) cannot be palindromes
        if (inputNumber < 0 || (inputNumber % 10 == 0 && inputNumber != 0)) {
            return false;
        }

        // Variable to store the reversed number
        int reversedNumber = 0;
        // Store the original number for later comparison
        int originalNumber = inputNumber;

        // Loop to reverse the digits of the number
        while (inputNumber > 0) {
            // Extract the last digit and add it to the reversed number
            reversedNumber = inputNumber % 10 + reversedNumber * 10;
            // Remove the last digit from x
            inputNumber = inputNumber / 10;
        }

        // Compare the original number with the reversed number
        // If they are equal, then the number is a palindrome
        return originalNumber == reversedNumber;
    }

}
