//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
Buffon needle experiment:
-generate two random numbers: 1 to describe the starting postion and 1 to
describe the angle of the needle with the x-axis. Then you need to test
wherther the needle touches a grid line.

Generate the lower point of the needle. The x-coordinate is irrelevant,
and assume y to be any random number between 0 and 2. The angle between the needle
and the x-axis can be any value between 0 and 180 degrees. Upper part has y
y_high = y_low + sin(a)

The needle is a hit if y_high is at least 2.  Stop after 10,000 tries and print
tries/hits.
 */

import java.util.Random;

public class NeedleExperiment {
    public static void main (String[] args) {

    }
}
