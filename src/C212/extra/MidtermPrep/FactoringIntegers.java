//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
Asks the user for an integer and prints out its factors.
 */

import java.util.Scanner;

public class FactoringIntegers {
    public static int input;

    public static int nextFactor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer to be factored: ");
        input = scanner.nextInt();
        return input;
    }

    public static void hasMoreFactors(int input) {
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        hasMoreFactors(nextFactor());
    }
}
