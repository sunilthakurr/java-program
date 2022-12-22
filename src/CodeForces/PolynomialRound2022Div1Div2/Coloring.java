package CodeForces.PolynomialRound2022Div1Div2;

import java.util.Scanner;

public class Coloring {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int N = obj.nextInt();
            int M = obj.nextInt();
            int K = obj.nextInt();
            int[] arr = new int[M];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < M; ++i) {
                arr[i] = obj.nextInt();
                if (arr[i] > max)
                    max = arr[i];
            }
            long result = ((long) max * K) - (K - 1);
            if (N >= result)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

