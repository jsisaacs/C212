//Joshua Isaacson, jsisaacs, October 9, 2017

package C212.extra.MidtermPrep;

/*
turnLeft (90 degrees)
moveForward (1 step)

Robot needs to remember its location
getX()
getY()

Robot object needs a location (x, y), a name, direction

robot needs to be able to:
report the direction() (N, S, W, E)
produce a report() (x, y, name, direction)
 */

public class Robot {
    //variables
    int x;
    int y;
    String name;
    String direction;

    //Robot constructor
    public Robot(int x, int y, String name, String direction) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.direction = direction;
    }

    //getX gets x
    public int getX() {
        return x;
    }

    //getY gets y
    public int getY() {
        return y;
    }

    //turnLeft rotates the robot's direction to the left
    public void turnLeft() {
        if (this.direction.equals("North")) {
            direction = "West";
        }
        if (this.direction.equals("East")) {
            this.direction = "North";
        }
        if (this.direction.equals("South")) {
            this.direction = "East";
        }
        if (this.direction.equals("West")) {
            this.direction = "South";
        }
        else {
            System.out.println("That is not a valid direction.");
        }
    }

    //moveForward moves the robot's position forward 1 unit
    public void moveForward() {
        x = x + 1;
    }

    //report gives a breakdown of the Robot's attributes
    public void report() {
        System.out.println("Robot " + name + " located at " + "(" + getX() + ", " + getY() + ")" + " facing " + direction);
    }

    public static void main (String[] args) {
        Robot a = new Robot(2, 3, "Alice", "North");
        a.report();
    }
}
