//Joshua Isaacson, jsisaacs, 10/2/2017

package C212.lab.Lab06;

import java.util.Scanner;

public class AsterisksGraph {

    public static void output(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 40) {
                System.out.println("****************************************");
            } else {
                for (int j = 0; j < input[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How long is the sequence? ");
        int los = input.nextInt();

        int[] sequence = new int[los];
        for (int i = 0; i < sequence.length; i++) {
            System.out.print("Number: ");
            sequence[i] = input.nextInt();
        }

        input.close();

        output(sequence);
    }
}
