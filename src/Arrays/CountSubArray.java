package Arrays;

import java.util.Scanner;

//LeetCode 713
public class CountSubArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        System.out.println(CountSubArr(arr, k));


    }

    public static int CountSubArr(int[] arr, int k) {
        int ans = 0;
        int si = 0;
        int ei = 0;
        int p = 1;

        while (ei < arr.length) {
            // grow
            p *= arr[ei];

            //shrink
            while (p >= k && si <= ei) {
                p /= arr[si];
                ++si;
            }
            ans += (ei - si + 1);
            ei++;


        }
        return ans;
    }
}
