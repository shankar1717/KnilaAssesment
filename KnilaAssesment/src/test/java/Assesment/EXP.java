package Assesment;

public class EXP {

    public static void main(String[] args) {

        // Given input expression
      //  String input = "[()]{}{[()()]()}";
        String input = "[(])";

        // Get the length of the input string
        int len = input.length();

        // Initialize a variable to represent the top of the stack
        int top = -1;

        // Create an array to simulate a stack to store opening brackets
        char[] stack = new char[len];

        // Loop through each character in the input expression
        for (char bracket : input.toCharArray()) {

            // Check if there is space in the stack array
            if (top < len - 1) {
                // Push the current bracket onto the stack
                stack[++top] = bracket;
            } else {
                // If there is no space in the stack, the brackets are not balanced
                System.out.println("Not Balanced");
                return;
            }

            // Check if the current character is a closing bracket and matches the top of the stack
                    if ((bracket == ')' && top >= 0 && stack[top] == '(')
                     || (bracket == '}' && top >= 0 && stack[top] == '{')
                     || (bracket == ']' && top >= 0 && stack[top] == '[')) {
                // If there is a match, decrement the top of the stack
                top--;
            } else {
                // If there is no match, the brackets are not balanced
                System.out.println("Not Balanced");
                return;
            }
        }

        // If the stack is empty, then the brackets are balanced
        if (top == -1) {
            System.out.println("Balanced");
        } else {
            // If the stack is not empty, there are unmatched opening brackets
            System.out.println("Not Balanced");
        }
    }
}
