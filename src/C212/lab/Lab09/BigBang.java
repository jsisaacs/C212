//Joshua Isaacson, jsisaacs, 10/31/2017

package C212.lab.Lab09;

import java.awt.event.MouseEvent;

public class BigBang extends javax.swing.JComponent implements java.awt.event.ActionListener, java.awt.event.MouseListener, java.awt.event.KeyListener
{
    javax.swing.Timer t;
    World w;

    public BigBang(World inputWorld) {
        w = inputWorld;
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
    }

    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        w.actionEvent();
        repaint();
    }

    public void mouseEntered(MouseEvent mouseEvent) {

    }

    public void mouseClicked(MouseEvent mouseEvent) {

    }

    public void mousePressed(MouseEvent mouseEvent) {
        w.mouseEvent(mouseEvent);
        repaint();
    }

    public void mouseReleased(MouseEvent mouseEvent) {

    }

    public void mouseExited(MouseEvent mouseEvent) {

    }

    public void keyTyped(java.awt.event.KeyEvent keyEvent) {

    }

    public void keyPressed(java.awt.event.KeyEvent keyEvent) {
        w.keyEvent(keyEvent);
        repaint();
    }

    public void keyReleased(java.awt.event.KeyEvent keyEvent) {

    }

    public void start(int input1, int input2) {
        javax.swing.JFrame localJFrame = new javax.swing.JFrame();
        localJFrame.setSize(input2, input2);
        t = new javax.swing.Timer(input1, this);
        localJFrame.add(this);
        localJFrame.setVisible(true);
        t.start();
    }

    public void paintComponent(java.awt.Graphics graphics) {
        w.draw(graphics);
    }
}