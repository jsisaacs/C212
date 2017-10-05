//Joshua Isaacson, jsisaacs, Oct. 3, 2017

package C212.homework.Homework05;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Mark {
    public static void main(String[] args) throws Exception {
        /*
        Map<String, String> preferences;
        preferences = new HashMap<String, String>();
        preferences.put("marlshep", "Pistons"); // these are student usernames and the teams they favor
        preferences.put("jonman", "Celtics");
        preferences.put("alexongw", "Spurs");
        preferences.put("marlshep", "Pacers");
        System.out.println( preferences );
        */
        Scanner speckles = new Scanner( new File( "/Users/joshisaacson-work/Desktop/C212Work/src/C212/homework/Homework05/thefly.txt" ) );
        while (speckles.hasNext()) {
            String token = speckles.next();
            System.out.println( "***(" + token + ")***" );
        }

        Map<String, String> preferences;
        preferences = new HashMap<String, String>();
        preferences.put("marlshep", "Pistons"); // these are student usernames and the teams they favor
        preferences.put("jonman", "Celtics");
        preferences.put("alexongw", "Spurs");
        preferences.put("marlshep", "Pacers");
        System.out.println( preferences );
    }
}
