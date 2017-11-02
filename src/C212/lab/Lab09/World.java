//Joshua Isaacson, jsisaacs, 10/31/2017

package C212.lab.Lab09;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

abstract interface World
{
    public void keyEvent(KeyEvent paramKeyEvent);

    public void actionEvent();

    public void draw(Graphics paramGraphics);

    public void mouseEvent(MouseEvent paramMouseEvent);


}