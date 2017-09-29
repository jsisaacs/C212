//Joshua Isaacson - jsisaacs
//9/17/17


package C212.homework.Homework04;

import java.util.Random;
import java.util.Scanner;

public class RandomState {

    static Random rand = new Random();

    public static String randomState() {
        int friend = 1 + rand.nextInt(14);
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

    public static void main(String[] argv) {
        int tries = Integer.parseInt(argv[0]);
        int cali = 0;
        int nev = 0;
        int utah = 0;
        for (int i = 0; i < tries; i++) {
            String state = randomState();
            switch (state) {
                case "Cali":
                    cali++;
                    break;
                case "Nevada":
                    nev++;
                    break;
                case "Utah":
                    utah++;
                    break;
            }
        }

        System.out.printf("Cali: %d/%d = %f expected: %f\n",
                cali, tries, (double) cali/tries, (10d/15d));
        System.out.printf("Nevada: %d/%d = %f expected: %f\n",
                nev, tries, (double)nev/tries, (3d/15d));
        System.out.printf("Utah: %d/%d = %f expected: %f\n",
                utah, tries, (double)utah/tries, (2d/15d));
    }
}
