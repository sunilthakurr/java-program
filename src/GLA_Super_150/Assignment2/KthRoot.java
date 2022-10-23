package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class KthRoot {
    public static void main(String[] args) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            long N = obj.nextLong();
            long K = obj.nextLong();
            System.out.println(kthroot(N, K));
        }
    }

    static long kthroot(long n, long k) {
        long s = 1;
        long e = n;
        long ans = 0;
        while (s <= e) {
            long mid = s + (e - s) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}


