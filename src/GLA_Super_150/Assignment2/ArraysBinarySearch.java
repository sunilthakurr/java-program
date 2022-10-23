package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int target = obj.nextInt();
        System.out.println(binarySearch(arr, target));

    }

    public static int binarySearch(int[] arr, int target) {
        int len = arr.length;
        int si = 0;
        int ei = len;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }
}
