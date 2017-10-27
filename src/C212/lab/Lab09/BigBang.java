package C212.lab.Lab09;

import java.awt.event.MouseEvent;

public class BigBang extends javax.swing.JComponent implements java.awt.event.ActionListener, java.awt.event.MouseListener, java.awt.event.KeyListener
{
    javax.swing.Timer timer;
    World world;

    public BigBang(World paramWorld) {
        world = paramWorld;
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
    }

    public void start(int paramInt1, int paramInt2) { javax.swing.JFrame localJFrame = new javax.swing.JFrame();
        localJFrame.add(this);
        localJFrame.setVisible(true);
        localJFrame.setSize(paramInt2, paramInt2);
        timer = new javax.swing.Timer(paramInt1, this);
        timer.start(); }

    public void mouseEntered(MouseEvent paramMouseEvent) {}

    public void mouseExited(MouseEvent paramMouseEvent) {}
    public void mousePressed(MouseEvent paramMouseEvent) { world.meh(paramMouseEvent);
        repaint(); }

    public void mouseReleased(MouseEvent paramMouseEvent) {}

    public void mouseClicked(MouseEvent paramMouseEvent) {}
    public void keyPressed(java.awt.event.KeyEvent paramKeyEvent) { world.keh(paramKeyEvent);
        repaint();
    }

    public void keyReleased(java.awt.event.KeyEvent paramKeyEvent) {}

    public void keyTyped(java.awt.event.KeyEvent paramKeyEvent) {}

    public void actionPerformed(java.awt.event.ActionEvent paramActionEvent) {
        world.teh();
        repaint();
    }

    public void paintComponent(java.awt.Graphics paramGraphics) { world.draw(paramGraphics); }
}