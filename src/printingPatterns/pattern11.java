package printingPatterns;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        print(n);

    }

    public static void print(int n) {
        int star = 1;
        int space = n - 1;
        int row = 1;

        while (row <= n) {

            //SPACE
            int i = 0;
            while (i <= space) {
                System.out.print("  ");
                ++i;
            }
            //STAR
            int j = 0;
            while (j <= star) {
                if (j % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                ++j;
            }
            space -= 1;
            star += 2;
            row++;
            System.out.println();
        }
    }
}
