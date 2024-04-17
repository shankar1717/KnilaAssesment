package a.Test;

public class stack {

    // Declare instance variables: 'maxSize' for the maximum size of the stack,
    // 'top' to keep track of the top element, and 'StackArray' to store stack elements.
    int maxSize;
    int top;
    int[] StackArray;

    // Constructor method: Initializes the stack with a given size
    public stack(int size) {
        this.maxSize = size;
        this.StackArray = new int[maxSize];
        this.top = -1; // Initialize top as -1 to indicate an empty stack
    }

    // Method to push an element onto the stack
    public void push(int value) {
        // Check if there is space in the stack
        if (top < maxSize - 1) {
            StackArray[++top] = value; // Increment 'top' and add 'value' to StackArray
            System.out.println("Pushed " + value + " to the Stack");
        } else {
            System.out.println("Stack Overflow Cannot Push " + value); // Display error message if stack is full
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        // Check if stack is not empty
        if (top >= 0) {
            int poppedValue = StackArray[top--]; // Retrieve the top element and decrement 'top'
            System.out.println("Popped " + poppedValue + " From the stack");
            return poppedValue; // Return the popped value
        } else {
            System.out.println("Stack Underflow Cannot pop"); // Display error message if stack is empty
            return -1; // Return -1 to indicate underflow
        }
    }

    // Main method: Entry point of the program
    public static void main(String args[]) {
        // Create an instance of 'stack' with a maximum size of 5
        stack stack = new stack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        // Attempt to push more elements, causing a stack overflow
        stack.push(60); // This will result in Stack Overflow

        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        // Attempt to pop from an empty stack, causing a stack underflow
        stack.pop(); // This will result in Stack Underflow
    }
}
