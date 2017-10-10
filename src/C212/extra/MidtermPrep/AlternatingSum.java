//Joshua Isaacson, jsisaacs, October 7, 2017

package C212.extra.MidtermPrep;

/*
Compute the alternating sum of all elements in an array.
1 4 9 -> 1 - 4 + 9
 */

public class AlternatingSum {
    //iterate through an int[], for elements i and i + 1, apply
    //- and + respectively, and compute
    public static int altSum(int[] array) {
        int sum = 0;

        for(int i = 0; i < array.length; i = i + 2) {
            sum = sum + array[i];
        }
        for(int i = 1; i < array.length; i = i + 2) {
            sum = sum - array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 1;
        intArray[2] = 1;
        intArray[3] = 1;
        intArray[4] = 1;

        // 1 - 1 + 1 - 1 + 1 -> 1
        System.out.println(altSum(intArray));
    }
}
