//Joshua Isaacson - jsisaacs
//September 16, 2019

package C212.homework.Homework04;

public class Grade {
    public static void getNumericGrade (double input) {
        if (input <= 4.0 && input > 3.7) {
            System.out.println("A");
        }
        if (input <= 3.7 && input > 3.3) {
            System.out.println("A-");
        }
        if (input <= 3.3 && input > 3.0) {
            System.out.println("B+");
        }
        if (input <= 3.0 && input > 2.7) {
            System.out.println("B");
        }
        if (input <= 2.7 && input > 2.3) {
            System.out.println("B-");
        }
        if (input <= 2.3 && input > 2.0) {
            System.out.println("C+");
        }
        if (input <= 2.0 && input > 1.7) {
            System.out.println("C");
        }
        if (input <= 1.7 && input > 1.3) {
            System.out.println("C-");
        }
        if (input <= 1.3 && input > 1.0) {
            System.out.println("D+");
        }
        if (input == 1.0) {
            System.out.println("D");
        }
        if (input < 1.0 && input >= 0.0) {
            System.out.println("F");
        }
        else if (input > 4.0 || input < 0.0 ) {
            System.out.println("This is out of the GPA scale.");
        }
    }
    public static void main(String[] args) {
        getNumericGrade(2.8);
    }
}
