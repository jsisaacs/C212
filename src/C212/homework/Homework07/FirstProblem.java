//Joshua Isaacson, jsisaacs, October 30, 2017

package C212.homework.Homework07;

import java.util.Stack;
import java.util.Scanner;

/*
E15.8
Use a stack to reverse the words of a sentence. Keep reading words until you
have a word that ends in a period, adding them onto a stack. When you have a
word with a period, pop the words off and print them. Stop when there are no
more words in the input.
 */

//"Mary had a little lamb.  Its fleece was white as snow.

public class FirstProblem {
    public static void main(String[] args) {
        //initializing stuff

        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        String sentence1 = "Mary had a little lamb.";
        String sentence2 = "Its fleece was white as snow.";
        Scanner input1 = new Scanner(sentence1);
        Scanner input2 = new Scanner(sentence2);

        //adds the elements of the sentence to the stack
        while (input1.hasNext()) {
            String nextWord = input1.next();
            stack1.push(nextWord);
        }

        while (input2.hasNext()) {
            String nextWord = input2.next();
            stack2.push(nextWord);
        }

        //stores the reversed sentence
        String reversedSentence1 = "";
        while (stack1.size() != 0) {
            String nextWord = stack1.pop();

            reversedSentence1 = reversedSentence1 + " " + nextWord.replaceAll("[^a-zA-Z]","");;

        }
        reversedSentence1 = reversedSentence1.substring(1).toLowerCase();
        reversedSentence1 = reversedSentence1.substring(0,1).toUpperCase() + reversedSentence1.substring(1,22);
        System.out.print(reversedSentence1 + ".");

        String reversedSentence2 = "";
        while (stack2.size() != 0) {
            String nextWord = stack2.pop();

            reversedSentence2 = reversedSentence2 + " " + nextWord.replaceAll("[^a-zA-Z]","");;

        }
        reversedSentence2 = reversedSentence2.substring(1).toLowerCase();
        reversedSentence2 = reversedSentence2.substring(0,1).toUpperCase() + reversedSentence2.substring(1,28);
        System.out.print(" " + reversedSentence2 + ".");
    }
}
