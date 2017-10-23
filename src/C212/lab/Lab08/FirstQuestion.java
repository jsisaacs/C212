package C212.lab.Lab08;

/*
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
        //System.out.println(union(A, B));
        System.out.println("Intersection:");
        //System.out.println(intersection(A, B));
    }
}