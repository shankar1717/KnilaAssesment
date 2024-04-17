package TEST;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add {
    // Method to add numbers and print the sum
    public void add(int... numbers) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        
        // Iterate through the numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add the number to the sum
            sb.append(numbers[i]); // Append the number to the StringBuilder
            
            // If it's not the last number, append "+" to separate the numbers
            if (i < numbers.length - 1) {
                sb.append("+");
            }
        }
        sb.append("=" + sum); // Append the sum to the StringBuilder
        System.out.println(sb.toString()); // Print the result
    }
}

// Main class to demonstrate the addition functionality
public class Adder {
    public static void main(String[] args) {
        try {
            // Create a BufferedReader to read input from the console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // Read the input numbers
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());
            
            // Create an instance of the Add class
            Add ob = new Add();
            
            // Perform addition with different numbers of arguments
            ob.add(n1, n2); // Add two numbers
            ob.add(n1, n2, n3); // Add three numbers
            ob.add(n1, n2, n3, n4, n5); // Add five numbers
            ob.add(n1, n2, n3, n4, n5, n6); // Add six numbers
            
            // Reflection: Check for overloaded methods in the Add class
            Method[] methods = Add.class.getDeclaredMethods(); // Get all methods of the Add class
            Set<String> set = new HashSet<>(); // Set to store method names
            boolean overload = false; // Flag to indicate method overloading
            
            // Iterate through the methods
            for (int i = 0; i < methods.length; i++) {
                // If the method name is already in the set, set overload flag to true
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName()); // Add the method name to the set
            }
            
            // If method overloading is detected, throw an exception
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace
        }
    }
}
