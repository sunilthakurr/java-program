package printingPatterns;

import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        triangle(n);

    }

    public static void triangle(int n) {
        int star = 1;
        int space = n - 1;
        int row = 1;


        while (row <= n) {

            //   SPACE
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                ++i;
            }
            //   STAR
            int j = 1;
            int val = row;
            while (j <= star) {
                System.out.print(val + " ");
                if (j <= star / 2)
                    val++;
                else
                    val--;
                ++j;
            }
            space -= 1;
            star += 2;
            row += 1;
            System.out.println();
        }
    }
}
