package C212.homework.Homework05;

import java.util.Scanner;
import java.io.File;

public class Mark {
    public static void main(String[] args) throws Exception {
        Scanner speckles = new Scanner( new File( "/Users/joshisaacson-work/Desktop/C212Work/src/C212/homework/Homework05/thefly.txt" ) );
        while (speckles.hasNext()) {
            String token = speckles.next();
            System.out.println( "***(" + token + ")***" );
        }
    }
}
