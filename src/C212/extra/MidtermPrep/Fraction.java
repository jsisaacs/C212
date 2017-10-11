//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
A Fraction is a pair of 2 ints called numerator and
denominator. Denominator can't be 0. Implement +,
-, *, and /.
 */

import java.io.IOException;

public class Fraction {
    //variables
    int numerator;
    int denominator;


    //Fraction constructor
    public Fraction(int numerator, int denominator) throws IOException{
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IOException();
        }
        else {
            this.denominator = denominator;
        }
    }

    public static void main(String[] args) throws IOException {
        Fraction f1 = new Fraction(1, 1);

    }
}
