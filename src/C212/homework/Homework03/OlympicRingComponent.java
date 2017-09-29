//Joshua Isaacson

package C212.homework.Homework03;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class OlympicRingComponent extends JComponent{
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        OlympicRing ring1 = new OlympicRing(0, 0);

        ring1.draw(g2);

    }
}
