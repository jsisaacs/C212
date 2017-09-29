package C212.lab.Lab03;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class TreeScaler {
  int x, y;
  double scale;
  public TreeScaler(int x, int y, double scale) {
    this.x = x;
    this.y = y;
    this.scale = scale;
  }
  private int scale(int size) {
    return (int)(this.scale * size);
  }
  public void draw(Graphics g) {
    Color specialTreeGreen = new Color(117, 215, 149);
    Color specialTreeBrown = new Color(131, 60, 40);
      
    g.setColor(specialTreeGreen);
    g.fillPolygon(new Polygon
                    ( new int[] { x + scale(200), x + scale(250), x + scale(150) },
                      new int[] { y + scale(0), y + scale(100), y + scale(100) }, 3));
    g.fillPolygon(new Polygon
                    ( new int[] { x + scale(200), x + scale(250), x + scale(150) },
                      new int[] { y + scale(60), y + scale(140), y + scale(140) }, 3));
    g.setColor(specialTreeBrown);
    g.fillRect(x + scale(185), y + scale(140), scale(35), scale(60));
  }
}