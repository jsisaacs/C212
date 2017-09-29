//Joshua Isaacson

/*
-constructor
    -name
    -total quiz score
-getName() returns name
-addQuiz(int score)
-getTotalScore()
-getAverageScore()

 */

package C212.homework.Homework03;

public class Student {
    private String studentName;
    private int totalQuizScore;
    private int quizNum;

    //constructor for Student object
    public Student(String name) {
        this.studentName = name;
        totalQuizScore = 0;
        quizNum = 0;
    }
    //getName() returns studentName
    public String getName() {
        return studentName;
    }
    //addQuiz() adds score to totalQuizScore count
    public void addQuiz(int score) {
        totalQuizScore = totalQuizScore + score;
        quizNum++;
    }
    //getTotalScore() returns totalQuizScore
    public int getTotalQuizScore() {
        return totalQuizScore;
    }
    //getAverageScore() returns totalQuizScore/quizNum
    public int getAverageScore() {
        return totalQuizScore / quizNum;
    }
}
