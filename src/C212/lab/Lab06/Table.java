package C212.lab.Lab06;

public class Table {

    private int[][] values;

    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    public double neighborAverage(int row, int column) {

    }
}
