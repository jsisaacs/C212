//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import C212.extra.Lecture.Graph;
import sun.nio.ch.Net;

import java.util.*;

public class Network extends HashMap<City, Neighbors> {
    public static Network n = new Network();

    public static Neighbors neighborsOf(City c) {
        return Network.n.get(c);
    }

    public Path shortestPath(City end, Paths candidates) {
        if (candidates == null) {
            return null;
        }
        else if (candidates.size() == 0) {
            return new Path();
        }
        else {
            for (Path c : candidates) {
                if (c.get(c.size() - 1) == end) {
                    return c;
                }
            }
            Paths p = new Paths();
            for (Path c : candidates) {
                City last = c.get(c.size() - 1);
                Neighbors n = Network.neighborsOf(last);
                for (City city : n) {
                    Path newPath = c.clone();
                    if (p.contains(city)) {

                    }
                    else {
                        newPath.add(city);
                        p.add(newPath);
                    }
                }
                return shortestPath(end, p);
            }
            return null;
        }
    }
}
