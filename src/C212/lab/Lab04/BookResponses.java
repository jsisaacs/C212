//Joshua Isaacson


package C212.lab.Lab04;

import java.util.Scanner;

public class BookResponses {
    public static void main(String[] args) {
        //R5.2
        /*
        Considering both x and y > 0.  For the first example, s = 2 because the first if
        statement will run, adding 1 to the value of s, then the next if statement will run
        add 1 more to s, making the value 2.  In the second example, the compiler doesn't
        execute the first if and then the else if.  If the first condition is not met, then
        the else if condition is run.  Only the first if would run, so s = 1.  If you make x
        and y <= to 0, which doesn't satisfy the else if condition, then the if statement
        is not executed and then the else if is also not executed because y > 0, so s = 0.
         */

        //R5.7
        /*
        It it more difficult because of round-off error and the nature of some floats
        in reality to be never ending or too large to hold in memory, so they are
        rounded off at a certain place.  Over time, this could add up to be a big
        issue.
         */
        int x = 10;
        double y = 10.0;

        final double EPSILON = 1E-14;
        if (Math.abs(x - y) <= EPSILON) {
            System.out.println("x is approximately equal to y.");
        }
        else {
            System.out.println("x is not approximately equal to y.");
        }
        //R5.12
        /*
        if 10 > 11 <- False
        else       <- True
            s = 11
        if 12 < 13 <- True
            e = 12
        if 11 < 12 <- True
            The appointments overlap. <- END

        ---------------------------------------------------------------------

        if 10 > 12 <- False
        else       <- True
            s = 12
        if 11 < 13 <- True
            e = 11
        if 12 < 11 <- False
        Else
            The appointments don't overlap. <- END
         */

        //R5.21
        /*
        Space -> Numbers -> Uppercase letters -> lowercase letters

        h. "Car", "Carl"

         */

        //R5.26
        double gpa = 1.75;
        if (gpa > 1.5)
            if (gpa < 2.0)
               System.out.println("You are on probation.");
        else
            System.out.println("You are failing.");

        //R5.30
        /*
        a. false           e. false
        b. true            f. false
        c. true            g. false
        d. true            h. true
         */

        //R5.31
        /*
        a.  b
        b. !b
        c. !b
        d.  b
         */

        //R5.32
        /*
        a. if (n==0) {
            b = b;
            }
            else {
            b = !b
            }
        b. if (n==0) {
            b = !b;
           }
           else {
           b = b;
           }
        c. b = !b;
           if (n>1) {
            if (n<2) {
              b = b;
            }
           }
        d. if (n<1) {
            b = b;
           }
           else {
            b = n > 2;
           }

         */

        //R6.1(a)
        /*
        Prints the following:

        *
        **
        ***
        ****

         */
        String stars = "*****";
        String stripes = "=====";

        int i = 0;
        while (i < 5) {
           System.out.println(stars.substring(0, i));
            i++;
        }

        //R6.2(a)
        /*
        Prints the following:

        0 10
        1 9
        2 8
        3 7
        4 6

         */
        int k = 0;
        int j  = 10;
        while (i < j) {
            System.out.println(k + " " + j);
            k++;
            j--;
        }

        //R6.5(a,c)
        //a.
        int e = 2;
        while (e <= 100) {
            System.out.println(" " + e);
            e += 2;
        }

        //c.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int z = a; z <= b; z++) {
            if ((z % 2) == 1) {
                sum = sum + z;
            }
        }
        System.out.println(" " + sum);

        //R6.13
        //(a) 6
        //(b) 5
        //(c) 5
        //(d) 6
        //(e) infinite loop
        //(f) 3
        //(g) 2

        //R6.18
        int s = 0;
        int f = 1;
        while (f <= 10) {
            s = s + f;
            System.out.println(s);
            f += 1;
        }

        //R6.19
        int n = in.nextInt();
        double c = 0;
        double d = 10;
        while (d > 0.01) {
            d = 1.0 / (1 + n * n);
            n++;
            c = c + d;
        }
        System.out.println(c);

        //R6.20
        /*
        (a)
        s n
        1 1
        2 2
        5 3
        8 4
        (b)
        s n
        1 1
        2 2
        4 3
        (c)
        s n
        1 1
        2 2
        4 3
        7 4
        11 5
        16 6
        22 7
        29 8
        37 9
        46 10
        56 11
        67 12
        79 13
        92 14
        106 15
        121 16
        137 17
        154 18
        172 19
        191 20
        211 21
         */


        //R6.29
        /*
        Nested loops are loops inside another loop statement.
        An example where a nested loop is typically used is for showing
        the hour and minute displays in a digital clock.  The hours loop
        12 times and the each hours the minutes loop 60 times.
         */
    }
}
