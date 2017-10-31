//Joshua Isaacson, jsisaacs, 10/2/2017

package C212.lab.Lab06;

import java.util.Scanner;

public class MagicSquare {
    private static int n;

    private static void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        n = input.nextInt();
        if (n% 2 == 0) throw new RuntimeException("Input isn't odd."); {
        }
    }

    private static void magic() {
        int[][] magicSquare = new int[n][n];
        int row = n - 1;
        int column = n / 2;
        magicSquare[row][column] = 1;

        for (int a = 2; a <= n*n; a++) {
            if (magicSquare[(row + 1) % n][(column + 1) % n] == 0) {
                row = (row + 1) % n;
                column = (column + 1) % n;
            }
            else {
                row = (row - 1 + n) % n;
            }
            magicSquare[row][column] = a;
        }

        for (int a = 0; a < n; a++) {
            System.out.print("[");
            for (int b = 0; b < n; b++) {

                if (magicSquare[a][b] < 10){
                    System.out.print(" ");  // for alignment
                }
                if (magicSquare[a][b] < 100){
                    System.out.print(" ");  // for alignment
                }
                System.out.print(magicSquare[a][b] + " ");

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
