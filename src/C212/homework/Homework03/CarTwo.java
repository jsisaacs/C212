//Joshua Isaacson

//comment out before grading
package C212.homework.Homework03;

public class CarTwo {
    //instantiate variables
    //fuel level starts at 0
    double fuelLevel = 0;
    //fuel efficiency
    int efficiency;
    double distance;
    double input;

    //constructor for a Car object, user inputs the fuel efficiency
    public CarTwo(int efficiency) {
        this.efficiency = efficiency;
        fuelLevel = 0;
    }

    //getGasInTank returns current amount of gas in the tank
    public double getGasInTank() {
        return fuelLevel;
    }

    //drive takes the CarTwo object and drives it for a certain distance,
    //reduces the gas in the tank
    public void drive(int d) {
        this.distance = d;
        fuelLevel = fuelLevel - (d/efficiency);
    }

    //addGas adds a user specified amount of gas to the tank
    public void addGas(double inputAmount) {
        this.input = inputAmount;
        fuelLevel = fuelLevel + inputAmount;
    }
}