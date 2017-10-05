//Joshua Isaacson, jsisaacs, Oct. 3, 2017

package C212.homework.Homework05;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Preferences {
    public static void add(String fan, String team) {
        String value = preferences.get(team);
        if (value == null)
            preferences.put(team, fan);
        else
            preferences.put(team, value + " " + fan);
    }

    public static Map<String, String> preferences;

    public static void main(String[] args) throws FileNotFoundException {
        Preferences.preferences = new HashMap<String, String>();
        Scanner speckles = new Scanner( new File( "/Users/joshisaacson-work/Desktop/C212Work/src/C212/homework/Homework05/words.txt" ) );
        while (speckles.hasNext()) {
            String token = speckles.next();
            Preferences.add("*", token);
        }
        for (String key : Preferences.preferences.keySet())
            System.out.println( key + ":" + Preferences.preferences.get(key) );
    }
}