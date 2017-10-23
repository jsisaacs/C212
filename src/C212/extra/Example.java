package C212.extra;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Shape> a = new ArrayList<>();
        a.add(new Circle());
        a.add(new Triangle());
        //System.out.println(a);

        for (Shape object : a) {
            System.out.println(object.area());
        }
    }
}
