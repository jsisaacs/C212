//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
Write a loop that fills an array values with ten random numbers between 1 and 100.
Write code for 2 nested loops that fill values with 10 different random numbers
between 1 and 100.
 */

import java.util.Random;

public class RandomNumbersWORepetiton {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100 - 1);

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("The array has " + array.length + " elements.");
    }
}
