/**
* @author Jaedan Blechinger
*/

import java.util.Scanner;

public class trapezoid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        *
        *Excercise 1 - Trapezoid
        */

        System.out.print("Enter the top length of a trapezoid: ");
        double top = in.nextInt();
        System.out.print("Enter the bottom length of a trapezoid: ");
        double bottom= in.nextInt();
        System.out.print("Enter the height of a trapezoid: ");
        double trapHeight= in.nextInt();
        double trapArea = ((top + bottom) / 2 ) * trapHeight;

        System.out.printf("\n%s %,.1f%s\n", "The area of the trapezoid is", trapArea, ".");
        in.close();
    }
}
