//Joshua Isaacson
//Exhibit B

//Raw Score: 94

//randInt change = -3
//if -> for      = -2
//break          = -1

/*
What was changed:
- randInt = rand.nextInt(100 - 1) + 1
    was removed, instead just used rand.nextInt(100 - 1) + 1
- switched if statement in the 2nd part for a for loop, but
  used the same conditional
-added a break statement to stop the loop
 */

package C212.lab.Lab07;

import java.util.Random;

public class ExhibitB {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(100 - 1) + 1;
        }

        for (int a = 0; a < values.length; a++) {
            values[a] = rand.nextInt(100 - 1) + 1;
            for (int b = 0; b < a; b++) {
                if (values[a] == values[b]) {
                    a--;
                    break;
                }
            }
        }
    }
}

