//Joshua Isaacson

package C212.homework.Homework03;

public class CounterTest {
    public static void main(String[] args) {

        //Test for Counter methods

        //create a counter object
        Counter counter = new Counter();

        //tests click()
        counter.click(); //adds 1 to value
        counter.click(); //adds 1 to value
        counter.click(); //adds 1 to value

        //tests getValue()
        System.out.println("value is: " + counter.getValue()); //value should be 3
        System.out.println("expected is: 3");

        //tests reset()
        counter.reset(); // resets value
        System.out.println("value is: " + counter.getValue()); //value should reset to 0
        System.out.println("expected is: 0");
    }
}
