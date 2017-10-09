//Joshua Isaacson, jsisaacs, October 7, 2017

package C212.extra.MidtermPrep;

/*
Define a class of objects called Clock. A Clock object stores time (hours and min)
in military time format, in 2 instance variables of type int. Clock objects have
2 instance methods, report which simply returns the time, and tick which advances
the clock by 1 min. The constructor for class Clock takes 1 argument, a String that
represents the time the clock is originally set to. Write a test program, that shows
a working Clock.
 */

public class Clock {
    //variables
    int hours;
    int minutes;
    String time;

    //Clock constructor takes only the original time as a String
    public Clock (String startingTime) {
        this.time = startingTime;
        hours = Integer.parseInt(startingTime.substring(0, 2));


    }

    //report returns the time


    //tick advances the clock by a min


    public static void main(String[] args) {

    }
}
