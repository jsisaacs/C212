package C212.extra.FinalExam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");

        System.out.println(words);

        ListIterator<String> iter = words.listIterator();

        while (iter.hasNext()) {
            String string = iter.next();
            if ((words.indexOf(string) % 2) == 1) {
                System.out.println(string);
            }
        }



    }
}
