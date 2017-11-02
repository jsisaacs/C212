//Joshua Isaacson, jsisaacs, 10/31/2017

package C212.lab.Lab09;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Game implements World
{
    Circle c;

    public Game() {
        c = new Circle(200, 200, 1, 1, 30, Color.GREEN);
    }

    public void keyEvent(KeyEvent paramKeyEvent) {
        if (paramKeyEvent.getKeyCode() == 37) {
            c.velocity_x -= 1;
        } else if (paramKeyEvent.getKeyCode() == 38) {
            c.velocity_y -= 1;
        } else if (paramKeyEvent.getKeyCode() == 39) {
            c.velocity_x += 1;
        } else if (paramKeyEvent.getKeyCode() == 40) {
            c.velocity_y += 1;
        }
    }

    public void actionEvent() {
        c.move();
    }

    public void draw(java.awt.Graphics paramGraphics) {
        c.draw(paramGraphics);
    }

    public void mouseEvent(java.awt.event.MouseEvent paramMouseEvent) {
        System.out.println("User triggered a mouse event!");
    }

    public static void main(String[] paramArrayOfString) {
        BigBang localBigBang = new BigBang(new Game());
        localBigBang.start(50, 400);
    }
}