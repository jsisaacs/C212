package C212.lab.Lab09;

import java.awt.Graphics;

public class Circle { int x;
    int y;
    int vx;

    public Circle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, java.awt.Color paramColor) { x = paramInt1;
        y = paramInt2;
        vx = paramInt3;
        vy = paramInt4;
        radius = paramInt5;
        c = paramColor;
    }

    public void draw(Graphics paramGraphics) { paramGraphics.setColor(c);
        paramGraphics.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);



        paramGraphics.setColor(java.awt.Color.RED);
        paramGraphics.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    int vy;
    int radius;
    java.awt.Color c;
    public void move() { x += vx;
        y += vy;
        x = (x < 0 ? 400 - x : x > 400 ? x - 400 : x);
        y = (y < 0 ? 400 - y : y > 400 ? y - 400 : y);
    }
}