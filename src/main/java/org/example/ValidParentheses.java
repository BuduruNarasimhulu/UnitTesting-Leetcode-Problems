package org.example;
import java.util.Stack;
public class ValidParentheses {

        public boolean isValid(String s) {
            // Create a stack to keep track of opening brackets
            Stack<Character> stact = new Stack<Character>();

            // Iterate through each character in the input string
            for (char index : s.toCharArray()) {
                // Push the corresponding closing bracket onto the stack for each opening bracket
                if (index == '(') {
                    stact.push(')'); // For '(', expect a ')'
                } else if (index == '[') {
                    stact.push(']'); // For '[', expect a ']'
                } else if (index == '{') {
                    stact.push('}'); // For '{', expect a '}'
                }
                // Check for closing brackets
                else if (index == ')' || index == ']' || index == '}') {
                    // If the stack is empty or the top of the stack doesn't match the current closing bracket
                    if (stact.isEmpty() || stact.pop() != index) {
                        return false; // Return false if there's a mismatch
                    }
                }
            }
            // Return true if all opening brackets were matched; stack should be empty
            return stact.isEmpty();
        }
}


