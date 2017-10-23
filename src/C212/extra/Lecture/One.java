package C212.extra.Lecture;

import javax.swing.*;
import java.awt.event.*;

public class One extends JFrame implements MouseMotionListener{
    public static void main(String[] args) {
        One a = new One();
        a.addMouseMotionListener(a);
        a.setVisible(true);
        a.setSize(300, 400);

        JLabel label = new JLabel("THIS IS A LABEL");
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse dragged at (" + x + ", " + y + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse moved at (" + x + ", " + y + ")");
    }
}
