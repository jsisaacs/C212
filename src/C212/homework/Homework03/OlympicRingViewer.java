//Joshua Isaacson

package C212.homework.Homework03;

import javax.swing.JFrame;

public class OlympicRingViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(170, 130);
        frame.setTitle("Two rings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OlympicRingComponent component = new OlympicRingComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
