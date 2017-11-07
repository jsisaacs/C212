//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import java.util.ArrayList;

public class Neighbors {
    private ArrayList<City> neighbors;

    public Neighbors(ArrayList<City> listOfCity) {
        this.neighbors = listOfCity;
    }

    public ArrayList<City> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < neighbors.size(); i++) {
            output.add(neighbors.get(i).getName());
        }
        return output.toString();
    }
}