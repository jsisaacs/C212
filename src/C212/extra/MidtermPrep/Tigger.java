package C212.extra.MidtermPrep;

/*
Design a Tigger class to implement his bouncing movement.  A Tigger will always
start in a random point (x, y).  When bounce() is called, Tigger changes its position
(x, y):
    x becomes the sum of the squares of its digits
    y becomes the sum of the squares of its digits

 */

class Tigger {
    String x, y;
    Tigger(int x, int y) {
        this.x = x + "";
        this.y = y + "";
    }
    void bounce() {
        int a = calculate(x),
                b = calculate(y);
        this.x = a + "";
        this.y = b + "";

    }
    int calculate(String a) {
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum += (a.charAt(i) - '0') * (a.charAt(i) - '0');
        }
        return sum;
    }
    String report() {
        String
                x = "   " + this.x,
                y = "   " + this.y;
        return
                "Tigger just bounced to (" +
                        x.substring(x.length() - 3) + ", "
                        + y.substring(y.length() - 3) + ")";
    }
}