package org.example;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String inputString) {
        if (inputString.length() <= 1) {
            return inputString;
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
