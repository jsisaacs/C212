//Joshua Isaacson, jsisaacs, October 7, 2017

package C212.extra.MidtermPrep;

/*
Choose a random number between 1 and 3, associated with
the 3 states.
 */

import java.util.Random;

public class RandomNumbers {
    static Random rand = new Random();

    public static String randomState() {
        int friend = rand.nextInt(15 - 1) + 1;

        if (friend <= 10) {
            return "Cali";
        }
        else if (friend <= 13) {
            return "Nevada";
        }
        else {
            return "Utah";
        }
    }
    
    public static void main(String[] args) {
        int tries = 1000;
        int cali = 0;
        int nevada = 0;
        int utah = 0;

        for (int i = 0; i < tries; i++) {
            if (randomState() == "Cali") {
                cali++;
            }
            if (randomState() == "Nevada") {
                nevada++;
            }
            if (randomState() == "Utah") {
                utah++;
            }
        }
        System.out.println("Cali: " + cali + "\n" +
                           "Nevada: " + nevada + "\n" +
                           "Utah: " + utah + "\n");
    }
}
