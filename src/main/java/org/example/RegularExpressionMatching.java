package org.example;

public class RegularExpressionMatching {

    public boolean isMatch(String inputString, String pattern) {
        // Check for null input
        if (inputString == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern cannot be null");
        }

        // Handle empty pattern and string cases
        if (inputString.isEmpty() && pattern.isEmpty()) {
            return true; // Both are empty, they match
        }
        if (pattern.isEmpty()) {
            return false; // Pattern is empty, but string is not
        }
        if (inputString.isEmpty()) {
            // Check if pattern can match an empty string
            // Only valid if pattern is of the form x* or x*y* etc.
            boolean[][] dpTable = new boolean[2][pattern.length() + 1];
            dpTable[0][0] = true;

            for (int j = 1; j <= pattern.length(); j++) {
                if (pattern.charAt(j - 1) == '*') {
                    dpTable[0][j] = dpTable[0][j - 2];
                }
            }
            return dpTable[0][pattern.length()];
        }

        // Create a 2D boolean matrix for dynamic programming
        boolean[][] dpTable = new boolean[inputString.length() + 1][pattern.length() + 1];

        // An empty string matches an empty pattern
        dpTable[0][0] = true;

        // Handle patterns with '*' at the beginning
        for (int patternIndex = 1; patternIndex < dpTable[0].length; patternIndex++) {
            if (pattern.charAt(patternIndex - 1) == '*') {
                // '*' can eliminate the previous character and match zero occurrences
                dpTable[0][patternIndex] = dpTable[0][patternIndex - 2];
            }
        }

        // Fill the matrix for all characters in s and p
        for (int stringIndex = 1; stringIndex < dpTable.length; stringIndex++) { // Iterate through string s
            for (int patternIndex = 1; patternIndex < dpTable[0].length; patternIndex++) { // Iterate through pattern p
                // Check if current characters match or if the pattern has a '.'
                if (pattern.charAt(patternIndex - 1) == '.' || pattern.charAt(patternIndex - 1) == inputString.charAt(stringIndex - 1)) {
                    // If they match, take the value from the diagonal (previous characters)
                    dpTable[stringIndex][patternIndex] = dpTable[stringIndex - 1][patternIndex - 1];
                }
                // Check if the current character in the pattern is '*'
                else if (pattern.charAt(patternIndex - 1) == '*') {
                    // Match zero occurrences of the preceding character
                    dpTable[stringIndex][patternIndex] = dpTable[stringIndex][patternIndex - 2];
                    // Check if the preceding character matches the current character in s
                    if (pattern.charAt(patternIndex - 2) == '.' || pattern.charAt(patternIndex - 2) == inputString.charAt(stringIndex - 1)) {
                        // If there's a match, consider the case of one or more occurrences
                        dpTable[stringIndex][patternIndex] |= dpTable[stringIndex - 1][patternIndex]; // Use bitwise OR to update the match status
                    }
                }
            }
        }

        // The result is whether the entire string matches the entire pattern
        return dpTable[inputString.length()][pattern.length()];
    }
}



