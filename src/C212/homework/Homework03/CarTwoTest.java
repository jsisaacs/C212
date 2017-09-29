//Joshua Isaacson

package C212.homework.Homework03;

public class CarTwoTest {
    public static void main(String[] args) {
        //creates object of CarTwo
        CarTwo audiRS7 = new CarTwo(50);

        //Tests the methods created in CarTwo.java
        audiRS7.addGas(20);
        double gasLeft = audiRS7.getGasInTank();
        System.out.println(gasLeft + " gallons left.");
        System.out.println("expected: 20 gallons");

        audiRS7.drive(100);
        gasLeft = audiRS7.getGasInTank();
        System.out.println(gasLeft + " gallons left.");
        System.out.println("expected: 18 gallons");
    }
}