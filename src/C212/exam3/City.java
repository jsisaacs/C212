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

    @Override
    public String toString() {
        String output = getName();
        return output;
    }

    public String shortestPath(Network param, City target) {
        //check the paths in param to see if the first element equals this.object
        //and if the last element equals target
        //TODO
        if (param.getNetwork().containsKey(target) && param.getNetwork().containsKey(this)) {
            System.out.println("City is in the network!");

            //if City input == City target
            if (this == target) {
                ArrayList<City> pathToItself = new ArrayList<>();
                pathToItself.add(this);
                return "Shortest Path -> " + pathToItself;
            } else {
                /*
                Check the neighbors ✅,
                for each neighbor check its neighbor.
                Keep doing that until this == target.
                */

                //iterate through the Network's map's keys, return the values
                for (Map.Entry<City, Neighbors> entry : param.getNetwork().entrySet()) {
                    City key = entry.getKey();
                    Neighbors value = entry.getValue();
                    for (City aCity : value.getNeighbors()) {
                        System.out.println("[key : " + key.toString() + " value : " + aCity.toString() + "]");


                    }
                }
            }

        }
        else {
            System.out.println("There is no path between the 2 cities.");
        }

        return null;
    }
}