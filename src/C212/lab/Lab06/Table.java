package C212.lab.Lab06;

public class Table {

    private static int[][] values;

    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    public static double neighborAverage(int row, int column) {
        int total = 0;
        if (row > 0) {
            total = total + values[row - 1][column];
        }
        if (row < values.length - 1) {
            total = total + values[row + 1][column];
        }

        return total;
    }

    public static void main(String[] args) {
        Table exTable = new Table(5, 3);
        System.out.println(exTable.values[0][0]);
        exTable.set(0, 0, 5);
        System.out.println(exTable.values[0][0]);
        System.out.println(neighborAverage(4, 4));
    }
}
