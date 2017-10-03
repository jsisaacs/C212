//Joshua Isaacson, jsisaacs, 10/2/2017


package C212.lab.Lab06;

public class Table {

    private static int[][] values;
    private static int rows;
    private static int columns;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    public static double sum(int i, boolean horizontal) {
        int total = 0;

        if (horizontal == false) {
            for (int a = 0; a < rows; a++) {
                total += values[i][a];
            }

        }
        if (horizontal == true) {
            for (int b = 0; b < columns; b++) {
                total += values[b][i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        //this would generate a table with 2 rows and 2 columns
        Table exTable = new Table(2, 2);

        exTable.set(0, 0, 1);
        exTable.set(0, 1, 1);
        exTable.set(1, 0, 1);
        exTable.set(1, 1, 3);

        //should print 2.0
        System.out.println(sum(0, false));

        //should print 4.0
        System.out.println(sum(1, true));
    }
}
