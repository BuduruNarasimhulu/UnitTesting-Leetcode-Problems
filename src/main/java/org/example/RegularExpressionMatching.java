package org.example;

public class RegularExpressionMatching {
        public boolean isMatch(String s, String p) {
            // Create a 2D boolean matrix for dynamic programming
            boolean[][] mat = new boolean[s.length() + 1][p.length() + 1];

            // An empty string matches an empty pattern
            mat[0][0] = true;

            // Handle patterns with '*' at the beginning
            for (int i = 1; i < mat[0].length; i++) {
                if (p.charAt(i - 1) == '*') {
                    // '*' can eliminate the previous character and match zero occurrences
                    mat[0][i] = mat[0][i - 2];
                }
            }

            // Fill the matrix for all characters in s and p
            for (int i = 1; i < mat.length; i++) { // Iterate through string s
                for (int j = 1; j < mat[0].length; j++) { // Iterate through pattern p
                    // Check if current characters match or if the pattern has a '.'
                    if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                        // If they match, take the value from the diagonal (previous characters)
                        mat[i][j] = mat[i - 1][j - 1];
                    }
                    // Check if the current character in the pattern is '*'
                    else if (p.charAt(j - 1) == '*') {
                        // Match zero occurrences of the preceding character
                        mat[i][j] = mat[i][j - 2];
                        // Check if the preceding character matches the current character in s
                        if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                            // If there's a match, consider the case of one or more occurrences
                            mat[i][j] |= mat[i - 1][j]; // Use bitwise OR to update the match status
                        }
                    } else {
                        // If characters don't match and it's not a special case, set to false
                        mat[i][j] = false;
                    }
                }
            }

            // The result is whether the entire string matches the entire pattern
            return mat[s.length()][p.length()];
        }
}


