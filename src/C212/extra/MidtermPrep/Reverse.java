//Joshua Isaacson, jsisaacs, October 10, 2017

package C212.extra.MidtermPrep;

/*
Write a program that initializes an array with 10 random integers
and then prints out all elements in reverse order.

 */

public class Reverse {
    //variables

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
        }
    }

    public static void reverse(int[] array) {
        //create a new array to store elements
        //instead of i++, start at the last element of the array
        //and work backwords and add elements to the new array
        int[] reversedArray = new int[10];

        System.out.println("Reversed array:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[10];

       print(intArray);
       reverse(intArray);
    }
}
