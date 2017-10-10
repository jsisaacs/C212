//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
given a Sequence class, add a method equals, that checks
whether 2 sequences have the same values in the same order.
 */

public class SequenceArray {
    //variables
    private int[] values;

    //SequenceArray constructor
    public SequenceArray(int size) {
        values = new int[size];
    }

    public void set(int i, int n) {
        values[i] = n;
    }

    public int get(int i) {
        return values[i];
    }

    public int size() {
        return values.length;
    }

    public Boolean equals(SequenceArray other) {
        //if size of this.values is not equal to
        //the size of other, output false
        if (this.values.length == other.values.length) {
            for (int i = 0; i < this.values.length; i++) {
                if (this.values[i] == other.values[i]) {
                    return true;
                }
            }
        }
        else {
            return false;
        }
        return null;
    }

    public static void main(String[] args) {
        SequenceArray sa1 = new SequenceArray(3);
        sa1.set(0, 1);
        sa1.set(1, 1);
        sa1.set(2, 0);
        SequenceArray sa2 = new SequenceArray(3);
        sa2.set(0, 1);
        sa2.set(1, 1);
        sa2.set(2, 0);
        SequenceArray sa3 = new SequenceArray(4);
        sa3.set(0, 0);
        sa3.set(1, 0);
        sa3.set(2, 0);
        sa3.set(3, 0);

        System.out.println(sa1.equals(sa2));
        System.out.println(sa2.equals(sa3));
    }
}
