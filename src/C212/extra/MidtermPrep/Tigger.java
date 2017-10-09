package C212.extra.MidtermPrep;

/*
Design a Tigger class to implement his bouncing movement.  A Tigger will always
start in a random point (x, y).  When bounce() is called, Tigger changes its position
(x, y):
    x becomes the sum of the squares of its digits
    y becomes the sum of the squares of its digits

 */

public class Tigger {
    //variables
    int x;
    int y;

    //Tigger constructor
    public Tigger (int x, int y) {
        this.x = x;
        this.y = y;
    }

    //bounce moves Tigger to a new position
    public void bounce () {
        //get the number of digits in both x and y

        //square the digits and add them together for x and y

    }

    public static void main (String[] args) {
        Tigger t1 = new Tigger(0, 0);
    }
}
