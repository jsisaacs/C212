package C212.lab.Lab06;

import java.util.ArrayList;

public class Sequence {
    private ArrayList<Integer> values;

    public Sequence() {
        this.values = new ArrayList<Integer>();
    }

    public void add(int n) {
        this.values.add(n);
    }

    public String toString() {
        return this.values.toString();
    }

    public static Sequence mergeSort(Sequence a, Sequence b) {
        Sequence result = new Sequence();
        while (a.values.size() > 0 || b.values.size() > 0) {
            // System.out.println( result );
            if (a.values.size() == 0) {
                result.add( b.values.get(0) );
                b.values.remove(0);
                // continue;
            } else if (b.values.size() == 0) {
                result.add( a.values.get(0) );
                a.values.remove(0);
                // continue;
            } else {
                if (a.values.get(0) < b.values.get(0)) {
                    result.add( a.values.get(0) );
                    a.values.remove(0);
                    // continue;
                } else {
                    result.add( b.values.get(0) );
                    b.values.remove(0);
                    // continue;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Sequence a = new Sequence();
        a.add(1);
        a.add(2);

        Sequence b = new Sequence();
        b.add(5);
        b.add(6);

        System.out.println(a);
        System.out.println(b);

        Sequence out = a.mergeSort(a, b);
        System.out.println(out);
    }

}
