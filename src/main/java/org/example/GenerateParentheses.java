package org.example;

import java.util.*;

public class GenerateParentheses {

    public List<String> generateParenthesis(int pairCount) {
        // List to store the final result of valid parenthesis combinations
        List<String> validCombinations = new ArrayList<>();
        // List to hold the current combination of parentheses being built
        List<String> currentCombination = new ArrayList<>();
        // Start the backtracking process
        backtrack(pairCount, 0, 0, currentCombination, validCombinations);
        return validCombinations; // Return the list of valid combinations
    }

    public void backtrack(int pairCount, int leftParenthesisCount, int rightParenthesisCount, List<String> currentCombination, List<String> validCombinations) {
        // If we have used n left and n right parentheses, add the current combination to the result
        if (leftParenthesisCount >= pairCount && rightParenthesisCount >= pairCount) {
            // Join the current output list into a string and add it to the result list
            String outputStr = String.join("", currentCombination);
            validCombinations.add(outputStr);
            return; // Exit the method as we've found a valid combination
        }

        // If we can still add left parentheses, do so
        if (leftParenthesisCount < pairCount) {
            currentCombination.add("("); // Add a left parenthesis
            backtrack(pairCount, leftParenthesisCount + 1, rightParenthesisCount, currentCombination, validCombinations); // Recur with updated counts
            currentCombination.remove(currentCombination.size() - 1); // Backtrack: remove the last added parenthesis
        }

        // If we can add a right parenthesis, do so only if it won't exceed the left ones
        if (rightParenthesisCount < leftParenthesisCount) {
            currentCombination.add(")"); // Add a right parenthesis
            backtrack(pairCount, leftParenthesisCount, rightParenthesisCount + 1, currentCombination, validCombinations); // Recur with updated counts
            currentCombination.remove(currentCombination.size() - 1); // Backtrack: remove the last added parenthesis
        }
    }
}


