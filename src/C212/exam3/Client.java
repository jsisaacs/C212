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

        //Neighbors
        ArrayList<City> al1 = new ArrayList<>();
        al1.add(pierre);
        al1.add(pueblo);
        al1.add(phoenix);
        Neighbors pendletonNeighbors = new Neighbors(al1);

        ArrayList<City> al2 = new ArrayList<>();
        al2.add(pendleton);
        al2.add(pueblo);
        Neighbors pierreNeighbors = new Neighbors(al2);

        ArrayList<City> al3 = new ArrayList<>();
        al3.add(phoenix);
        al3.add(pendleton);
        al3.add(pierre);
        al3.add(peoria);
        Neighbors puebloNeighbors = new Neighbors(al3);

        ArrayList<City> al4 = new ArrayList<>();
        al4.add(pendleton);
        al4.add(pueblo);
        al4.add(peoria);
        al4.add(pittsburgh);
        al4.add(pensacola);
        Neighbors phoenixNeighbors = new Neighbors(al4);

        ArrayList<City> al5 = new ArrayList<>();
        al5.add(pueblo);
        al5.add(phoenix);
        al5.add(pittsburgh);
        Neighbors peoriaNeighbors = new Neighbors(al5);

        ArrayList<City> al6 = new ArrayList<>();
        al6.add(peoria);
        al6.add(princeton);
        al6.add(phoenix);
        al6.add(pensacola);
        Neighbors pittsburghNeighbors = new Neighbors(al6);

        ArrayList<City> al7 = new ArrayList<>();
        al7.add(pittsburgh);
        al7.add(pensacola);
        Neighbors princetonNeighbors = new Neighbors(al7);

        ArrayList<City> al8 = new ArrayList<>();
        al8.add(phoenix);
        al8.add(pittsburgh);
        al8.add(princeton);
        Neighbors pensacolaNeighbors = new Neighbors(al8);

        //Network
        Map<City, Neighbors> network = new HashMap<>();
        network.put(pendleton, pendletonNeighbors);
        network.put(pierre, pierreNeighbors);
        network.put(pueblo, puebloNeighbors);
        network.put(phoenix, phoenixNeighbors);
        network.put(peoria, peoriaNeighbors);
        network.put(pittsburgh, pittsburghNeighbors);
        network.put(princeton, princetonNeighbors);
        network.put(pensacola, pensacolaNeighbors);
        Network nation = new Network(network);

        //shortestNeighbors() test
        pendleton.shortestPath(nation, pueblo);
        //expected: Neighbors -> [Pendleton, Pueblo]

        //System.out.println(pendletonNeighbors.toString());
        //expected: [Pierre, Pueblo, Phoenix]
    }
}