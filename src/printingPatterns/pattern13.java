package printingPatterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        printing(n);

    }

    public static void printing(int n) {
        int space = 0;
        int star = 1;
        int row = 1;

        while (row <= 2 * n - 1) {

            //STAR
            int i = 1;
            while (i <= star) {
                System.out.print("*");
                ++i;
            }
            if (row < n)
                star += 1;

            else
                star -= 1;
            row += 1;
            System.out.println();
        }
    }
}
