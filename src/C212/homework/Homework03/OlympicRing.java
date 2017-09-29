//Joshua Isaacson

package C212.homework.Homework03;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.BasicStroke;

public class OlympicRing {
    //instantiate private variables
    private int xLeft;
    private int yTop;

    //constructor takes an x and y input for positioning
    public OlympicRing(int x, int y) {
        this.xLeft = x;
        this.yTop = y;
    }
    //draws the ring
    public void draw(Graphics2D g2) {

        g2.setStroke(new BasicStroke(3));

        Ellipse2D.Double firstRing = new Ellipse2D.Double
                (xLeft + 20, yTop + 20, 50, 50);

        Ellipse2D.Double secondRing = new Ellipse2D.Double
                (xLeft + 35, yTop + 45, 50, 50);

        Ellipse2D.Double thirdRing = new Ellipse2D.Double
                (xLeft + 60, yTop + 20, 50, 50);

        Ellipse2D.Double fourthRing = new Ellipse2D.Double
                (xLeft + 85, yTop + 45, 50, 50);

        Ellipse2D.Double fifthRing = new Ellipse2D.Double
                (xLeft + 100,  yTop + 20, 50, 50);

        g2.setColor(Color.BLUE);
        g2.draw(firstRing);

        g2.setColor(Color.YELLOW);
        g2.draw(secondRing);

        g2.setColor(Color.BLACK);
        g2.draw(thirdRing);

        g2.setColor(Color.GREEN);
        g2.draw(fourthRing);

        g2.setColor(Color.RED);
        g2.draw(fifthRing);
    }
}
