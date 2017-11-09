//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import java.lang.reflect.Array;
import java.util.*;

public class Neighbors extends ArrayList<City> {
    public Neighbors(City[] nodes) {
        for (City c : nodes) {
            this.add(c);
        }
    }
}