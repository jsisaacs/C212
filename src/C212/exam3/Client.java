//Joshua Isaacson, jsisaacs, November 5, 2017

package C212.exam3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Client {
    public static void main(String[] args) {
        //Network.n = new Network();
        City  sf = new City("San Francisco");
        City   p = new City("Portland");
        City   s = new City("Seattle");
        City   v = new City("Vancouver");
        City   c = new City("Calgary");
        City   h = new City("Helena");
        City slc = new City("Salt Lake City");
        City  la = new City("Los Angeles");
        City  lv = new City("Las Vegas");
        City  ph = new City("Phoenix");
        City  ep = new City("El Paso");
        City   d = new City("Duluth");
        City   o = new City("Omaha");
        City  de = new City("Denver");
        City sfe = new City("Santa Fe");
        City dal = new City("Dallas");

        Network.n.put(sf, new Neighbors(new City[] {p, la, slc}));

        System.out.println(Network.n);

        Path a3 = Network.n.shortestPath(p, new Paths(new Path(sf)));
        System.out.println( a3 );
        Path a4 = Network.n.shortestPath(sf, new Paths(new Path(sf)));
        System.out.println( a4 );
    }
}