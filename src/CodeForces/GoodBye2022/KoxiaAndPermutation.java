package CodeForces.GoodBye2022;

import java.util.Scanner;

public class KoxiaAndPermutation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int N = obj.nextInt();
            int K = obj.nextInt();
            int temp = N;
            int j = 1;
            for (int i = 0; i < N; ++i) {
                if (i % 2 == 0) {
                    System.out.print(temp-- + " ");
                } else {
                    System.out.print(j++ + " ");
                }
            }
            System.out.println();
        }
    }
}
