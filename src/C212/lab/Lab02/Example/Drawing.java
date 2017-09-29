//Joshua Isaacson

package C212.lab.Lab02.Example;

import javax.swing.JFrame;

public class Drawing {
  public static void main(String[] args) {
    JFrame a = new JFrame();
    a.setVisible(true);
    a.setSize(500, 500);
    Penguin p = new Penguin(500, 500);
    a.add(p);
  }
}
