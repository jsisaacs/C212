//Joshua Isaacson, jsisaacs, 10/30/2017

package C212.lab.Lab06;

import java.util.*;

public class MagicSquareArrayList {
    private static int size;

    private static void input() {
        // This section simply gets user input to see how large of a
        // square to make.
        Scanner in;
        in = new Scanner(System.in);
        System.out.print("Size: ");
        size = in.nextInt();
        // an error if the user put an even number
        if ((size % 2) == 0) {
            System.out.println("Input isn't odd");
        }
    }

    private static void magic() {
        ArrayList<ArrayList<Integer>> magic = new ArrayList<ArrayList<Integer>>();
        //this creates an ArrayList of the size that we need
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> x = new ArrayList<Integer>();
            for (int j = 0; j < size; j++) {
                x.add(0);
            }
            magic.add(x);
        }

        //sets all the basics as defined in the problem
        int row = size-1;
        int col = size/2;
        magic.get(row).set(col, 1);

        // This creates the square. It follows the set of rules given
        // in the instructions. Note that we start with k = 2 because
        // 1 is already correctly placed in the square.
        for (int k = 2; k <= size*size; k++) {
            if (row + 1 < size && col + 1 < size) {
                if (magic.get(row + 1).get(col + 1) == 0) {
                    row = (row + 1) % size;
                    col = (col + 1) % size;
                } else {
                    row = (row - 1 + size) % size;
                }
            } else if (row + 1 >= size && col + 1 >= size) {
                row = row - 1;
                col = col;
            } else if (row + 1 >= size) {
                row = 0;
                col = col + 1;
            } else {
                row = row + 1;
                col = 0;
            }
            magic.get(row).set(col, k);
        }

        //This is where we print our square. I added some spacing and brackets to make it look pretty.
        for (int i = 0; i < size; i++) {
            System.out.print("[");
            for (int j = 0; j < size; j++) {
                if (magic.get(i).get(j) < 10) System.out.print(" ");
                if (magic.get(i).get(j) < 100) System.out.print(" ");
                System.out.print(magic.get(i).get(j) + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        input();
        magic();
    }
}
