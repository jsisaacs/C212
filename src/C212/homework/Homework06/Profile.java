//Joshua Isaacson, jsisaacs, October 7, 2017

package C212.homework.Homework06;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.HashMap;

public class Profile {
    public static Boolean isString(Object input) {
        if (input instanceof String) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        //read in a txt file, user provides in args
        String fileInput = args[0];
        Scanner in = new Scanner(new File(fileInput));

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

        //user inputs the minimum word count number in args
        int min;

        if (args.length == 1 && isString(args[0])) {
            min = 0;
            System.out.println("isString() = true");
        }
        else{
            min = Integer.parseInt(args[1]);
        }

        //enhanced for loop
        int i = 1;
        for (String words : wordCounts.keySet()) {
            int count = wordCounts.get(words);

            if (count > min) {

                //formatted output statement called for all words with
                //over 20 counts
                System.out.println(i + ". " + words + " = " + count);
                i++;
            }
        }

    }
}
