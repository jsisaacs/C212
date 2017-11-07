//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Network {
    private Map<City, Neighbors> network;

    public Network(Map<City, Neighbors> cities) {
        this.network = cities;
    }

    //returns the Map<City, Neighbors> attribute from a Network object
    //Network -> Map<City, Neighbors>
    public Map<City, Neighbors> getNetwork() {
        return network;
    }

    public String toString() {
        ArrayList<String> output = new ArrayList<>();
        for (Map.Entry<City, Neighbors> entry : this.getNetwork().entrySet()) {
            output.add("[City: " + entry.getKey().getName() + ", Connections: " + entry.getValue() + "]");
        }
        return output.toString();
    }
}
