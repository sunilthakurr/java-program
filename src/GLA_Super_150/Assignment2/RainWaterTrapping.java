package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int a = 0; a < T; ++a) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int[] left = new int[n];
            int[] right = new int[n];

            left[0] = arr[0];
            for (int i = 1; i < left.length; i++) {
                left[i] = Math.max(arr[i], left[i - 1]);
            }

            right[n - 1] = arr[n - 1];
            for (int i = right.length - 2; i >= 0; i--) {
                right[i] = Math.max(arr[i], right[i + 1]);
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Math.min(left[i], right[i]) - arr[i];
            }

            System.out.println(sum);
        }
    }
}