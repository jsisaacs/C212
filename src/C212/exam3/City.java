//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class City {
    private String city;

    public City(String name) {
        this.city = name;
    }

    public String getName() {
        return city;
    }

    public ArrayList<City> shortestPath(Network param, City target) {
        //print the Network
        for (Map.Entry<City, Neighbors> entry : param.getNetwork().entrySet()) {
            System.out.println("----------------------------------------------------------" + "\n" +
                    "City: " + entry.getKey().getName() + "\n" +
                    "Connections: " + entry.getValue());
        }

        //check the paths in param to see if the first element equals this.object
        //and if the last element equals target
        //TODO
        if (true) {

        } else {
            System.out.println("There is no path between the 2 cities.");
        }

        return null;
    }
}