package C212.homework.Homework07;

/*
P15.7
Modify the expression calculator of Section 15.6.3 to convert an
expression into reverse Polish notation. Hint: instead of evaluating
the top and pushing the result, append the instructions to a string.
 */

import java.util.Scanner;
import java.util.Stack;

public class SecondProblem {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        Stack<Integer> results = new Stack<Integer>();
        System.out.println("Enter one number or operator per line, Q to quit: ");
        boolean done = false;
        while (!done) {
            String input = consoleIn.next();
            if (input.equals("+")) {
                results.push(results.pop() + results.pop());
            } else if (input.equals("-")) {
                Integer arg2 = results.pop();
                results.push(results.pop() - arg2);
            } else if (input.equals("*") || input.equals("x")) {
                results.push(results.pop() * results.pop());
            } else if (input.equals("/")) {
                Integer arg2 = results.pop();
                results.push(results.pop() / arg2);
            } else if (input.equalsIgnoreCase("Q")) {
                done = true;
            } else {
                results.push(Integer.parseInt(input));
            }
            System.out.println(results);
        }
        consoleIn.close();
    }
}
