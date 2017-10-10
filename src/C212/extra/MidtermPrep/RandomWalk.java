//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
drunkard randomly picks 1 of 4 directions and stumbles to the next intersection,
then again randomly picks 1 of 4 directions, etc. Locations are int pairs (x, y).
Implement the walk over 100 times, starting at (0, 0) and print the end location.
 */

import java.util.Random;

public class RandomWalk {
    //variables
    int x;
    int y;

    public RandomWalk(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void walk() {
        Random rand = new Random();
        int randomDirection = rand.nextInt(4 - 1) + 1;

        if (randomDirection == 1) {
            y = y + 1;
        }
        if (randomDirection == 2) {
            x = x + 1;
        }
        if (randomDirection == 3) {
            y = y - 1;
        }
        if (randomDirection == 4) {
            x = x - 1;
        }
    }

    public static void main(String[] args) {
        RandomWalk drunkard = new RandomWalk(0, 0);
        for (int i = 0; i < 100; i++) {
            drunkard.walk();
        }
        System.out.println("After 100 random walks, the drunkard is at: " +
                           "(" + drunkard.x + ", " + drunkard.y + ")");
    }
}
