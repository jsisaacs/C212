//Joshua Isaacson, jsisaacs, November 1, 2017

package C212.homework.Homework08;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

abstract interface World
{
    public abstract void actionEvent();

    public abstract void keyEvent(KeyEvent paramKeyEvent);

    public abstract void mouseEvent(MouseEvent paramMouseEvent);

    public abstract void paint(Graphics paramGraphics);
}