package org.example;

import java.security.InvalidParameterException;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String inputString) throws InvalidParameterException {
        // Check for null input
        if (inputString == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        // Handle empty string case
        if (inputString.isEmpty()) {
            return ""; // Return an empty string if input is empty
        }

        // Handle single character case
        if (inputString.length() == 1) {
            return inputString; // Return the input string if it's a single character
        }

        int maxLength = 1;
        String longestPalindromeSubstring = inputString.substring(0, 1);

        for (int startIndex = 0; startIndex < inputString.length(); startIndex++) {
            for (int endIndex = startIndex + maxLength; endIndex <= inputString.length(); endIndex++) {
                if (endIndex - startIndex > maxLength && isPalindrome(inputString.substring(startIndex, endIndex ))) {
                    maxLength = endIndex - startIndex;
                    longestPalindromeSubstring = inputString.substring(startIndex, endIndex);
                }
            }
        }

        return longestPalindromeSubstring;
    }

    private boolean isPalindrome(String string) {
        int leftPointer = 0;
        int rightPointer = string.length() - 1;

        while (leftPointer < rightPointer) {
            if (string.charAt(leftPointer) != string.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
