//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class City {
    private final String city;
    private Boolean status;
    private int distanceTo;

    public City(String name) {
        this.city = name;
        status = false;
        distanceTo = 0;
    }

    public String getName() {
        return city;
    }

    public Boolean getStatus() {
        return status;
    }

    public int getDistanceTo() {
        return distanceTo;
    }

    public void changeStatus(Boolean update) {
        status = update;
    }

    public void changeDistanceTo(int update) {
        distanceTo = update;
    }

    @Override
    public String toString() {
        return getName();
    }

    public String shortestPath(Network param, City target) {
        ArrayList<City> shortestPath = new ArrayList<>();

        //check the paths in param to see if the first element equals this.object
        //and if the last element equals target
        if (param.getNetwork().containsKey(target) && param.getNetwork().containsKey(this)) {
            System.out.println("City is in the network!");

            //if City input == City target
            if (this == target) {
                ArrayList<City> pathToItself = new ArrayList<>();
                pathToItself.add(this);
                return "Shortest Path -> " + pathToItself;
            } else {
                Queue<City> queue = new LinkedList<>();
                queue.add(this);
                this.changeStatus(true);

                while(!queue.isEmpty()) {
                    City top = queue.remove();
                    //iterate through the Network's map's keys, return the values
                    for (Map.Entry<City, Neighbors> entry : param.getNetwork().entrySet()) {
                        City key = entry.getKey();
                        Neighbors value = entry.getValue();
                        for (City aCity : value.getNeighbors()) {
                            System.out.println("[key : " + key.toString() + " value : " + aCity.toString() + "]");
                            //iterate through each Neighbor object
                            //check if a City in the first Neighbor is found
                            //TODO

                        }
                    }
                }
                return shortestPath.toString();
            }
        }
        else {
            System.out.println("There is no path between the 2 cities.");
        }
        return null;
    }
}