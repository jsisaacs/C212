//Joshua Isaacson, jsisaacs, October 7, 2017

package C212.extra.MidtermPrep;

/*
Define a class of objects called Line. Every Line is a pair of 2 Points. A Point
is a pair of 2 numbers (the Lines are also in the plane). Points should be able to
determine their distance to other Points. Lines are created by passing 2 Points to
the Line constructor. A Line object must be able to report its length, which is the
distance between its 2 end points.  Make length a method and write a test program in
which you create a few Lines and ask them to report their lengths.
 */

public class Line {
    //variables
    Point p1;
    Point p2;

    //reference to Point
    Point p;

    //Line constructor
    public Line (Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    //length method returns the length of the line as a double
    public double length() {
        Point first = this.p1;
        Point second = this.p2;

        double length = first.distanceTo(second);
        return length;
    }


    public static void main(String[] args) {
        Line a = new Line(new Point(0, 0), new Point(1, 1));
        System.out.println(a.length());
    }
}
