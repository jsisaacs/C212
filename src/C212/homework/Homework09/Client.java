//Joshua Isaacson, jsisaacs, November 14, 2017

package C212.homework.Homework09;

public class Client {
    public static void main(String[] args) {
        //Ratchet
        Ratchet ratchet = new Ratchet(5);
        System.out.println("Racket drive size: " + ratchet.getDrive());

        //Socket
        Socket socket = new Socket(2.5);
        System.out.println("Socket drive size: " + socket.getDrive());

        //Adapter
        Adapter.makeFit(ratchet, socket);
        System.out.println("Racket has an adapter of size: " + ratchet.getDrive());
    }
}
