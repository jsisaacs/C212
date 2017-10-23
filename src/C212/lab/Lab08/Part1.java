package C212.lab.Lab08;

import java.util.LinkedList;
import java.util.ListIterator;

public class Part1 {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        ListIterator<String> iterator = staff.listIterator();
        iterator.add("Tom");
        iterator.add("Diana");
        iterator.add("Harry");
        iterator = staff.listIterator();
        iterator.next();
        iterator.next();
        System.out.println(staff.toString());
    }
}
