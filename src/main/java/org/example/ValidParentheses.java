package org.example;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String stringTypeOfParentheses) {
        // Create a stack to keep track of opening brackets
        Stack<Character> characterStack = new Stack<Character>();

        // Iterate through each character in the input string
        for (char index : stringTypeOfParentheses.toCharArray()) {
            // Push the corresponding closing bracket onto the stack for each opening bracket
            if (index == '(') {
                characterStack.push(')'); // For '(', expect a ')'
            } else if (index == '[') {
                characterStack.push(']'); // For '[', expect a ']'
            } else if (index == '{') {
                characterStack.push('}'); // For '{', expect a '}'
            }
            // Check for closing brackets
            else if (index == ')' || index == ']' || index == '}') {
                // If the stack is empty or the top of the stack doesn't match the current closing bracket
                if (characterStack.isEmpty() || characterStack.pop() != index) {
                    return false; // Return false if there's a mismatch
                }
            }
        }
        // Return true if all opening brackets were matched; stack should be empty
        return characterStack.isEmpty();
    }
}


