package C212.extra.MidtermPrep;

/*
Reads a set of floating point values.  Print out the count of the values, the avg, and
the std dev.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {
    private static double totalX;



    public static double getAverage(ArrayList<Double> in) {
        double total = 0;
        double average = 0;

        for (int i = 0; i < in.size(); i++) {
            total = total + in.get(i);
        }
        average = total / in.size();
        return average;
    }

    public static double getStandardDeviation(ArrayList<Double> in) {
        double standardDev;
        double totalX2 = 0;
        double totalX = 0;

        for (int i = 0; i < in.size(); i++) {
            totalX2 = totalX2 + Math.pow(in.get(i), 2);
            totalX = totalX + in.get(i);
        }
        double oneOverN = 1/in.size();
        double firstLine = totalX2 - (oneOverN)*Math.pow(totalX, 2);
        double secondLine = in.size() - 1;
        standardDev = Math.sqrt(firstLine/secondLine);
        return standardDev;
    }

    public static String report(ArrayList<Double> in) {
        return "The data set has the following statistics: \n" +
                "Count: " + in.size() + "\n" +
                "Average: " + getAverage(in) + "\n" +
                "Standard Deviation: " + getStandardDeviation(in) + "\n";
    }

    public static void main (String[] args) {
        ArrayList<Double> input = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a value:");
        while (scan.hasNext()) {
            input.add(scan.nextDouble());
            if (scan.hasNext("exit")) {
                break;
            }
        }

        System.out.println(report(input));
    }
}
