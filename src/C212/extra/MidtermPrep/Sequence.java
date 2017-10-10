//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
Considering the Sequence class, create a method that appends
2 Sequences together in a new sequence, without modifying either.
 */

import java.util.ArrayList;

public class Sequence {
    private ArrayList<Integer> values;

    public Sequence() {
        values = new ArrayList<>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public void append(Sequence other) {
        /*
        for (int i = 0; i < this.values.size(); i++) {
            other.add(this.values.get(i));
        }
        */
        Sequence appendedSequence = new Sequence();

        for (int i = 0; i < this.values.size(); i++) {
            appendedSequence.add(this.values.get(i));
        }
        for (int j = 0; j < other.values.size(); j++) {
            appendedSequence.add(other.values.get(j));
        }
        System.out.println(appendedSequence.values.size());

    }



    public static void main(String[] args) {
        Sequence s1 = new Sequence();
        s1.add(1);
        s1.add(4);
        s1.add(9);
        s1.add(16);
        Sequence s2 = new Sequence();
        s2.add(9);
        s2.add(7);
        s2.add(4);
        s2.add(9);
        s2.add(11);
        s1.append(s2);
    }
}
