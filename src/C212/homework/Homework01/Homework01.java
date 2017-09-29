package C212.homework.Homework01;/* Joshua Isaacson
 * 8/27/2017
 * C212
 */

import java.math.BigDecimal;

public class Homework01 {
  public static void main(String[] args) {
    
    //first expression
    BigDecimal a, b;
    
    a = new BigDecimal("1");
    b = new BigDecimal("2");
    
    System.out.println("first expression: " + a.add(b));

    //second expression
    BigDecimal c, d;
    
    c = new BigDecimal("2");
    d = new BigDecimal("3");
    
    System.out.println("second expression: " + c.multiply(d));
    
    //third expression
    BigDecimal e, f, g, h;
   
    e = new BigDecimal("1");
    f = new BigDecimal("2");
    g = new BigDecimal("3");
    h = new BigDecimal("4");
    
    System.out.println("third expression: " + e.subtract(f.subtract((g.subtract(h)))));
    
    //fourth expression
    BigDecimal i, j, k, l;
    
    i = new BigDecimal("1");
    j = new BigDecimal("2");
    k = new BigDecimal("3");
    l = new BigDecimal("4");
    
    BigDecimal m = i.subtract(j);
    BigDecimal n = m.subtract(k);
    BigDecimal o = n.subtract(l);
    
    System.out.println("fourth expression: " + o);
    
    //fifth expression
    BigDecimal p, q, r, s;
    
    p = new BigDecimal("2");
    q = new BigDecimal("3");
    r = new BigDecimal("4");
    s = new BigDecimal("5");
    
    BigDecimal t = p.multiply(q);
    BigDecimal u = r.multiply(s);
    BigDecimal v = t.subtract(u);
    
    System.out.println("fifth expression: " + v);
  }
}