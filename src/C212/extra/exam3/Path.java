package C212.exam3;

import java.util.*;

public class Path extends ArrayList<City> {
    public Path() {

    }

    public Path(City c) {
        this.add(c);
    }

    public Path clone() {
        Path path = new Path();
        for (City c : this) {
            path.add(c);
        }
        return path;
    }

}
