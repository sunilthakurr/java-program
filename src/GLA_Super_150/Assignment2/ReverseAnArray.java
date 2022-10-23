package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int si = 0;
        int ei = N - 1;

        while (si <= ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            ++si;
            --ei;
        }
        for (int i = 0; i < N; ++i) {
            System.out.println(arr[i]);
        }

    }
}
