package printingPatterns;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        printing(n);

    }

    public static void printing(int n) {
        int star = 1;
        int row = 1;

        while (row <= 2 * n - 1) {

            //STAR
            int val = 1;
            int i = 1;
            if (val <= n)
                val = row;
            else
                val -= 1;
//                val = row - 1;
            while (i <= star) {
                if (i % 2 == 0)
                    System.out.print("*" + "\t");
                else
                    System.out.print(val + "\t");
                ++i;
            }
            if (row < n) {
                row += 1;
                star += 2;
            } else {
                row += 1;
                star -= 2;
            }
            System.out.println();
        }
    }
}
