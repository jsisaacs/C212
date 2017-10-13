//Joshua Isaacson
//Exhibit A

package C212.lab.Lab07;

import java.util.Random;

public class ExhibitA {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] values = new int[10];
        int randomInt = rand.nextInt(100-1) + 1;

        for (int i = 0; i < values.length; i++) {
            values[i] = randomInt;
        }

        for (int j = 0; j < values.length; j++) {
            if (values[j] != values[j+1]) {
                values[j] = randomInt;
            }
        }
    }
}