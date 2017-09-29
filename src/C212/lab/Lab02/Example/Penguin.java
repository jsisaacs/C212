package C212.lab.Lab02.Example;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Penguin extends JComponent{
  
  //instance variables
  int width, height; 
  
  //constructor
  public Penguin(int width, int height) {
    this.width = width;
    this.height = height;
  }
  
  int count;
  
  public void paintComponent(Graphics g) {
    this.count += 1;
    System.out.println("I am drawing..." + this.count);
    
    g.setColor(Color.WHITE); 
    g.fillRect(  0,   0, 500, 500); // background (see marks by circle)         [ 0] 
    g.setColor(Color.BLACK); 
    g.fillPolygon( new Polygon // put this last                                 [11] 
                    ( new int[] {  10, 265, 499 }, 
                      new int[] { 274,  60, 274 }, 
                      3
                    )
                 );
    int left = 5;
    g.fillOval( 80-left,  50, 365, 400); // body                                [ 1] 
    g.setColor(new Color(220, 220, 220)); 
    g.fillOval(120-left, 190, 290, 250); // larger belly                        [ 2] 
    g.setColor(Color.WHITE); 
    g.fillOval(155-left, 195, 220, 240); // smaller belly                       [ 3] 
    g.setColor(new Color(240, 200, 40)); // some gold 
    g.fillOval( 85-left, 390, 175,  80); // right foot (left)                   [ 4] 
    g.setColor(new Color(240, 200, 40)); 
    g.fillOval(285-left, 390, 175,  80); // left foot (right)                   [ 5] 
    g.setColor(new Color(255, 255, 255)); 
    g.fillOval(170-left,  74,  92, 117); // right eye (left)                    [ 6] 
    g.setColor(new Color(255, 255, 255)); 
    g.fillOval(264-left,  94, 107,  79); // left eye (right)                    [ 7] 
    g.setColor(Color.BLACK);  
    g.fillOval(230-left, 120,  25,  33); // right eye pupil (left)              [ 8] 
    g.fillOval(270-left, 124,  17,  23); // left eye pupil (right)              [ 9] 
    g.setColor(new Color(240, 200, 40)); // gold as feet
    g.fillArc (188-left, 173, 150, 150, 55,  65); // bill, beak                 [10] 
  }   
}