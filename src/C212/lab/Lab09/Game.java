package C212.lab.Lab09;

import java.awt.event.KeyEvent;

public class Game implements World
{
    Circle circle;

    public Game() {
        circle = new Circle(200, 200, 1, 1, 30, java.awt.Color.WHITE);
    }

    public void teh() {
        circle.move();
    }

    public void draw(java.awt.Graphics paramGraphics) { circle.draw(paramGraphics); }


    public void meh(java.awt.event.MouseEvent paramMouseEvent) { System.out.println("Mouse event detected."); }

    public void keh(KeyEvent paramKeyEvent) {
        if (paramKeyEvent.getKeyCode() == 38) {
            circle.vy -= 1;
        } else if (paramKeyEvent.getKeyCode() == 40) {
            circle.vy += 1;
        } else if (paramKeyEvent.getKeyCode() == 37) {
            circle.vx -= 1;
        } else if (paramKeyEvent.getKeyCode() == 39) {
            circle.vx += 1;
        }
    }

    public static void main(String[] paramArrayOfString)
    {
        BigBang localBigBang = new BigBang(new Game());
        localBigBang.start(50, 400);
    }
}