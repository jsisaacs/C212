package C212.extra.MidtermPrep;

import java.util.Random;

public class GameOfNim {
    public static void main (String[] args) {
        Random rand = new Random();
        int initialPile = rand.nextInt(100-10) + 10;
        int whoStarts = rand.nextInt(1);
        if (whoStarts == 1) {
            //human starts
        }
        else {
            //computer starts
        }

        int smartOrStupid = rand.nextInt(1);
        if (smartOrStupid == 1) {
            //smart
            //computer takes enough to make the pile a power of
            //2 minus 1
            //TODO
        }
        else {
            //stupid
            //computer takes a random value (between 1 and n/2)
            //from the pile during their turn.
            //TODO
        }

    }
}
