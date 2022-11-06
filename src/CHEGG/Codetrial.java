package CHEGG;

import java.util.Scanner;

class Codetrial {
    public static void main(String[] args) throws java.lang.Exception {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            double s1 = (double) A / X;
            double s2 = (double) B / Y;
            if (s1 < s2)


                System.out.println("Ajey");
            else if (s1 > s2)
                System.out.println("Yash");
            else
                System.out.println("Both");
            T--;
        }
    }
}
