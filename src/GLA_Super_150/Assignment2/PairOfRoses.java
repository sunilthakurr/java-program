package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int k = 0; k < T; ++k) {
            int N = obj.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; ++i) {
                arr[i] = obj.nextInt();
            }
            int amt = obj.nextInt();
            int dif = Integer.MAX_VALUE;
            int first = 0;
            int second = 0;
            for (int i = 0; i < N; ++i) {
                for (int j = i + 1; j < N; ++j) {
                    if (arr[i] + arr[j] == amt) {
                        if (Math.abs(arr[i] - arr[j]) < dif) {
                            first = arr[i];
                            second = arr[j];
                            dif = Math.abs(arr[i] - arr[j]);
                        }

                    }

                }
            }
            if (first < second)
                System.out.println("Deepak should buy roses whose prices are " + first + " and " + second + ".");
            else
                System.out.println("Deepak should buy roses whose prices are " + second + " and " + first + ".");

        }
    }
}