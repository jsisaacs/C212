//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
The original US income tax of 1913
 */

import java.util.Scanner;

public class Cutoffs {
    //variables
    private static double incomeTax;

    public static double tax(double income) {
        if (income <= 50000) {
            incomeTax = income * 0.01;
        }
        if (income > 50000 && income <= 75000) {
            incomeTax = income * 0.02;
        }
        if (income > 75000 && income <= 100000) {
            incomeTax = income * 0.03;
        }
        if (income > 100000 && income <= 250000) {
            incomeTax = income * 0.04;
        }
        if (income > 250000 && income <= 500000) {
            incomeTax = income * 0.05;
        }
        if (income > 500000) {
            incomeTax = income * 0.06;
        }
        return incomeTax;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income;

        System.out.println("What is your income?");
        income = scan.nextDouble();
        System.out.println("Your income tax is: " + tax(income));
    }
}
