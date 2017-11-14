//Joshua Isaacson, jsisaacs, November 14, 2017

package C212.homework.Homework09;

public class Socket {
    //socket's drive is 1/2 the size of ratchet's drive
    private double driveSocketSize;

    public Socket(double drive) {
        this.driveSocketSize = drive;
    }

    public double getDrive() {
        return driveSocketSize;
    }
}
