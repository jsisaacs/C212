//Joshua Isaacson, jsisaacs, 10/31/2017

package C212.lab.Lab09;

import java.awt.*;

public class Circle { int x;
    int y;
    int velocity_x;
    int velocity_y;
    int r;
    java.awt.Color c;

    public Circle(int x_val, int y_val, int xvel, int yvel, int radius, java.awt.Color color) {
        x = x_val;
        y = y_val;
        velocity_x = xvel;
        velocity_y = yvel;
        r = radius;
        c = color;
    }

    public void draw(Graphics graphics) { graphics.setColor(c);
        graphics.fillOval(x - r, y - r, 2 * r, 2 * r);



        graphics.setColor(Color.BLUE);
        graphics.drawOval(x - r, y - r, 2 * r, 2 * r);
    }

    public void move() { x += velocity_x;
        y += velocity_y;
        x = (x < 0 ? 400 - x : x > 400 ? x - 400 : x);
        y = (y < 0 ? 400 - y : y > 400 ? y - 400 : y);
    }
}