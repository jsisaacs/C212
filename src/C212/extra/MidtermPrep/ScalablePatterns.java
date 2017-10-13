//Joshua Isaacson, jsisaacs, October 9, 2017

package C212.extra.MidtermPrep;

public class ScalablePatterns {
    public static void main(String[] args) {
        int size = Integer.parseInt( args[0] );
        for ( int lines = 0 ; lines < size ; lines = lines + 1 ) {
            for (int columns = 0; columns < size; columns = columns + 1) {
                if ( (lines + columns == size/2) ||
                        (lines == size/2 && columns < 3 * size / 4)  ||
                        (columns == size/2 && lines > size / 4)
                        ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } // end of line
            System.out.println();
        }
    }
}