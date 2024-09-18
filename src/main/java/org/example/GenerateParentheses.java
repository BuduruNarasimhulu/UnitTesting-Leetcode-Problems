package org.example;
import java.util.*;
public class GenerateParentheses {
        public List<String> generateParenthesis(int n) {
            // List to store the final result of valid parenthesis combinations
            List<String> result = new ArrayList<>();
            // List to hold the current combination of parentheses being built
            List<String> output = new ArrayList<>();
            // Start the backtracking process
            backtrack(n, 0, 0, output, result);
            return result; // Return the list of valid combinations
        }

        public void backtrack(int n, int leftCount, int rightCount, List<String> output, List<String> result) {
            // If we have used n left and n right parentheses, add the current combination to the result
            if (leftCount >= n && rightCount >= n) {
                // Join the current output list into a string and add it to the result list
                String outputStr = String.join("", output);
                result.add(outputStr);
                return; // Exit the method as we've found a valid combination
            }

            // If we can still add left parentheses, do so
            if (leftCount < n) {
                output.add("("); // Add a left parenthesis
                backtrack(n, leftCount + 1, rightCount, output, result); // Recur with updated counts
                output.remove(output.size() - 1); // Backtrack: remove the last added parenthesis
            }

            // If we can add a right parenthesis, do so only if it won't exceed the left ones
            if (rightCount < leftCount) {
                output.add(")"); // Add a right parenthesis
                backtrack(n, leftCount, rightCount + 1, output, result); // Recur with updated counts
                output.remove(output.size() - 1); // Backtrack: remove the last added parenthesis
            }
        }
    }


