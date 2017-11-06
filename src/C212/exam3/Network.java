//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import java.util.Map;

public class Network {
    private Map<City, Path> network;

    public Network(Map<City, Path> cities) {
        this.network = cities;
    }

    public Map<City, Path> getNetwork() {
        return network;
    }
}
