package C212.lab.Lab03;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

public class TreeMain extends JComponent {
  public static void main(String[] args) {
    JFrame frame = new JFrame(); 
    frame.setVisible(true); 
    int width = 650, height = 650;
    frame.setSize(width + 20, height + 40); 
    TreeMain drawing = new TreeMain (width, height); 
    frame.add(drawing);
  }
  int width, height;
  TreeScaler a, b, c, d;
  public TreeMain(int width, int height) {
    this.width = width;
    this.height = height;
    a = new TreeScaler( 20,  50, 1.2);
    b = new TreeScaler(220,  20, 1.3);
    c = new TreeScaler( 40, 230, 1.5);
    d = new TreeScaler( 100, 100, 1.0);
  }
  public void paintComponent(Graphics g) {
    a.draw(g);
    b.draw(g);
    c.draw(g);
    d.draw(g);
  }
}