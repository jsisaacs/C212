//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
Takes an int[] and an int to specify the length of the
new array, and pads on 0 if the length is greater than
the length of the int[].
 */

public class CopyOf {

    public static int[] copyOf(int[] array, int l) {
        //Create a new array instance with the length
        //l. Subtract the length of the original array
        //by the length of the new array, and the
        //difference will be how many 0s to add to the
        //end of the new array.
        //If difference is negative, that means the new
        //array must be truncated; if 0 they are the same
        //length.
        int[] newArray = new int[l];
        int difference = array.length - newArray.length;

        if (difference == 0 ) {
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
        }
        if (difference < 0) {
            for (int i = 0; i < array.length - difference; i++) {
                newArray[i] = array[i];
                //System.out.println("wow");
            }
        }

        if (difference > 0) {

            for (int i = array.length; i < array.length + difference; i++) {
                for (int j = 0; j < array.length; j++) {
                    //newArray[i] = array[i];
                }
                //newArray[i] = 0;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] testArray = new int[5];
        testArray[0] = 0;
        testArray[1] = 2;
        testArray[2] = 2;
        testArray[3] = 3;
        testArray[4] = 4;

        //System.out.println(copyOf(testArray, 5).length);
        for (int k = 0; k < copyOf(testArray, 5).length; k++) {
            System.out.println(k);
        }
    }
}
