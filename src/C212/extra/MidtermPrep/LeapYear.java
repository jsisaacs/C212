//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
asks user for input, computes whether that year is a leap year
 */

public class LeapYear {

    //isLeapYear
    public static Boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }
}
