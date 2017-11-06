//Joshua Isaacson, jsisaacs, November 1, 2017

package C212.homework.Homework08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Engine extends JComponent implements MouseListener, ActionListener, KeyListener {
    public static Timer t;
    public static World w;

    //Engine object constructor
    public Engine(World inputWorld) {
        w = inputWorld;
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        requestFocus();
    }

    //start begins the game
    public void start(int input1, int input2) {
        JFrame frame = new JFrame();
        frame.setTitle("Josh's Snake Game!");
        frame.add(this);
        frame.setVisible(true);
        frame.setSize(input2, input2);
        t = new Timer(input1, this);
        t.start();
    }

    //paintComponent draws the state after each tick
    public void paintComponent(Graphics g) {
        w.paint(g);
    }

    //actionPerformed handles what happens when an action occurs
    public void actionPerformed(ActionEvent ae) {
        w.actionEvent();
        repaint();
    }

    //required for keyEvent
    public void keyTyped(KeyEvent ke) {

    }

    //keyEvent is triggered when a key is pressed
    public void keyPressed(KeyEvent ke) {
        w.keyEvent(ke);
        repaint();
    }

    //required for keyEvent
    public void keyReleased(KeyEvent ke) {

    }

    //mousePressed is called when the mouse is triggered
    public void mousePressed(MouseEvent me) {
        w.mouseEvent(me);
        repaint();
    }

    //required for mouseEvent
    public void mouseClicked(MouseEvent me) {

    }

    //required for mouseEvent
    public void mouseReleased(MouseEvent me) {

    }
    //required for mouseEvent
    public void mouseEntered(MouseEvent me) {

    }

    //required for mouseEvent
    public void mouseExited(MouseEvent me) {

    }
}