/* Joshua Isaacson 
 * 8/25/2017
 * C212
 */

import java.util.*;

class Car {
  public static void main(String[] args) {
    Scanner input;
    
    input = new Scanner(System.in);
    
    System.out.print("Please enter the number of gallons then press enter: ");
    double numberOfGallons = input.nextDouble();
    
    System.out.print("Please enter the fuel efficiency (miles/gallon) then press enter: ");
    double fuelEfficiency = input.nextDouble();
    
    System.out.print("Please enter the fuel price (in dollars per gallon: ");
    double fuelPrice = input.nextDouble();
    
    System.out.println("The distance to empty for your car is " + (numberOfGallons * fuelEfficiency) + 
                       " and the price per 100 miles for your car is " + ((1/fuelEfficiency) * 100 * fuelPrice));
  }
}
