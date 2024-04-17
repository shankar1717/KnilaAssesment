package TEST;

import java.util.*;

public class Brackets {
    public static void main(String[] args) {
        // Define the input strings
        String[] inputs = {"{}()", "({()})", "{}(", "[]"};

        for (String input : inputs) {
            System.out.println(isBalanced(input));
        }
    }
    
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                // If it's an opening parenthesis, push it onto the stack
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                // If it's a closing parenthesis, check if the stack is empty
                if (stack.isEmpty()) {
                    return false; // Unbalanced
                }
                char top = stack.pop(); // Get the top element from the stack
                // Check if the closing parenthesis matches the top element
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false; // Mismatched parentheses
                }
            }
        }
        
        // After iterating through the string, if the stack is empty, the string is balanced
        return stack.isEmpty();
    }
}

