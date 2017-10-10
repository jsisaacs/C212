//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
Write a program that reads a set of floating-point values. Ask the user
to enter the values, then print the average, the smallest, the largest,
and the range.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Conversation {
    //variables
    static ArrayList<Double> input = new ArrayList<>();
    static double smallest;
    static double largest;

    public static void add(double value) {
        input.add(value);
    }

    public static void userInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your data set:");
        while (scan.hasNext()) {
            add(scan.nextDouble());
            if (scan.hasNext("exit")) {
                break;
            }
        }
    }

    public static void average(ArrayList<Double> dataset) {
        double total = 0;

        for (int i = 0; i < dataset.size(); i++) {
            total = total + dataset.get(i);
        }
        double average = total/dataset.size();
        System.out.println("Average: " + average);
    }

    public static void smallest(ArrayList<Double> dataset) {
        smallest = Collections.min(dataset);
        System.out.println("Smallest: " + smallest);
    }

    public static void largest(ArrayList<Double> dataset) {
        largest = Collections.max(dataset);
        System.out.println("Largest: " + largest);
    }

    public static void range(ArrayList<Double> dataset) {
        double range = largest - smallest;
        System.out.println("Range: " + range);

    }

    public static void main(String[] args) {
        userInput();
        average(input);
        smallest(input);
        largest(input);
        range(input);
    }

}
