//Joshua Isaacson, jsisaacs, 10/2/2017

//package C212.lab.Lab08;

/*
 R15.18
The union of 2 sets A and B is the set of all elements that
are contained in A, B, or both. The intersection is the set
of all elements that are contained in A and B. How can you
compute the union and intersection of 2 sets, using the add
and contains methods, together with an iterator?
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FirstQuestion {
    public static Set<Integer> union (Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new TreeSet<>();

        Iterator<Integer> iterator1 = set1.iterator();
        Iterator<Integer> iterator2 = set2.iterator();

        while(iterator1.hasNext()) {
            unionSet.add(iterator1.next());
        }
        while ((iterator2.hasNext())) {
            unionSet.add(iterator2.next());
        }
        return unionSet;
    }

    private static Set<Integer> intersection (Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new TreeSet<>(set1);

        Iterator<Integer> iterator = intersectionSet.iterator();

        while(iterator.hasNext()) {
            if(!set2.contains(iterator.next())) {
                iterator.remove();
            }
        }
        return intersectionSet;
    }

    public static void main (String[] args) {
        Set<Integer> A = new TreeSet<>();
        Set<Integer> B = new TreeSet<>();

        A.add(1);
        A.add(2);
        A.add(3);

        B.add(2);
        B.add(3);
        B.add(4);

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
