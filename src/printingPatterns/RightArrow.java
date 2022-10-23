package printingPatterns;

import java.util.Scanner;

public class RightArrow {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        printing(n);
    }

    public static void printing(int n) {
        int star = n;
        int space = n - 1;
        int row = 1;

        while (row <= 2 * n - 1) {

            // SPACE
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                ++i;
            }
            // STAR
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                ++j;
            }
            if (row < n) {
                space -= 1;
                star -= 1;
            } else {
                space += 1;
                star += 1;
            }
            row += 1;
            System.out.println();
        }
    }
}
