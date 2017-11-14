//Joshua Isaacson, jsisaacs, November 14, 2017

package C212.homework.Homework09;

public class Adapter {
    //adapter provides an interface for ratchet to be compatible with socket
    //divide the ratchet's drive by 2 and set that value to its new drive size
    public static void makeFit(Ratchet ratchet, Socket socket) {
        double adaptedDrive = ratchet.getDrive() / 2;
        ratchet.setDrive(adaptedDrive);
    }
}
