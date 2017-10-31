//Joshua Isaacson, jsisaacs, October 30, 2017

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
        //initialize the scanner and the Stack from the Collections
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> output = new Stack<Integer>();

        //opening statement
        System.out.println("Type in a number, or an operator.");
        System.out.println("If you want to quit, just press q.");

        boolean done = false;

        while (!done) {
            //prompts user input
            String input = scanner.next();

            //if char == +, add and pop
            if (input.equals("+")) {
                output.push(output.pop() + output.pop());
            }

            //if char == -, subtract and pop
            else if (input.equals("-")) {
                Integer arg2 = output.pop();
                output.push(output.pop() - arg2);
            }

            //if char == *, multiply and pop
            else if (input.equals("*") || input.equals("x")) {
                output.push(output.pop() * output.pop());
            }

            //if char == /, divide and pop
            else if (input.equals("/")) {
                Integer arg2 = output.pop();
                output.push(output.pop() / arg2);
            }

            //if char == Q, quit the while loop
            else if (input.equalsIgnoreCase("Q")) {
                done = true;
            } else {
                output.push(Integer.parseInt(input));
            }

            //print out the Stack at each point
            System.out.println("Stack: " + output);
        }
        scanner.close();
    }
}
