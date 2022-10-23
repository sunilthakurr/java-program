package printingPatterns;

//*****
//        ****
//             ***
//                 **
//                    *
//                 **
//             ***
//        ****
//*****

import java.util.Scanner;

class ArrowPattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        arrow(n);
    }

    public static void arrow(int n) {

        int row = 1;
        int space = 0;
        int star = n;
//        n = 2 * n - 1;

        while (row <= 2 * n - 1) {

            //SPACE
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                ++i;
            }

            // STAR
            int j = 1;
            while (j <= star) {
                System.out.print("*");
                ++j;
            }
            if (row < n) {
                row += 1;
                space += 2;
                star -= 1;
            } else {
                row += 1;
                space -= 2;
                star += 1;
            }
            System.out.println();
        }
    }
}