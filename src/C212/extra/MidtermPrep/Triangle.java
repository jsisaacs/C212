//Joshua Isaacson, jsisaacs, October 7, 2017

package C212.extra.MidtermPrep;

/*
Define a class of objects called Triangle. A Triangle should be a set of 3 Lines.
However, a Triangle is created by specifying 3 Points. Using Heron's formula every
Triangle should be able to calculate and report its area. (If the 3 Points are
collinear the Triangle is very flat, its area is 0).
 */

public class Triangle {
    //variables
    Point p1;
    Point p2;
    Point p3;
    Line l1;
    Line l2;
    Line l3;

    //Triangle constructor takes 3 Points
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        l1 = new Line(p1, p2);
        l2 = new Line(p2, p3);
        l3 = new Line(p3, p1);
    }

    //area takes in a triangle object and calculates area with Heron's formula
    public double area() {
        double semipermeter = (l1.length() + l2.length() + l3.length()) / 2;

        double triangleArea = Math.sqrt(semipermeter*(semipermeter-l1.length())
                                                    *(semipermeter-l2.length())
                                                    *(semipermeter-l3.length()));

        return triangleArea;
    }

    public static void main(String[] args) {
        Triangle a = new Triangle(new Point(0, 0),
                                  new Point(0, 3),
                                  new Point(4, 0));
        System.out.println(a.area());

    }
}
