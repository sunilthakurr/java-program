package CodeForces;

import java.util.Scanner;

public class TheUltimateSquare {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            long N = obj.nextInt();
            long temp = N / 2;
            if (N % 2 == 0) {
                System.out.println(temp);
            } else {
                System.out.println(temp + 1);
            }
        }
    }
}
