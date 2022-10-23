package GLA_Super_150.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0And1 {
    public static void main(String[] args) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}

