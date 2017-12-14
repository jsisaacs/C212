package C212.homework;

import C212.homework.Homework05.HomeworkFive;

import java.util.*;

public class Homework10Test {
    public Homework10Test(String name) { this.name = name;}
    public Homework10Test left;
    public Homework10Test right;
    public String name;

    public static void main(String[] args) {
        Homework10Test a = new Homework10Test("a");
        Homework10Test b = new Homework10Test("b");
        Homework10Test c = new Homework10Test("c");
        a.left = b;
        a.right = c;
        b.left = c;
        a.right.name = "d";
        System.out.println(a.name);
        System.out.println(a.left.name);
        System.out.println(b.left.name);
    }
}
