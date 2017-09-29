//Joshua Isaacson

package C212.homework.Homework03;

public class StudentTest {
    public static void main(String[] args) {
        //Test for Student methods

        //Create a Student object
        Student student1 = new Student("Josh");

        //Test for getName()
        System.out.println("output: " + student1.getName());
        System.out.println("expected: Josh");

        //Test for addQuiz() and getTotalQuizScore()
        student1.addQuiz(100);
        System.out.println("output: " + student1.getTotalQuizScore());
        System.out.println("expected: 100");

        //Test for getAverageScore()
        student1.addQuiz(0);
        System.out.println("output: " + student1.getAverageScore());
        System.out.println("expected: 50");


    }
}
