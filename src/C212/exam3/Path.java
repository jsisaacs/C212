//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import java.util.ArrayList;

public class Path {
    private ArrayList<City> path;

    public Path(ArrayList<City> listOfCity) {
        this.path = listOfCity;
    }

    public ArrayList<City> getPath() {
        return path;
    }

    public String toString() {
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < path.size(); i++) {
            output.add(path.get(i).getName());
        }
        return output.toString();
    }
}
