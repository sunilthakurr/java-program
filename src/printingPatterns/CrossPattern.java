// cross print

//    *       *
//      *   *
//        *
//      *   *
//   *        *

import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Pattern8(n);

    }

    public static void Pattern8(int n) {

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j || (i + j) == n - 1)
                    System.out.print("*");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}
//hello everyone i'm sunil kumar from samastipur
