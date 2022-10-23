package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        long[] lp = new long[n];
        long[] rp = new long[n];
        lp[0] = 1;
        for (int i = 1; i < lp.length; i++) {
            lp[i] = arr[i - 1] * lp[i - 1];
        }
        rp[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            rp[i] = arr[i + 1] * rp[i + 1];
        }
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            ans[i] = lp[i] * rp[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}