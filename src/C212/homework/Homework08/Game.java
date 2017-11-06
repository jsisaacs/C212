//Joshua Isaacson, jsisaacs, November 1, 2017

package C212.homework.Homework08;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.Graphics;

public class Game implements World
{
    public static Slither slither;

    //constructor for a Game object
    public Game() {
        slither = new Slither();
    }

    //actionEvent calls the move() to adjust the position of the snake at each tick
    public void actionEvent() {
        slither.move();
    }

    //required for mouseEvent
    public void mouseEvent(MouseEvent me) {

    }

    //keyEvent handles the user input via keyboard
    public void keyEvent(KeyEvent ke) {
        if (ke.getKeyCode() == 37) {
            slither.setDirection("1");
        }
        else if (ke.getKeyCode() == 39) {
            slither.setDirection("3");
        }
        else if (ke.getKeyCode() == 38) {
            slither.setDirection("2");
        }
        else if (ke.getKeyCode() == 40) {
            slither.setDirection("4");
        }
        else {
            int keyEvent = ke.getKeyChar();
            if (keyEvent == 53) {
                slither.setDirection("5");
            }
            else if (keyEvent == 56) {
                slither.setDirection("2");
            }
            else if (keyEvent == 50) {
                slither.setDirection("4");
            }
            else if (keyEvent == 52) {
                slither.setDirection("1");
            }
            else if (keyEvent == 54) {
                slither.setDirection("3");
            }
        }
    }

    //paint method draws the state of the world at each tick
    public void paint(Graphics g) {
        slither.draw(g);
    }

    public static void main(String[] paramArrayOfString) {
        Engine engineInstance = new Engine(new Game());
        engineInstance.start(200, 400);
    }
}