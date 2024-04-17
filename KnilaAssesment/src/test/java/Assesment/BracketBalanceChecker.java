package Assesment;

import java.util.Stack;

public class BracketBalanceChecker {

    // Main method where the expressions are checked for balance
    public static void main(String[] args) {
        String expression1 = "[()]{}{[()()]()}";
        String expression2 = "[(])";

        // Checking and printing the balance status of the expressions
        System.out.println("Expression 1 is " + (isBalanced(expression1) ? "Balanced" : "Not Balanced"));
        System.out.println("Expression 2 is " + (isBalanced(expression2) ? "Balanced" : "Not Balanced"));
    }

    // Method to check if the given expression is balanced
    public static boolean isBalanced(String exp) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the expression
        for (char c : exp.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If the character is a closing bracket
            else if (c == ')' || c == '}' || c == ']') {
                // If the stack is empty or the closing bracket does not match
            	//the corresponding opening bracket, return false
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all opening brackets have a corresponding 
        //closing bracket, and the expression is balanced
        return stack.isEmpty();
    }

    // Helper method to check if the given opening and closing brackets form a valid pair
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}
