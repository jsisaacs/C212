package C212.lab.Lab09;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

abstract interface World
{
    public abstract void draw(Graphics paramGraphics);

    public abstract void teh();

    public abstract void meh(MouseEvent paramMouseEvent);

    public abstract void keh(KeyEvent paramKeyEvent);
}