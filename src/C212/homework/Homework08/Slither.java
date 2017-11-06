//Joshua Isaacson, jsisaacs, November 1, 2017

package C212.homework.Homework08;

import java.util.*;
import java.awt.*;

public class Slither extends ArrayList {

    public static String begin = "5";

    //Slither object constructor
    public Slither() {

        int i = 10;

        //create the inital state for the slithering snake
        add(new Circle(200 + 0 * i,
                200 + 0 * i,
                5,
                Color.GREEN));
        add(new Circle(200 + 0 * i,
                200 + 1 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 0 * i,
                200 + 2 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 0 * i,
                200 + 3 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 0 * i,
                200 + 4 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 1 * i,
                200 + 4 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 2 * i,
                200 + 4 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 3 * i,
                200 + 4 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 3 * i,
                200 + 3 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 3 * i,
                200 + 2 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 4 * i,
                200 + 2 * i,
                5,
                Color.LIGHT_GRAY));
        add(new Circle(200 + 5 * i,
                200 + 2 * i,
                5,
                Color.LIGHT_GRAY));
    }

    //setDirection takes the direction for the inital state
    public void setDirection(String direction) { begin = direction; }

    //move orients the Slither object at each tick of the World
    public void move() {
        if (":2:3:1:4:".contains(begin)) {
            int x = ((Circle)get(0)).pos_x;;
            int y = ((Circle)get(0)).pos_y;;
            int offset = 10;

            if (begin.equals("2")) {
                add(0, new Circle(x,
                        y - offset,
                        offset / 2,
                        Color.GREEN));
            }
            else if (begin.equals("3")) {
                add(0, new Circle(x + offset,
                        y,
                        offset / 2,
                        Color.GREEN));
            }
            else if (begin.equals("4")) {
                add(0, new Circle(x,
                        y + offset,
                        offset / 2,
                        Color.GREEN));
            }
            else if (begin.equals("1")) {
                add(0, new Circle(x - offset,
                        y,
                        offset / 2,
                        Color.GREEN));
            }
            ((Circle)get(1)).colorPicker(Color.LIGHT_GRAY);
            remove(size() - 1);
        }
    }

    //draw method for the Slither object
    public void draw(Graphics g) {
        for (int i = size() - 1; i >= 0; i--)
            ((Circle)get(i)).paint(g);
    }
}