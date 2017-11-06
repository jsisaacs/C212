//Joshua Isaacson, jsisaacs, November 1, 2017

package C212.homework.Homework08;

import java.awt.*;

public class Circle {
    int pos_x;
    int pos_y;
    Color color;
    int radius;

    //Circle constructor
    public Circle(int x, int y, int r, Color c) {
        pos_x = x;
        pos_y = y;
        radius = r;
        color = c;
    }

    //colorPicker sets the color of the Circle
    public void colorPicker(Color c) {
        color = c;
    }

    //paint method for drawing the Circle objects
    public void paint(Graphics g) {
        //set the color of the inside of the Circle
        g.setColor(color);
        g.fillOval(pos_x - radius,
                   pos_y - radius,
                   2 * radius,
                   2 * radius);

        //set the color of the external part of the Circle
        g.setColor(Color.BLUE);
        g.drawOval(pos_x - radius,
                   pos_y - radius,
                   2 * radius,
                   2 * radius);
    }
}