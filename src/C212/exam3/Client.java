package C212.exam3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Client {
    public static void main(String[] args) {
        //Cities
        City pendleton = new City("Pendleton");
        City pierre = new City("Pierre");
        City pueblo = new City("Pueblo");
        City phoenix = new City("Phoenix");
        City peoria = new City("Peoria");
        City pittsburgh = new City("Pittsburgh");
        City princeton = new City("Princeton");
        City pensacola = new City("Pensacola");

        //Paths
        ArrayList<City> al1 = new ArrayList<>();
        al1.add(pierre);
        al1.add(pueblo);
        al1.add(phoenix);
        Path pendletonPath = new Path(al1);

        ArrayList<City> al2 = new ArrayList<>();
        al2.add(pendleton);
        al2.add(pueblo);
        Path pierrePath = new Path(al2);

        ArrayList<City> al3 = new ArrayList<>();
        al3.add(phoenix);
        al3.add(pendleton);
        al3.add(pierre);
        al3.add(peoria);
        Path puebloPath = new Path(al3);

        ArrayList<City> al4 = new ArrayList<>();
        al4.add(pendleton);
        al4.add(pueblo);
        al4.add(peoria);
        al4.add(pittsburgh);
        al4.add(pensacola);
        Path phoenixPath = new Path(al4);

        ArrayList<City> al5 = new ArrayList<>();
        al5.add(pueblo);
        al5.add(phoenix);
        al5.add(pittsburgh);
        Path peoriaPath = new Path(al5);

        ArrayList<City> al6 = new ArrayList<>();
        al6.add(peoria);
        al6.add(princeton);
        al6.add(phoenix);
        al6.add(pensacola);
        Path pittsburghPath = new Path(al6);

        ArrayList<City> al7 = new ArrayList<>();
        al7.add(pittsburgh);
        al7.add(pensacola);
        Path princetonPath = new Path(al7);

        ArrayList<City> al8 = new ArrayList<>();
        al8.add(phoenix);
        al8.add(pittsburgh);
        al8.add(princeton);
        Path pensacolaPath = new Path(al8);

        //Network
        Map<City, Path> network = new HashMap<>();
        network.put(pendleton, pendletonPath);
        network.put(pierre, pierrePath);
        network.put(pueblo, puebloPath);
        network.put(phoenix, phoenixPath);
        network.put(peoria, peoriaPath);
        network.put(pittsburgh, pittsburghPath);
        network.put(princeton, princetonPath);
        network.put(pensacola, pensacolaPath);
        Network nation = new Network(network);

        //shortestPath() test
        pendleton.shortestPath(nation, pueblo);
        //expected: Path -> [Pendleton, Pueblo]

        System.out.println(pendletonPath.toString());
        //expected: [Pierre, Pueblo, Phoenix]
    }
}
