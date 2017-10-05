//Joshua Isaacson, jsisaacs, Oct. 3, 2017

package C212.homework.Homework05;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.HashMap;

public class HomeworkFive {
    public static void main(String[] args) throws IOException {
        //read in the text file
        Scanner in = new Scanner(new File("/Users/joshisaacson-work/Desktop/C212Work/src/C212/homework/Homework05/green_eggs_and_ham.txt"));

        //initialize new HashMap to store word counts
        HashMap<String, Integer> wordCounts = new HashMap<>();

        //read in text
        while (in.hasNext()) {
            String next = in.next();

            //if the HashMap contains only one instance of a word, it has a
            //count of 1
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            //add 1 to the count for every instance of a word
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }

        //output only the words with at least 20 counts
        int min = 20;

        //enhanced for loop
        for (String words : wordCounts.keySet()) {
            int count = wordCounts.get(words);
            if (count > min) {

                //formatted output statement called for all words with
                //over 20 counts
                System.out.println("(" + count + "\t" + words + ")");
            }
        }
    }
}

