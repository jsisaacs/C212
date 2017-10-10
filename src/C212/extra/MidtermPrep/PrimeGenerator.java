//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
Prompts the user for an integer and then prints all prime numbers up to that number.
 */

import java.util.Scanner;

public class PrimeGenerator {
    //variables
    public static int input;

    public static int nextPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide an integer: ");
        input = scanner.nextInt();
        return input;
    }

    public static void isPrime(int in) {
        for (int i = 0; i < in; i++) {
            if (i % 2 != 0 && i % 3 !=0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        isPrime(nextPrime());
    }
}

