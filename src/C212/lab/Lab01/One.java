/* Joshua Isaacson 
 * 8/25/2017
 * C212
 */

/* outputs 2 + 3 = 5 
 * this is because the first 2 print statements keep the output on the same line
 * and the last println still outputs 2 + 3 on the same line and starts the
 * interpreter on the next line because of the println
 */

class One {
  public static void main(String[] args) {
    System.out.print("2 + 3");
    System.out.print(" = ");
    System.out.println(2 + 3);
  }
}


