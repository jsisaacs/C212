//Joshua Isaacson, jsisaacs, October 7, 2017

package C212.extra.MidtermPrep;

/*
Write a program to solve the Point problem.  Define a class of objects called Point
(2d).  A Point is thus a pair of 2 coordinates (x and y).  Every Point should be able
to calculate its distance to any other Point once the 2nd point is specified.
 */

public class Point {
    //variables
    public int x;
    public int y;

    //Point constructor takes two integers, x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Calculate the distance to from one point to another
    public double distanceTo(Point pointObj) {
        double d1 = Math.pow(((pointObj.x) - (this.x)), 2);
        double d2 = Math.pow(((pointObj.y) - (this.y)), 2);

        double distance = Math.sqrt(d1 + d2);

        return distance;
    }

    public static void main(String[] args) {
        Point a = new Point(3,0);
        Point b = new Point(0, 4);
        System.out.println(a.distanceTo(b));
        //System.out.println((new Point(1, 1).distanceTo((new Point()))));
    }
}
