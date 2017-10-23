package C212.lab.Lab08;

/*
How can you compute the union and intersection of 2 sets,
using some of the methods that the java.util.Set interface
provides, but without using an iterator?
(Look up the interface in the API docs).
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SecondQuestion {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new TreeSet<>();

        unionSet.addAll(set1);
        unionSet.addAll(set2);

        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new TreeSet<>(set1);

        intersectionSet.retainAll(set2);

        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<Integer> A = new TreeSet<>();
        Set<Integer> B = new TreeSet<>();

        A.add(1);
        A.add(2);
        A.add(3);

        B.add(2);
        B.add(3);
        B.add(4);

        Iterator<Integer> iteratorA = A.iterator();
        Iterator<Integer> iteratorB = B.iterator();

        System.out.println("Set A:");
        System.out.println(A);
        System.out.println("Set B:");
        System.out.println(B);
        System.out.println("Union:");
        System.out.println(union(A, B));
        System.out.println("Intersection:");
        System.out.println(intersection(A, B));
    }
}
